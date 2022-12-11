package com.techelevator.dao;

import com.techelevator.model.Tournament;
import com.techelevator.model.User;
import com.techelevator.security.UserModelDetailsService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


import java.security.Principal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcTournamentDao implements TournamentDao {

    private final JdbcTemplate jdbcTemplate;
    UserDao userDao;
    public JdbcTournamentDao(JdbcTemplate jdbcTemplate, UserDao userDao) {
        this.jdbcTemplate = jdbcTemplate;
        this.userDao = userDao;
    }

    @Override
    public List<Tournament> findAll() {
        List<Tournament> tournaments = new ArrayList<>();
        String sql = "SELECT * FROM tournament";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Tournament tournament = mapRowToTournament(results);
            tournaments.add(tournament);
        }
        return tournaments;




    }

    @Override
    public Tournament getTournamentById(int tournamentId) {

        String sql = "SELECT * FROM tournament WHERE tournament_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, tournamentId);
        if (results.next()) {
            return mapRowToTournament(results);
        } else {
            return null;
        }
    }

    @Override
    public void createTournament(Tournament tournament, Principal principal) {
        //adding new tournament to tournament table
        String sqlAddToTournamentTable = "INSERT INTO tournament(tournament_name, tournament_date, max_number_of_participants) VALUES (?, ?, ?);";
        jdbcTemplate.update(sqlAddToTournamentTable, tournament.getTournamentName(), tournament.getTournamentDate(), tournament.getMaxNumberOfParticipants());

        //getting the id of the tournament we just created
        String sqlFindTournamentId = "SELECT tournament_id from tournament where tournament_name = ?";
        int tournamentId = jdbcTemplate.queryForObject(sqlFindTournamentId, int.class, tournament.getTournamentName());

        //adding current user id and tournament id to user_tournament table
        int organizerId = userDao.findIdByUsername(principal.getName());
        String sql = "INSERT INTO organizer_tournament(organizer_id, tournament_id) VALUES (?, ?);";
        jdbcTemplate.update(sql, organizerId, tournamentId);

        //After we add a new tournament, we will need to populate "game"
        String sqlAddGames = "INSERT INTO game(tournament_id, game_number) VALUES (?,?);";
        for(int i=1; i<=tournament.getMaxNumberOfParticipants(); i++){
            jdbcTemplate.update(sqlAddGames, tournamentId, i);
        }
    }

    @Override
    public void updateTournament(int tournamentId, Tournament tournament) {
        String sql = "UPDATE tournament " +
                "SET tournament_name=?, tournament_date=?, current_number_of_participants=? " +
                "WHERE tournament_id=?;";


        jdbcTemplate.update(sql, tournament.getTournamentName(), tournament.getTournamentDate(), tournament.getCurrentNumberOfParticipants(), tournamentId);
    }

    @Override
    public List<Tournament> searchByTournamentName(String search) {
        List<Tournament> tournaments = new ArrayList<>();
        String sql = "SELECT * FROM tournament WHERE tournament_name ILIKE ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, "%"+search+ "%");
        while(results.next()) {
            Tournament tournament = mapRowToTournament(results);
            tournaments.add(tournament);
        }
        return tournaments;

    }





    private Tournament mapRowToTournament(SqlRowSet rs) {
        Tournament tournament = new Tournament();
        tournament.setMaxNumberOfParticipants(rs.getInt("max_number_of_participants"));
        tournament.setTournamentDate(rs.getDate("tournament_date").toLocalDate());
        tournament.setTournamentId(rs.getInt("tournament_id"));
        tournament.setTournamentName(rs.getString("tournament_name"));
        tournament.setCurrentNumberOfParticipants(rs.getInt("current_number_of_participants"));
        return tournament;
    }




}

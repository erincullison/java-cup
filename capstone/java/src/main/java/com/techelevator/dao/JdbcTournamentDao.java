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

    @Override
    public void addUserToTournament(int tournamentId, Principal principal) {
        //increases current number of participants by 1
         String sql = "UPDATE tournament " +
                "SET current_number_of_participants = current_number_of_participants + 1 " +
                "WHERE tournament_id=?";
        jdbcTemplate.update(sql, tournamentId);

        //add user to the user_tournaments table
        int userId = userDao.findIdByUsername(principal.getName());
        String sqlAddToUserTournament = "INSERT INTO user_tournament(user_id, tournament_id) VALUES (?, ?);";
        jdbcTemplate.update(sqlAddToUserTournament, userId, tournamentId);


    }

    //adding a method to get the list of users for the initial round of the tournament bracket
    @Override
    public List<User> getUsersByTournamentId(int tournamentId) {
        List<User> users = new ArrayList<>();
        String sql = "select user_tournament.user_id, users.username from user_tournament join users on users.user_id = user_tournament.user_id where tournament_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, tournamentId);
        while(results.next()) {
            User user = mapRowToUser(results);
            users.add(user);
        }
        return users;
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

    private User mapRowToUser(SqlRowSet rs) {
        User user = new User();
        user.setUsername(rs.getString("username"));
        user.setId(rs.getInt("user_id"));
        return user;
    }




}

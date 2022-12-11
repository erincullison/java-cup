package com.techelevator.dao;

import com.techelevator.model.Game;
import com.techelevator.model.Tournament;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcGameDao implements GameDao{

    private final JdbcTemplate jdbcTemplate;
    TournamentDao tournamentDao;

    public JdbcGameDao(JdbcTemplate jdbcTemplate, TournamentDao tournamentDao) {
        this.jdbcTemplate = jdbcTemplate;
        this.tournamentDao = tournamentDao;
    }


    //one flaw in my logic here:
    // when adding a name_id to the game table, we will in all participant_one for the first round before adding any to participant_two
    @Override
    public void addParticipantToTournament(int tournamentId, String name) {
        //adding name to name table
        String sqlAddToNameTable = "BEGIN TRANSACTION; INSERT INTO participant_name(name) VALUES (?); COMMIT TRANSACTION";
        jdbcTemplate.update(sqlAddToNameTable, name);

        //getting the id of the name we just created
        String sqlGetNameId = "SELECT name_id from participant_name where name = ?";
        int nameId = jdbcTemplate.queryForObject(sqlGetNameId, int.class, name);

        //now we need to add the nameId to the first open spot in a tournament... this is going to be trickier.
        /* Here's my thought process so far:

        Example sql statement for finding empty spots:
        SELECT game_id, tournament_id, game_number, participant_one, participant_two   //probably don't need all these properties)
	        FROM game
	        WHERE tournament_id = ? AND game_number <= ? (participant_one IS NULL OR participant_two IS NULL);

	    The where statement on game number will check whether game_number <= maxNumberOfParticipants / 2. This will check whether the game is part of the first round

	    We'll need to pull at least the game_id and the values in both participant slots. The values in each slot are important because
	    we need to know which value was null, and therefore which column to insert nameId from above.

	    If we use the sql query above:

	    Game game = mapRowToGame(results);
	    if(game.participant_one==0) //can't be null since its an int, should default to zero if empty. Since name_id is serial, 0 shouldnt be a valid option
	        Sent update sql query to change participant_one to name_id
        else
            update to change participant_two to name_id

	        I think this is starting to make sense, gonna try it



	        Update: this *technically* works. Right now, my logic is set up so that the name_id is added to the first open slot, but it checks slot 1 for every gme before


         */

        Tournament currentTournament = tournamentDao.getTournamentById(tournamentId);
        String sqlFindEmptySpots = "SELECT * FROM game  WHERE tournament_id = ? AND game_number <= ? AND (participant_one IS NULL OR participant_two IS NULL);";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindEmptySpots, tournamentId, (currentTournament.getMaxNumberOfParticipants()/2));
        if(results.next()) {
            Game game = mapRowToGame(results);
            if (game.getParticipantOne() == 0) {
                String sqlAddToParticipantOne = "UPDATE game SET participant_one=? WHERE game_id = ?;";
                jdbcTemplate.update(sqlAddToParticipantOne, nameId, game.getGameId());
            } else {
                String sqlAddToParticipantTwo = "UPDATE game SET participant_two=? WHERE game_id = ?;";
                jdbcTemplate.update(sqlAddToParticipantTwo, nameId, game.getGameId());
            }

            //lastly, we need to update current number of participants in Tournament.

            String sqlIncreaseCountInTournament = "UPDATE tournament " +
                    "SET current_number_of_participants = current_number_of_participants + 1 " +
                    "WHERE tournament_id=?";
            jdbcTemplate.update(sqlIncreaseCountInTournament, tournamentId);
        }

    }

    private Game mapRowToGame(SqlRowSet rs) {
        Game game = new Game();
        game.setGameId(rs.getInt("game_id"));
        game.setTournamentId(rs.getInt("tournament_id"));
        game.setGameNumber(rs.getInt("game_number"));
        game.setParticipantOne(rs.getInt("participant_one"));
        game.setParticipantTwo(rs.getInt("participant_two"));
        return game;
    }
}

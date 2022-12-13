package com.techelevator.dao;

import com.techelevator.model.Game;

import java.util.List;

public interface GameDao {
    void addParticipantToTournament(int tournamentId, String name);
    List<Game> getGamesByTournamentId(int tournamentId);
}

package com.techelevator.dao;

import java.util.List;

public interface GameDao {
    void addParticipantToTournament(int tournamentId, String name);
    List<String> getParticipantNamesByTournamentId(int tournamentId);
}

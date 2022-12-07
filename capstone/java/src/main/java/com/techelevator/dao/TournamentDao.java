package com.techelevator.dao;

import com.techelevator.model.Tournament;
import com.techelevator.model.User;

import java.time.LocalDate;
import java.util.List;

public interface TournamentDao {
    List<Tournament> findAll();

    Tournament getTournamentById(int tournamentId);
    void createTournament(Tournament tournament);
    void updateTournament(int tournamentId, Tournament tournament);
    List<Tournament> searchByTournamentName(String search);
    List<Tournament> getTournamentsByOrganizerId(int organizerId);

}

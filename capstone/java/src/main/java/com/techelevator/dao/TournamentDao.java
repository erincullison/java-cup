package com.techelevator.dao;

import com.techelevator.model.Tournament;
import com.techelevator.model.User;

import java.util.List;

public interface TournamentDao {
    List<Tournament> findAll();

    Tournament getTournamentById(int tournamentId);
    Tournament createTournament(Tournament tournament);
}

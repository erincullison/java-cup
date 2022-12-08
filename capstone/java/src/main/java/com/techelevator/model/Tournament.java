package com.techelevator.model;

import java.time.LocalDate;
import java.util.Date;

public class Tournament {
    private int tournamentId;
    private String tournamentName;
    private LocalDate tournamentDate;
    private int maxNumberOfParticipants;
    private int currentNumberOfParticipants;


    public Tournament() {
    }

    public Tournament(int tournamentId, String tournamentName, LocalDate tournamentDate, int maxNumberOfParticipants, int currentNumberOfParticipants) {
        this.tournamentId = tournamentId;
        this.tournamentName = tournamentName;
        this.tournamentDate = tournamentDate;
        this.maxNumberOfParticipants = maxNumberOfParticipants;
        this.currentNumberOfParticipants = currentNumberOfParticipants;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public LocalDate getTournamentDate() {
        return tournamentDate;
    }

    public void setTournamentDate(LocalDate tournamentDate) {
        this.tournamentDate = tournamentDate;
    }

    public int getMaxNumberOfParticipants() {
        return maxNumberOfParticipants;
    }

    public void setMaxNumberOfParticipants(int maxNumberOfParticipants) {
        this.maxNumberOfParticipants = maxNumberOfParticipants;
    }

    public int getCurrentNumberOfParticipants() {
        return currentNumberOfParticipants;
    }

    public void setCurrentNumberOfParticipants(int currentNumberOfParticipants) {
        this.currentNumberOfParticipants = currentNumberOfParticipants;
    }
}

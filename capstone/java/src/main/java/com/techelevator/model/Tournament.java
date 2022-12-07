package com.techelevator.model;

import java.time.LocalDate;
import java.util.Date;

public class Tournament {
    private int tournamentId;
    private String tournamentName;
    private LocalDate tournamentDate;
    private int numberOfParticipants;

    public Tournament(int tournamentId, String tournamentName, LocalDate tournamentDate, int numberOfParticipants) {
        this.tournamentId = tournamentId;
        this.tournamentName = tournamentName;
        this.tournamentDate = tournamentDate;
        this.numberOfParticipants = numberOfParticipants;
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

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }
}

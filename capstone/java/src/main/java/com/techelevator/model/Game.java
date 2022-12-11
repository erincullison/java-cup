package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {
    @JsonProperty("game_id")
    private int gameId;
    @JsonProperty("tournament_id")
    private int tournamentId;
    @JsonProperty("game_number")
    private int gameNumber;
    @JsonProperty("participant_one")
    private int participantOne;
    @JsonProperty("participant_two")
    private int participantTwo;


    public Game(int gameId, int tournamentId, int gameNumber, int participantOne, int participantTwo) {
        this.gameId = gameId;
        this.tournamentId = tournamentId;
        this.gameNumber = gameNumber;
        this.participantOne = participantOne;
        this.participantTwo = participantTwo;
    }

    public Game() {
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public int getParticipantOne() {
        return participantOne;
    }

    public void setParticipantOne(int participantOne) {
        this.participantOne = participantOne;
    }

    public int getParticipantTwo() {
        return participantTwo;
    }

    public void setParticipantTwo(int participantTwo) {
        this.participantTwo = participantTwo;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }
}

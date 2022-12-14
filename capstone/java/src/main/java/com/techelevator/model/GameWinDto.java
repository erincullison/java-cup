package com.techelevator.model;

public class GameWinDto {

    private int tournament_id;
    private String name;
    private int current_game;
    private int next_game;

    public GameWinDto() {
    }

    public GameWinDto(int tournament_id, String name, int current_game, int next_game) {
        this.tournament_id = tournament_id;
        this.name = name;
        this.current_game = current_game;
        this.next_game = next_game;
    }

    public int getTournament_id() {
        return tournament_id;
    }

    public void setTournament_id(int tournament_id) {
        this.tournament_id = tournament_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrent_game() {
        return current_game;
    }

    public void setCurrent_game(int current_game) {
        this.current_game = current_game;
    }

    public int getNext_game() {
        return next_game;
    }

    public void setNext_game(int next_game) {
        this.next_game = next_game;
    }
}

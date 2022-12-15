package com.techelevator.controller;

import com.techelevator.dao.GameDao;
import com.techelevator.dao.TournamentDao;
import com.techelevator.model.Game;
import com.techelevator.model.GameWinDto;
import com.techelevator.model.Tournament;
import com.techelevator.model.User;
import org.apache.tomcat.jni.Local;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.security.Principal;
import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
//@PreAuthorize("isAuthenticated()") Maybe take it off?
public class TournamentController {
    private TournamentDao tournamentDao;
    private GameDao gameDao;

    public TournamentController(TournamentDao tournamentDao, GameDao gameDao) {
        this.tournamentDao = tournamentDao;
        this.gameDao = gameDao;
    }

    //the following three methods should be accessible to any user without signing in

    @RequestMapping (path = "tournaments/{tournamentId}", method= RequestMethod.GET)
    public Tournament getTournamentById(@PathVariable int tournamentId) {
        return tournamentDao.getTournamentById(tournamentId);
    }

    @RequestMapping (path = "tournaments", method= RequestMethod.GET)
    public List<Tournament> getTournamentsByName(@RequestParam(value="title_like", defaultValue = "") String search){
        return tournamentDao.searchByTournamentName(search);
    }






    //this method should be accessible only to users with ROLE_ORGANIZER
    @PreAuthorize("hasRole('ROLE_ORGANIZER')")
    @ResponseStatus (HttpStatus.CREATED)
    @RequestMapping(path = "create", method = RequestMethod.POST)
    public void createTournament(@RequestBody Tournament tournament, Principal principal){
        tournamentDao.createTournament(tournament, principal);
    }


    //this method should be accessible only to the organizer who created the tournament
   // @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus (HttpStatus.CREATED)
    @RequestMapping(path = "tournaments/{tournamentId}", method= RequestMethod.PUT)
    public void updateTournament(@PathVariable int tournamentId, @RequestBody Tournament tournament){
        tournamentDao.updateTournament(tournamentId, tournament);
    }


    //adding signup method
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path ="tournaments/{tournamentId}", method = RequestMethod.POST)
    public void addParticipantToTournament(@PathVariable int tournamentId, @RequestBody String name){
        gameDao.addParticipantToTournament(tournamentId, name);
    }

    @RequestMapping(path="tournaments/{tournamentId}/games", method = RequestMethod.GET)
    public List<Game> getGamesByTournamentId(@PathVariable int tournamentId){
        return gameDao.getGamesByTournamentId(tournamentId);
    }


    //attempts at winning functionality:
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path ="win", method = RequestMethod.POST)
    public void winGame(@RequestBody GameWinDto gameWinDto){
        gameDao.winGame(gameWinDto);
    }

    //getting the organizer id so we can use it to restrict access for winning buttons:
    @RequestMapping(path="tournaments/{tournamentId}/organizer", method = RequestMethod.GET)
    public int getOrganizerIdByTournamentId(@PathVariable int tournamentId){
        return tournamentDao.getOrganizerIdByTournamentId(tournamentId);
    }



}

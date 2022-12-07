package com.techelevator.controller;

import com.techelevator.dao.TournamentDao;
import com.techelevator.model.Tournament;
import org.apache.tomcat.jni.Local;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@RestController
public class TournamentController {
    private TournamentDao tournamentDao;

    public TournamentController(TournamentDao tournamentDao) {
        this.tournamentDao = tournamentDao;
    }


    //the following two methods should be accessible to any user without signing in
    @RequestMapping (path = "tournaments", method= RequestMethod.GET)
    public List<Tournament> getTournaments() {return tournamentDao.findAll();}

    @RequestMapping (path = "tournaments/{tournamentId}", method= RequestMethod.GET)
    public Tournament getTournaments(@PathVariable int tournamentId) {
        return tournamentDao.getTournamentById(tournamentId);
    }


    //this method should be accessible only to users with ROLE_ORGANIZER
    @ResponseStatus (HttpStatus.CREATED)
    @RequestMapping(path = "create", method = RequestMethod.POST)
    public void createTournament(@RequestBody Tournament tournament){
        tournamentDao.createTournament(tournament);
    }


    //this method should be accesible only to the organizer who created the tournament
    @ResponseStatus (HttpStatus.CREATED)
    @RequestMapping(path = "tournaments/{tournamentId}", method= RequestMethod.PUT)
    public void updateTournament(@PathVariable int tournamentId, @RequestBody Tournament tournament){
        tournamentDao.updateTournament(tournamentId, tournament);
    }




}

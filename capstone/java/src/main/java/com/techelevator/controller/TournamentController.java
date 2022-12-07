package com.techelevator.controller;

import com.techelevator.dao.TournamentDao;
import com.techelevator.model.Tournament;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class TournamentController {
    private TournamentDao tournamentDao;

    public TournamentController(TournamentDao tournamentDao) {
        this.tournamentDao = tournamentDao;
    }

    @RequestMapping (path = "tournaments", method= RequestMethod.GET)
    public List<Tournament> getTournaments() {return tournamentDao.findAll();}

    @RequestMapping (path = "tournaments/{tournamentId}", method= RequestMethod.GET)
    public Tournament getTournaments(@PathVariable int tournamentId) {
        return tournamentDao.getTournamentById(tournamentId);
    }

    @ResponseStatus (HttpStatus.CREATED)
    @RequestMapping(path = "create", method = RequestMethod.POST)
    public Tournament createTournament(@RequestBody Tournament newTournament){
        Tournament tournament = tournamentDao.createTournament(newTournament);
        if(tournament == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Unable to create tournament, please try again");
        } else {
            return tournament;
        }
    }




}

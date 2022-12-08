package com.techelevator.controller;

import com.techelevator.dao.TournamentDao;
import com.techelevator.model.Tournament;
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

    public TournamentController(TournamentDao tournamentDao) {
        this.tournamentDao = tournamentDao;
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

    //NEEDS UPDATE METHOD FOR USERS TO SIGN UP AND UPDATE COUNT

    //NEED TO ADD METHOD TO UPDATE USER AND ORGANIZER JOIN TABLES WHEN CREATING/SIGNING UP -probably in dao



}

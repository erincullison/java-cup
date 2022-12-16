import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

/*
 * The authorization header is set for axios when you login but what happens when you come back or
 * the page is refreshed. When that happens you need to check for the token in local storage and if it
 * exists you should set the header so that it will be attached to each request
 */
const currentToken = localStorage.getItem('token')
const currentUser = JSON.parse(localStorage.getItem('user'));

if(currentToken != null) {
  axios.defaults.headers.common['Authorization'] = `Bearer ${currentToken}`;
}

export default new Vuex.Store({
  state: {
    token: currentToken || '',
    user: currentUser || {},

    //TOURNAMENTS ARRAY -- list from DB
    tournaments: null,
    games: [
      {
        game_id: null,
        tournament_id: null,
        game_number: null,
        participant_one: '',
        participant_two: ''
        
        

      }
    ]

  },
  mutations: {
    SET_AUTH_TOKEN(state, token) {
      state.token = token;
      localStorage.setItem('token', token);
      axios.defaults.headers.common['Authorization'] = `Bearer ${token}`
    },
    SET_USER(state, user) {
      state.user = user;
      localStorage.setItem('user',JSON.stringify(user));
    },
    LOGOUT(state) {
      localStorage.removeItem('token');
      localStorage.removeItem('user');
      state.token = '';
      state.user = {};
      axios.defaults.headers.common = {};
    },
    // adding tournament mutations here
    SET_TOURNAMENTS(state, data) {
      state.tournaments = data;
    },
    SET_ACTIVE_TOURNAMENT(state, data) {
      state.currentTournament = data;
    },

    //NEW MUTATIONS FOR WORKING TOURNEY ID AND DETAILS - NEEDS REVIEW
    SET_CURRENT_TOURNAMENT_ID(state, data) {
      state.currentTourneyId = data;
    },
    SET_CURRENT_TOURNAMENT_DETAILS(state, data) {
      state.currentTourneyDetails = data;
    },
    SET_GAMES(state, data) {
      state.games = data;
    }


    
    // DELETE_TOURNAMENT(state, id) {
    //   state.currentTournament.splice(
    //     state.tournaments.findIndex(tournament => tournament.id === id),
    //   )
    //},
    
  }
})

import axios from 'axios';

// const http = axios.create({
//   baseURL: "http://localhost:9000"
// });

export default {
  list() {
    return axios.get('/tournaments');
  },
  get(id) {
    return axios.get(`/tournaments/${id}`);
  },
  create(tournament) {
    return axios.post('/create', tournament)
  },
  update(tournamentId, tournament) {
    return axios.put(`/tournaments/${tournamentId}`, tournament);
  },
  delete(tournamentID) {
    return axios.delete(`/tournaments/${tournamentID}`);
  },
  join(tournamentId, participant_name) {
    return axios.post(`/tournaments/${tournamentId}`, participant_name);
  },
  listGames(tournamentId){
    return axios.get(`/tournaments/${tournamentId}/games`);
  }
}
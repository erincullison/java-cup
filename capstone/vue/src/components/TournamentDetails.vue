<template>
  <div class="tournament-details">
      <section class="top-section">
        <h1>Tournament Name:<br><br>{{ tournament.tournament_name }}</h1>
        <h2>Date of Tournament:<br><br>{{ tournament.tournament_date }}</h2>
      </section>
      
      <h3>Current # of Participants: {{ tournament.current_number_of_participants }} / 
          {{ tournament.max_number_of_participants }}</h3>
    <button v-on:click='joinTournament' v-bind:disabled="tournament.current_number_of_participants=== tournament.max_number_of_participants">Join Tournament</button>
    <!-- ADD BELOW THE DIFFERENT BRACKETS -->
    <section v-if="tournament.max_number_of_participants === 8">
        <bracket-eight />
    </section>
    <section v-if="tournament.max_number_of_participants === 4">
        <bracket-four />
    </section>
    <section v-if="tournament.max_number_of_participants === 16">
        <bracket-sixteen />
    </section>

  </div>
</template>

<script>
import apiService from '../services/apiService'
import BracketEight from '../components/BracketEight.vue'
import BracketFour from './BracketFour.vue'
import BracketSixteen from './BracketSixteen.vue'


export default {
  components: { BracketEight, BracketFour, BracketSixteen },
    name: 'tournament-details',
    data() {
        return {
            //this tournament object will hold data for the current tournament, updated during created()
            //replaces currentTournament that we previously had in the store
            tournament: {
                tournament_id: 0,
                tournament_name: '',
                tournament_date: '',
                current_number_of_participants: 0,
                max_number_of_participants: 0
            }
        }


                                                                    
        
    },
    

    methods: {


        joinTournament(){
            this.$router.push({name: 'join-tournament', params: {id: this.$route.params.id}});
        }
        
    },
    

    created() {
        //calls axios method, passing the id from route params, and returns a tournament object JSON
        apiService.get(this.$route.params.id).then((response) => {
            this.tournament = response.data;
        });
        //this tournament id might have already been updated in the above call but I added directly from the route params to be safe.
        this.tournament_id = this.$route.params.id;

        //updating games based on currently viewed tournament
        apiService.listGames(this.$route.params.id).then(response => {
                this.$store.commit("SET_GAMES", response.data)
            })
    }
    

}
</script>

<style>

.top-section {
    display: flex;
}

h1 {
    flex-basis: 50%;
    
}

h2 {
    flex-basis: 50%;
    
}




</style>
<template>
  <div class="tournament-details">
      <h1>{{ this.$store.state.CurrentTourneyDetails.tournament_name }}</h1>
      <h2>{{ this.$store.state.CurrentTourneyDetails.tournament_date }}</h2>
      <h3>{{ this.$store.state.CurrentTourneyDetails.current_number_of_participants }} / 
          {{ this.$store.state.CurrentTourneyDetails.max_number_of_participants }}</h3>
  </div>
</template>

<script>
import apiService from '../services/apiService'
export default {
    name: 'tournament-details',
    data() {
        return {
            testTournament: {
                //PUT MOCK PROPERTIES HERE FOR TESTING
            },

            // tournament: this.$store.state.CurrentTourneyDetails,

            currentTourneyId: this.$store.state.currentTourneyId,  //THIS DOESN'T WORK??
                                                                    //NEED TO ACCESS STORE DIFFERENTLY
        }
    },

    props: [],

    methods: {
        //tried this set the current tourney object ??
        getCurrentTourneyDetails(currentTourneyId) {
            apiService.get(currentTourneyId).then(response => {
                this.$store.commit("SET_CURRENT_TOURNAMENT_DETAILS", response.data);
            });
        },
    },

    created() {
        this.getCurrentTourneyDetails;
    }

}
</script>

<style>

</style>
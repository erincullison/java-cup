<template>
  <div class="tournament-details">
    <h1>Tournament Details</h1>

    <!-- <div class="first-line-details">
      <div> {{ tournament.tournament_name }} </div>
      <div> {{ tournament.current_number_of_participants }} </div>
      <div> {{ tournament.max_number_of_participants }} </div>          needs correct passing to display
    </div>
    <div class="second-line-details">
      <div>Organizer</div>
      <div> {{ tournament.tournament_date }} </div>
      <button v-if="tournament.current_number_of_participants < tournament.max_number_of_participants" v-on:click="signup(tournament.tournament_id)">Details</button>
    </div> -->

  </div>
</template>

<script>
import apiService from '../services/apiService'

export default {
  name: 'details-view',
  props: {
    tournamentId: Number  //this is probably wrong
  },

  methods: {

  },

  created() {
    apiService.get() //THIS NEEDS ID PARAMETER FROM PASSING CURRENT TOURNAMENT
  }

}
</script>

<style>

</style>
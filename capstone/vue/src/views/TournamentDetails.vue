<template>
  <div class="tournament-details">
    <h1>Tournament Details</h1>
    <tournament-details />
    

  </div>
</template>

<script>
import TournamentDetails from '../components/TournamentDetails.vue'
// import apiService from '../services/apiService'

export default {
  name: 'details-view',
  components: { TournamentDetails },

  methods: {

  },

  created() {
    // apiService.get() //THIS NEEDS ID PARAMETER FROM PASSING CURRENT TOURNAMENT
  }

}
</script>

<style>

.tournament-details {
  text-align: center;
  font-size: 23px;
}


</style>
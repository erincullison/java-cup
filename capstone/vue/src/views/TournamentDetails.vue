<template>
  <div class="tournament-details">
    <h1 class='tournament-details-h1'>Tournament Details</h1>
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
    document.title = "Java Cup - Tournament Details"
  
  }

}
</script>

<style>

.tournament-details {
  text-align: center;
}

.tournament-details-h1 {
  font-size: 50px;
  color: white;
  text-shadow: 1px -4px 0px black,
               -4px 1px 0px black,
               1px 1px 0px black,
               0px 0px 0px black;
               
}


</style>
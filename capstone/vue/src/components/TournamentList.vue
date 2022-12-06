<template>
  <div class="tournament-list">
      <div v-for="tournament in tournaments" v-bind:key="tournament.id" class="tournament"> <!-- DB needs to be created -->
        <!-- tournament details component...OR ... simple list of each tournament name -->
      </div>
  </div>
</template>

<script>
//IMPORT DETAILS COMPONENT HERE IF WE ARE USING COMPONENT TO BE LISTED

export default {
    name: 'tournament-list',
    data() {
        return {
            tournaments: [] //DOESN'T THIS NEED TO BE PULLED FROM STATE? VIA METHOD MAYBE? OR CREATED? API SERVICE TO PULL!!
        }
    },

    created() {
        //call apiService here
    }

}
</script>

<style>

</style>
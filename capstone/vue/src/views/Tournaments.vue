<template>
  <div>
    <h1>ACTIVE TOURNAMENTS</h1>
    <tournament-list />
  </div>  
  
</template>

<script>

import TournamentList from "../components/TournamentList.vue";

export default {
  name: 'tournaments-list',
  components: { TournamentList },

}
</script>

<style>

</style>
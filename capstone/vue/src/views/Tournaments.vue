<template>
  <div class="full-list">
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



.full-list {
  text-align: center;
  font-size: 25px;
}



</style>
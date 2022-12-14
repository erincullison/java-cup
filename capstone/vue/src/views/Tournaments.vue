<template>
  <div class="full-list">
    <h1 class='active-tournaments-h1'>ACTIVE TOURNAMENTS</h1>
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

.active-tournaments-h1 {
  color: white;
  text-shadow: 1px -4px 0px black,
               -4px 1px 0px black,
               1px 1px 0px black,
               0px 0px 0px black;
}

</style>
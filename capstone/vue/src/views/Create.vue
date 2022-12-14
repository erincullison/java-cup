<template>
  <div class="create-page">
      <h1 class='create-tournament-h1'>Create Tournament</h1>
      <add-tournament />
  </div>
</template>

<script>
import AddTournament from '../components/AddTournament.vue'
export default {
  components: { AddTournament },

}
</script>

<style>

.create-page {
  text-align: center;
}

.create-tournament-h1 {
  text-align: center;
  font-size: 70px;
  color: white;
  text-shadow: 1px -4px 0px black,
               -4px 1px 0px black,
               1px 1px 0px black,
               0px 0px 0px black;
}

</style>
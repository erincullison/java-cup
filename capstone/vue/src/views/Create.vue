<template>
  <div class="create-page">
      <h1 class='create-tournament-h1'>Create Tournament</h1>
      <add-tournament v-if="$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'"/>&nbsp;
      <h1 class ='notOrganizer' v-if="$store.state.user.authorities[0].name != 'ROLE_ORGANIZER'">Sorry, you need an organizer account to create tournaments</h1>
  </div>
</template>

<script>
import AddTournament from '../components/AddTournament.vue'
export default {
  components: { AddTournament },
  created(){
    document.title = "Java Cup - Create"
  }

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

.notOrganizer{
  text-align: center;
  font-size: 30px;
  color: black;
  
}

</style>
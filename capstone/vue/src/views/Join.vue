<template>
  <div class="join-page">
      <h1 class="join-tournament-h1">Join Tournament</h1>
      <join-tournament />
  </div>
</template>

<script>
import JoinTournament from '../components/JoinTournament.vue'
export default {
  components: {  JoinTournament },
  created(){
    document.title = "Java Cup - Join"
  }

}
</script>

<style>

.join-tournament-h1 {
  text-align: center;
  font-size: 50px;
  color: white;
  text-shadow: 1px -4px 0px black,
               -4px 1px 0px black,
               1px 1px 0px black,
               0px 0px 0px black;
}

</style>
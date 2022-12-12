<template>
  <div class="create-page">
      <h1>Create Tournament</h1>
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

</style>
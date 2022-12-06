<template>
  <div class="tournament-details">
      <h1>{{ tournament.name }}</h1>
      <h2>{{ tournament.date }}</h2>
      <h3>{{ tournament.currentNumberParticipants }} / {{ tournament.maxNumberParticipants }}</h3>
  </div>
</template>

<script>
export default {
    name: 'tournament-details',
    data() {
        return {
            tournament: {
                id: null,
                name: '',
                date: null,
                currentNumberParticipants: null, //should be created from join table?
                maxNumberParticipants: null,
            }
        }
    },

    created() {
        //CALL API SERVICE HERE TO PULL INDIVIDUAL TOURNAMENT BY ID
    }

}
</script>

<style>

</style>
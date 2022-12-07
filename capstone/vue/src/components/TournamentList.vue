<template>
  <div class="tournament-list">
      <table>
        <thead>
            <tr>
                <th>Tournament Name</th>&nbsp;|     &nbsp;
                <th>Date</th>&nbsp;|    &nbsp;
                <th>Open Spots</th>&nbsp;|  &nbsp;
                <th>Max Participants</th>&nbsp;|    &nbsp;
                <th>Sign Up</th>
            </tr>
        </thead>
        <tbody>
            <tr v-for="tournament in this.$store.state.tournaments" v-bind:key="tournament.id" class="tournament">
                <td class="name">{{ tournament.name }}</td>
                <td>{{ tournament.date }}</td>
                <td> Open Spots </td> <!-- this needs a method for open spots -->
                <td>{{ tournament.maxParticipants }}</td>
                <td>
                <button v-on:click="signup(tournament.id)">Sign Up</button>;
                </td>
            </tr>
        </tbody>
    </table>
        

      
  </div>
</template>


<script>
//IMPORT DETAILS COMPONENT HERE IF WE ARE USING COMPONENT TO BE LISTED
import apiService from "../services/apiService.js";

export default {
    name: 'tournament-list',
    data() {
        return {
            
        }
    },
    methods: {
        listTournaments() {
            apiService.list().then(response => {
                this.$store.commit("SET_TOURNAMENTS", response.data);
            });
    },
    // deleteTopic(id) {
    //   topicService.delete(id).then( response => { --- maybe add later
    //     if (response.status === 200) {
    //       this.getTopics();
    //     }
    //   });
    // }
    },
    created() {
        this.listTournaments();
     }


}
</script>

<style>

</style>
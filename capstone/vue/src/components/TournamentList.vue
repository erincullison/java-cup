<template>
  <div class="tournament-list">
      <table>
        <thead>
            <tr>
                <th>Tournament Name</th>&nbsp;|     &nbsp;
                <th>Open Spots</th>&nbsp;|  &nbsp;
                <th>Max Participants</th>&nbsp;|    &nbsp;
                <th>Date</th>&nbsp;|    &nbsp;
                <th>Sign Up</th>
            </tr>
        </thead>
        <tbody>
            <tr v-for="tournament in this.$store.state.tournaments" v-bind:key="tournament.tournament_id" v-bind:tournament="tournament" class="tournament">
                <td class="name">{{ tournament.tournament_name }}</td>&nbsp;|     &nbsp;
                <td> {{ tournament.current_number_of_participants }} </td>&nbsp;|     &nbsp;
                <td>{{ tournament.max_number_of_participants }}</td>&nbsp;|     &nbsp;
                <td>{{ tournament.tournament_date }}</td>&nbsp;|     &nbsp;
                <td>
                <button v-on:click="getDetails(tournament.tournament_id)">Details</button> 
                </td>
                <!-- THIS STILL NEEDS METHOD  -->
            </tr>
        </tbody>
    </table>
        <!--<button v-if="tournament.current_number_of_participants < tournament.max_number_of_participants" v-on:click="signup(tournament.tournament_id)">Details</button> -->

      
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
            // console.log(this.$store.state.tournaments);
            apiService.list().then(response => {
                this.$store.commit("SET_TOURNAMENTS", response.data);
            });
        },
        getDetails(id) {
            //Add this one line below to try setting the current tournament's id when clicking on details button
            this.$store.commit("SET_CURRENT_TOURNAMENT_ID", id);
            this.$router.push({name: 'tournament-details', params: {id: id}})
        }
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
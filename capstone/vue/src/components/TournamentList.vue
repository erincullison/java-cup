<template>
  <div class="tournament-list">
      <table>
        <thead>
            <tr class="second-row-th">
                <th>Tournament Name</th>
                <th>Current Participants</th>
                <th>Max Participants</th>
                <th>Date</th>
            </tr>
        </thead>
        <tbody>
            <tr v-for="tournament in this.$store.state.tournaments" v-bind:key="tournament.tournament_id" v-bind:tournament="tournament" class="tournament">
                <td class="name">{{ tournament.tournament_name }}</td>
                <td> {{ tournament.current_number_of_participants }} </td>
                <td>{{ tournament.max_number_of_participants }}</td>
                <td>{{ tournament.tournament_date }}</td>
                <td class="button">
                <button class='details-button' v-on:click="getDetails(tournament.tournament_id)">Details</button> 
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

table {
    width: 75%;
    margin-top: 50px;
    margin-left: auto;
    margin-right: auto;
    border-collapse: separate;
    border-spacing: 0 35px;
}

th {
    font-size: 25px;
    text-decoration-line: underline;
    padding: 10px;
    text-align: center;
    color: white;
    text-shadow: 1px -4px 0px black,
               -4px 1px 0px black,
               1px 1px 0px black,
               1px 1px 0px black;
    
}

tbody {
    font-size: 18px;
    background-color: rgb(251, 238, 197);
}

.tournament {
    border: solid 1px;
    
}

td {
    border-top: solid 1px;
    border-bottom: solid 1px;
    height: 50px;
}

td.name {
    border-left: solid 1px;
}

td.button {
    border-right: solid 1px;
}

button.details-button {
    border: solid 1px;
    background-color: white;
    color: black;
    border-radius: 15px;
    font-size: 13px;
    font-weight: bold;
    cursor: pointer;
    opacity: 1;
    text-align: center;
    margin-left: auto;
    margin-right: auto;
    width: 100%;
    height: 80%;
    
}

</style>
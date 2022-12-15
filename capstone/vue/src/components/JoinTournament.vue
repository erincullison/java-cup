<template>
  <form class="join-tourney-form" v-on:submit.prevent>
    <div class="field">
      <label for="name" class="team-name">Team or Participant Name</label>
      <input type="text" v-model="participant_name.name"/>
    </div>
    <div class="actions">
      <button class="cancel-join-tourney" type="button" v-on:click="cancel()">Cancel</button>
      <button type="submit" class="join-tournament-button" v-on:click="joinTournament()">Join Tournament</button>
    </div>
  </form>
</template>

<script>
import apiService from "../services/apiService.js";

export default {
  name: "join-tournament",
  data() {
    return {
      participant_name: {
        name: ''
      }
    };
  },
  methods: {
    joinTournament(){
        apiService.join(this.$route.params.id, this.participant_name.name).then(response => {
          if (response.status === 201) {
            this.$router.push({ name: 'tournament-details', params: {id:this.$route.params.id}});
          }
        })
        .catch(error => {
          console.error(error);
        });
    },
    cancel() {
      this.$router.push({ name: 'tournament-details', params: {id:this.$route.params.id}});
    }
  }
};
</script>

<style scoped>

.join-tourney-form {
  text-align: center;
  border-radius: 15px;
  background-color: #fff;
  overflow: hidden;
  margin-top: 110px;
  opacity: 1;
  visibility: visible;
  width: 25%;
  height: 80%;
  margin-left: auto;
  margin-right: auto;
  padding: 20px;
  backdrop-filter: blur(1px);
  box-shadow: 20px 20px
}

.cancel-join-tourney {
  background-color: rgba(0,0,0,0,4);
  color: black;
  border: 0;
  border-radius: 15px;
  display: block;
  margin: 10px auto;
  padding: 10px 45px;
  width: 50%;
  font-size: 13px;
  cursor: pointer;
}

.join-tournament-button {
  background-color: rgba(0,0,0,0,4);
  color: black;
  border: 0;
  border-radius: 15px;
  display: block;
  margin: 10px auto;
  padding: 10px 45px;
  width: 50%;
  font-size: 13px;
  cursor: pointer;
}

.field {
  display: flex;
  flex-direction: column;
}
.field label {
  margin: 4px 0;
  font-weight: bold;
}
.field input,
.field textarea {
  padding: 8px;
}
.field textarea {
  height: 300px;
}
.actions {
  text-align: center;
  padding: 10px 0;
}

.team-name {
  font-size: 23px
}
</style>
<template>
  <form v-on:submit.prevent>
    <div class="field">
      <label for="name">Team or Participant Name</label>
      <input type="text" v-model="participant_name.name"/>
    </div>
    <div class="actions">
      <button type="button" v-on:click="cancel()">Cancel</button>
      <button type="submit" v-on:click="joinTournament()">Join Tournament</button>
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
      this.$router.push({ name: 'tournaments'});
    }
  }
};
</script>

<style scoped>
form {
  padding: 20px;
  font-size: 16px;
  width: 500px;
  margin-top: 200px;
  margin-right: auto;
  margin-left: auto;
}
form * {
  box-sizing: border-box;
  line-height: 1.5;
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
</style>
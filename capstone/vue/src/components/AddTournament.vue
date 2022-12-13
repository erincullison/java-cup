<template>
  <form v-on:submit.prevent class="create-form">
    <div class="field">
      <label for="name">Tournament Name</label>
      <input type="text" v-model="tournament.tournament_name" placeholder="tournament name"/>
    </div>
    <div class="field">
      <label for="author">Tournament Date</label>
      <input type="date" v-model="tournament.tournament_date" />
    </div>
    <div class="field">
      <label for="content">Size</label>
      <select v-model="tournament.max_number_of_participants" >
          <option disabled value ="">Select one</option>
          <option value='4'>4</option>
          <option value='8'>8</option>
          <option value='16'>16</option>
      </select>
    </div>
    <div class="actions">
      <button type="button" v-on:click="cancel()">Cancel</button>
      <button type="submit" v-on:click="saveTournament()">Save Tournament</button>
    </div>
  </form>
</template>

<script>
import apiService from "../services/apiService.js";

export default {
  name: "add-tournament",
  data() {
    return {
      tournament: {
        tournament_name: '',
        tournament_date: null,
        max_number_of_participants: null
      }
    };
  },
  methods: {
    saveTournament() {
      apiService
        .create(this.tournament)
        .then(response => {
          if (response.status === 201) {
            this.$router.push({ name: 'tournaments'});
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
  width: 35%;
  margin-left: auto;
  margin-right: auto;
  font-size: 25px;
  backdrop-filter: blur(1px);
  box-shadow: 20px 20px;
  
  
  
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
/*
    New CSS
*/
button {
  background-color: rgba(0,0,0,0,4);
  color: black;
  border:0;
  border-radius: 15px;
  display: block;
  margin: 15px auto;
  padding: 15px 45px;
  width: 100%;
  font-size: 13px;
  font-weight: bold;
  cursor: pointer;
  opacity: 1;
  visibility: visible;
  
}
form.create-form {
  border-radius: 15px;
  background-color: #fff;
  overflow: hidden;
  margin-top: 50px;
  opacity: 1;
  visibility: visible;
  width: 25%;

}
label, select {
  margin-top: 10px;
  font-size: 18px;
}

input, select {
  margin-top: 20px;
  margin-left: auto;
  margin-right: auto;
  margin-bottom: 40px;
  padding-bottom: 20px;
  width: 70%;
  text-align: center;
  font-size: 16px;
  border: 0;
  outline: 0;
  border-bottom: 1px solid;
}

</style>
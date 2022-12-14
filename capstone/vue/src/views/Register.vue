<template>
  <div id="register" class="text-center">
    <form class="form-register" @submit.prevent="register">
      <h1 class="h3 mb-3 font-weight-normal">Create Account</h1>
      <div class="alert alert-danger" role="alert" v-if="registrationErrors">
        {{ registrationErrorMsg }}
      </div>
      <label for="username" class="sr-only"></label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <label for="password" class="sr-only"></label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <input
        type="password"
        id="confirmPassword"
        class="form-control"
        placeholder="Confirm Password"
        v-model="user.confirmPassword"
        required
      /><br><br>
      <label for = "user-type" class="sr-only">Account Type </label>
      <select v-model="user.role">
        <option disabled value = "">Please select one</option>
        <option value = 'user'>Participant</option>
        <option value = 'organizer'>Tournament Host</option>
      </select><br><br>
      


      <router-link :to="{ name: 'login' }">Have an account?</router-link>
      <button class="btn btn-lg btn-primary btn-block" type="submit">
        Create Account
      </button>
    </form>
  </div>
</template>

<script>
import authService from '../services/AuthService';

export default {
  name: 'register',
  data() {
    return {
      user: {
        username: '',
        password: '',
        confirmPassword: '',
        role: '',
      },
      tournament: {
        tournament_name: '',
        tournament_date: null,
        number_of_participants: null
      },
      registrationErrors: false,
      registrationErrorMsg: 'There were problems registering this user.',
    };
  },
  methods: {
    register() {
      if (this.user.password != this.user.confirmPassword) {
        this.registrationErrors = true;
        this.registrationErrorMsg = 'Password & Confirm Password do not match.';
      } else {
        authService
          .register(this.user)
          .then((response) => {
            if (response.status == 201) {
              this.$router.push({
                path: '/login',
                query: { registration: 'success' },
              });
            }
          })
          .catch((error) => {
            const response = error.response;
            this.registrationErrors = true;
            if (response.status === 400) {
              this.registrationErrorMsg = 'Bad Request: Validation Errors';
            }
          });
      }
    },
    clearErrors() {
      this.registrationErrors = false;
      this.registrationErrorMsg = 'There were problems registering this user.';
    },
  },
};
</script>

<style>

form.form-register {
  text-align: center;
  border-radius: 15px;
  background-color: #fff;
  overflow: hidden;
  margin-top: 170px;
  opacity: 1;
  visibility: visible;
  width: 65%;
  height: 340px;
  margin: auto;
  padding: 20px;
  backdrop-filter: blur(1px);
  box-shadow: 20px 20px;
}

input#username.form-control {
text-align: center;
}

input#password.form-control {
  text-align: center;
}

.btn {
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


</style>

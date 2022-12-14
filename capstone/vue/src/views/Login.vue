<template>
  <div id="login" class="text-center">
    <form class="form-signin" @submit.prevent="login">
      <h1 class="sign-in-h1 h3 mb-3 font-weight-normal">Please Sign In</h1>
      <div
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid username and password!</div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      <label for="username" class="sr-only"></label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      /><br>
      <label for="password" class="sr-only"></label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      /><br><br>
      
      <router-link :to="{ name: 'register' }">Need an account?</router-link>
      <button type="submit" class="sign-in-button">Sign in</button>
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  },
  created(){
    document.title = "Java Cup - Login"
  }
};
</script>


<style>

form.form-signin {
  text-align: center;
  border-radius: 15px;
  background-color: #fff;
  overflow: hidden;
  margin-top: 50px;
  opacity: 1;
  visibility: visible;
  width: 25%;
  height: 80%;
  margin: auto;
  padding: 20px;
  backdrop-filter: blur(1px);
  box-shadow: 20px 20px
}

div#login.text-center {
  margin-top: 200px;
  height: 300px;
}

.sign-in-h1 {
  margin-top: 20px;
}

input {
  margin-top: 20px;
  margin-left: auto;
  margin-right: auto;
  margin-bottom: 5px;
  width: 50%;
  text-align: center;
  border: 0;
  outline: 0;
  border-bottom: 1px solid;
}

input#username.form-control {
  text-align: center;
}

input#password.form-control {
  text-align: center;
}

.sign-in-button {
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

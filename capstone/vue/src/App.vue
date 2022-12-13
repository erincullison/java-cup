<template>
  <div id="app">
    <div id="nav">
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'tournaments'}">Tournaments</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'create-tournament'}">Create Tournament</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
    </div>
    <router-view />
  </div>
</template>

<style>

#nav {
  text-align: center;
  font-size: 25px;
  /*
      New CSS
  */
  display: flex;
  background-color: white;
  justify-content: space-evenly;
  align-items: center;
  margin-bottom: 80px;
  margin-top: -18px;
  padding: 0 60px;
  height: 60px;
  

}

a {
  text-decoration: none;
  color: black;
}

html {
  background-color: #C9D7F8;
  font-family: 'Bebas Neue', cursive;
  
}

@import url('https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap');

</style>

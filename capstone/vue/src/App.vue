<template>
  <div id="app">
    <div id="nav">
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'tournaments'}">Tournaments</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'create-tournament'}">Create Tournament</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
      <router-link v-bind:to="{ name: 'login' }" v-if="$store.state.token === ''">Login</router-link>
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



.bg-back::after {
  background-image: url(https://cdne-totv8-prod.azureedge.net/media/34057/the-stadium.jpg)

}

/* html {
  background-color: #C9D7F8;
  font-family: 'Bebas Neue', cursive;  
  
} */

html::before {
  content: '';
  position: absolute;
  z-index: -1;    /* this moves image behind content */

  top: 0;
  left: 0;      /*   this is all needed to make image show up */
  bottom: 0;
  right: 0;

  background-image: url(https://res.cloudinary.com/simpleview/image/upload/v1651859548/clients/indiana/Mackey_Arena_bb4e6110-d404-4f1d-881f-d3034b892fe0.png);
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  opacity: 0.60;
}

@import url('https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Hind:wght@400;700&display=swap');

</style>

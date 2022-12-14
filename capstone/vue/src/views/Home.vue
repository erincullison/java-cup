<template>
  <div class="home">
    <h1 class ="welcome">Welcome to Java Cup Tournaments</h1>
    <p class="message">Generate a bracket for your next tournament at the Java Cup!</p>

    <div class="sport-box1">
      <img src="https://sporttechie-prod.s3.amazonaws.com/2019/09/rafael-nadal-us-open.png" alt="Tennis shot">
  
    
      <img src="https://a.espncdn.com/photo/2022/1211/r1105296_1296x518_5-2.jpg" alt="Football throw">
    </div>
    <div class="sport-box2">
      <img src="https://image.cnbcfm.com/api/v1/image/107022230-16460709112021-11-11t183754z_77555060[…]ccer-worldcup-rus-cyp-report.jpeg?v=1646071433&w=1920&h=1080" alt="Soccer Header">
  
    
      <img src="https://www.androidauthority.com/wp-content/uploads/2019/03/esports-tournaments-leagues-featured.jpg" alt="Esports game">
    </div>
    

  </div>
</template>

<script>
export default {
  name: "home"
};
</script>

<style>

div.sport-box1 {
  display: flex;
  justify-content:space-evenly;
  flex-wrap: wrap;
}

div.sport-box2 {
  display: flex;
  justify-content:space-evenly;
  flex-wrap: wrap;
}

img {
  border: 2px solid black;
  border-radius: 20px;
  width: 28vw;
  height: 28vh;
  margin: 20px;
  object-fit: cover;

}

.welcome {
  text-align: center;
  font-size: 100px;
  color: white;
  text-shadow: 1px -4px 0px black,
               -4px 1px 0px black,
               4px 1px 0px black,
               10px 10px 0px black;
}


.message {
  text-align: center;
  font-size: 65px;
  margin-top: 90px;
  color: white;
  text-shadow: 1px -4px 0px black,
               -4px 1px 0px black,
               4px 1px 0px black,
               1px 4px 0px black;
}


</style>

<template>
  <div class="bracket">
      <div class="round-one" v-for="player in round_one" v-bind:key="player">
          <p> {{player}} </p>
      </div>
      <div class="round-two" v-for="player in round_two" v-bind:key="player">
          <p> {{player}} </p>
      </div>
      <div class="round-three" v-for="player in round_three" v-bind:key="player">
          <p> {{player}} </p>
      </div>
      <div class="winner">
          <p> {{final_winner}} </p>
      </div>
  </div>
</template>
                                    <!-- THE ABOVE NEEDS CSS STYLING TO DISPLAY ARRAYS BY ROUND -->

<script>
export default {
    name: 'bracket-eight',
    data() {
        return {
            round_one: ['player 1', 'player 2', 'player 3', 'player 4', 'player 5', 'player 6', 'player 7', 'player 8'],
            round_two: ['----', '----', '----', '----',],
            round_three: ['----', '----',],
            final_winner: '----',


            rounds: [ {
                games_one: [
                    {

                        player1: { id: "1", name: "Competitor 1", winner: false },
                        player2: { id: "2", name: "Competitor 2", winner: false },
                    },
                    {

                        player1: { id: "3", name: "Competitor 3", winner: false },
                        player2: { id: "4", name: "Competitor 4", winner: false },
                    }
                ],
        
        
        
                games_two: [
                    {

                        player1: { id: "4", name: "Competitor 4", winner: false },
                        player2: { id: "8", name: "Competitor 8", winner: false },
                    }
                ]
            }
            ]
        
            
        

        }
    }

}
</script>

<style>

            /* FIX THIS HERE!!! */
.bracket {
    display: flex;
}

</style>
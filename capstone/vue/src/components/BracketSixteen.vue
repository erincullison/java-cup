<template>
  <div class="bracket">
        <section>
            <p>Round One</p>
            <ul class="round-one" v-for="player in round_one" v-bind:key="player">
                <li> {{player}} </li>
            </ul>
        </section>
        <section>
            <p>Round Two</p>
            <ul class="round-two" v-for="player in round_two" v-bind:key="player">
                <li> {{player}} </li>
            </ul>
        </section>
        <section>
            <p>Round Three</p>
            <ul class="round-three" v-for="player in round_three" v-bind:key="player">
                <li> {{player}} </li>
            </ul>
        </section>
        <section>
            <p>Round Four</p>
            <ul class="round-four" v-for="player in round_four" v-bind:key="player">
                <li> {{player}} </li>
            </ul>
        </section>
        <section>
            <p>Winner</p>
            <ul class="winner">
                <li> {{final_winner}} </li>
            </ul>
        </section>
      
  </div>
</template>
                                    <!-- THE ABOVE NEEDS CSS STYLING TO DISPLAY ARRAYS BY ROUND AND GROUP BY GAME -->

<script>
export default {
    name: 'bracket-sixteen',
    data() {
        return {
            round_one: ['player 1', 'player 2', 'player 3', 'player 4', 'player 5', 'player 6', 'player 7', 'player 8',
                        'player 9', 'player 10', 'player 11', 'player 12', 'player 13', 'player 14', 'player 15', 'player 16'],
            round_two: ['----', '----', '----', '----', '----', '----', '----', '----'],
            round_three: ['----', '----', '----', '----'],
            round_four: ['----', '----'],
            final_winner: '----',


            // rounds: [ {
            //     games_one: [
            //         {

            //             player1: { id: "1", name: "Competitor 1", winner: false },
            //             player2: { id: "2", name: "Competitor 2", winner: false },
            //         },
            //         {

            //             player1: { id: "3", name: "Competitor 3", winner: false },
            //             player2: { id: "4", name: "Competitor 4", winner: false },
            //         }
            //     ],
        
        
        
            //     games_two: [
            //         {

            //             player1: { id: "4", name: "Competitor 4", winner: false },
            //             player2: { id: "8", name: "Competitor 8", winner: false },
            //         }
            //     ]
            // }
            // ]
        
            
        

        }
    }

}
</script>

<style>

            /* FIX THIS HERE!!!       idk how it works but it's kinda working lol*/

.bracket {
    display: flex;
    
}

section {
    flex-basis: 25%;
}

ul {
    list-style: none;
}


</style>
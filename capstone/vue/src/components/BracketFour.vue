<template>
  <div class="bracket">
    <main id="tournament">
      <ul class="round round-1">
        <li class="spacer">&nbsp;</li>
        
        <li class="game game-top">{{this.$store.state.games[0].participant_one}}</li>
        <li class="game game-spacer">&nbsp;</li><!--Space between player 1 and player 2-->
        <li class="game game-bottom">{{this.$store.state.games[0].participant_two}}</li>

        <li class="spacer">&nbsp;</li><!--Space between one match and the other-->
        
        <li class="game game-top">{{this.$store.state.games[1].participant_one}}</li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom">{{this.$store.state.games[1].participant_two}}</li>

      </ul>
      <ul class="round round-2">
        <li class="spacer">&nbsp;</li>
        
        <li class="game game-top">{{this.$store.state.games[2].participant_one}}</li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom">{{this.$store.state.games[2].participant_two}}</li>

        <li class="spacer">&nbsp;</li>
        
      </ul>
      <ul class="round round-3">
          <li class="spacer">&nbsp;</li>
          <li class="game game-top">{{this.$store.state.games[3].participant_one}}</li>

          <li class="spacer">&nbsp;</li>
      </ul>
  </main>
  <!--                              ----Previous HTML----
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
            <p>Winner</p>
            <ul class="winner">
                <li> {{final_winner}} </li>
            </ul>
        </section>
  -->
  </div>
</template>
                                    <!-- THE ABOVE NEEDS CSS STYLING TO DISPLAY ARRAYS BY ROUND AND GROUP BY GAME -->

<script>
export default {
    name: 'bracket-four',
    data() {
        return {
            round_one: ['player 1', 'player 2', 'player 3', 'player 4'],
            round_two: ['----', '----'],
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
            // } ]
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
/*
        New CSS
*/
main {
  display: flex;
  flex-direction: row;
  margin: auto;
}

.round {
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 200px;
  list-style: none;
  padding: 0;
}

.round .spacer {
  flex-grow: 1; 
}
.round .spacer:first-child,
.round .spacer:last-child {
  flex-grow: .5; 
}

.round .game-spacer {
  flex-grow: 1;
}

/*
   General Styles
*/
body {
  font-family: sans-serif;
  font-size: small;
  
  line-height: 1.4em;
}

li.game {
  padding-left: 20px;
}

li.game.winner {
  font-weight: bold;
}

li.game span {
  float: right;
  margin-right: 5px;
}

li.game-top {
  border-bottom: 1px solid #aaa;
}

li.game-spacer { 
  border-right: 1px solid #aaa;
  min-height: 40px;
}

li.game-bottom { 
  border-top: 1px solid #aaa;
}
</style>
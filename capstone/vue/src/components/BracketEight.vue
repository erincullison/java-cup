<template>
  <div class="bracket"> 
    <main id="tournament">
      <ul class="round round-1">
        <li class="spacer">&nbsp;</li>
        

          <!-- Additional button logic for organizer id verification:
          (Will need to be in each bracket template for implementation)
          &&this.$store.state.user.id==this.organizer -->

        <li class="game game-top">{{this.$store.state.games[0].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(0, 1, 5)" 
            v-if="(this.$store.state.games[4].participant_one=='TBD')
            &&this.$store.state.games[0].participant_one != 'TBD'
            &&this.$store.state.games[0].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        

        <li class="game game-spacer">&nbsp;</li><!--Space between player 1 and player 2-->

        

        <li class="game game-bottom ">{{this.$store.state.games[0].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(0, 1, 5)" 
            v-if="(this.$store.state.games[4].participant_one=='TBD')
            &&this.$store.state.games[0].participant_one != 'TBD'
            &&this.$store.state.games[0].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>



        <li class="spacer">&nbsp;</li><!--Space between one match and the other-->
        


        <li class="game game-top">{{this.$store.state.games[1].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(1, 2, 5)" 
            v-if="(this.$store.state.games[4].participant_two=='TBD')
            &&this.$store.state.games[1].participant_one != 'TBD'
            &&this.$store.state.games[1].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        

        <li class="game game-spacer">&nbsp;</li>

        

        <li class="game game-bottom ">{{this.$store.state.games[1].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(1, 2, 5)" 
            v-if="(this.$store.state.games[4].participant_two=='TBD')
            &&this.$store.state.games[1].participant_one != 'TBD'
            &&this.$store.state.games[1].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>



        <li class="spacer">&nbsp;</li>



        <li class="game game-top ">{{this.$store.state.games[2].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(2, 3, 6)" 
            v-if="(this.$store.state.games[5].participant_one=='TBD')
            &&this.$store.state.games[2].participant_one != 'TBD'
            &&this.$store.state.games[2].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="game game-spacer">&nbsp;</li>

        

        <li class="game game-bottom">{{this.$store.state.games[2].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(2, 3, 6)" 
            v-if="(this.$store.state.games[5].participant_one=='TBD')
            &&this.$store.state.games[2].participant_one != 'TBD'
            &&this.$store.state.games[2].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>



        <li class="spacer">&nbsp;</li>
        


        <li class="game game-top">{{this.$store.state.games[3].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(3, 4, 6)" 
            v-if="(this.$store.state.games[5].participant_two=='TBD')
            &&this.$store.state.games[3].participant_one != 'TBD'
            &&this.$store.state.games[3].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        

        <li class="game game-spacer">&nbsp;</li>

        

        <li class="game game-bottom ">{{this.$store.state.games[3].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(3, 4, 6)" 
            v-if="(this.$store.state.games[5].participant_two=='TBD')
            &&this.$store.state.games[3].participant_one != 'TBD'
            &&this.$store.state.games[3].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>

      </ul>
      <ul class="round round-2">
        <li class="spacer">&nbsp;</li>


        
        <li class="game game-top">{{this.$store.state.games[4].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(4, 5, 7)" 
            v-if="(this.$store.state.games[6].participant_one=='TBD')
            &&this.$store.state.games[4].participant_one != 'TBD'
            &&this.$store.state.games[4].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        

        <li class="game game-spacer">&nbsp;</li>

        

        <li class="game game-bottom ">{{this.$store.state.games[4].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(4, 5, 7)" 
            v-if="(this.$store.state.games[6].participant_one=='TBD')
            &&this.$store.state.games[4].participant_one != 'TBD'
            &&this.$store.state.games[4].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>



        <li class="spacer">&nbsp;</li>
        


        <li class="game game-top">{{this.$store.state.games[5].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(5, 6, 7)" 
            v-if="(this.$store.state.games[6].participant_two=='TBD')
            &&this.$store.state.games[5].participant_one != 'TBD'
            &&this.$store.state.games[5].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="game game-spacer">&nbsp;</li>

        

        <li class="game game-bottom ">{{this.$store.state.games[5].participant_two}} 
          <button class = "winButton" v-on:click="updateGamePlayerTwo(5, 6, 7)" 
            v-if="(this.$store.state.games[6].participant_two=='TBD')
            &&this.$store.state.games[5].participant_one != 'TBD'
            &&this.$store.state.games[5].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>



        <li class="spacer">&nbsp;</li>
      </ul>
      <ul class="round round-3">
        <li class="spacer">&nbsp;</li>
        
        <li class="game game-top">{{this.$store.state.games[6].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(6, 7, 8)" 
            v-if="(this.$store.state.games[7].participant_one=='TBD')
            &&this.$store.state.games[6].participant_one != 'TBD'
            &&this.$store.state.games[6].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="game game-spacer">&nbsp;</li>


        <li class="game game-bottom ">{{this.$store.state.games[6].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(6, 7, 6)" 
            v-if="(this.$store.state.games[7].participant_one=='TBD')
            &&this.$store.state.games[6].participant_one != 'TBD'
            &&this.$store.state.games[6].participant_two != 'TBD'
            &&'authorities' in this.$store.state.user
            &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
            &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
      </ul>
      <ul class="round round-4">
          <li class="spacer">&nbsp;</li>
          <li class="game game-top">{{this.$store.state.games[7].participant_one}}</li>

          <li class="spacer">&nbsp;</li>
      </ul>
    </main>
<!--                                  ----Previous HTML----
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
import apiService from '../services/apiService';
export default {
    name: 'bracket-eight',
    props: {
      organizer: Number
    },
    data() {
        return {
            gameToUpdate: {
              tournament_id: null,  
              name: '',             
              current_game: null,   
              next_game: null
          }
        }
    },
    methods: {
    updateGamePlayerOne(gameIndex, current_game, next_game){
        this.gameToUpdate.tournament_id = this.$route.params.id;
        this.gameToUpdate.name = this.$store.state.games[gameIndex].participant_one;
        this.gameToUpdate.current_game = current_game;
        this.gameToUpdate.next_game = next_game;
        apiService.win(this.gameToUpdate);

        this.gameToUpdate.tournament_id = null;
        this.gameToUpdate.name = '';
        this.gameToUpdate.current_game = null;
        this.gameToUpdate.next_game = null;
        this.$router.push({name: 'tournament-details', params: {id: this.$route.params.id}})
        window.location.reload();


      },
      updateGamePlayerTwo(gameIndex, current_game, next_game){
        this.gameToUpdate.tournament_id = this.$route.params.id;
        this.gameToUpdate.name = this.$store.state.games[gameIndex].participant_two;
        this.gameToUpdate.current_game = current_game;
        this.gameToUpdate.next_game = next_game;
        apiService.win(this.gameToUpdate);

        this.gameToUpdate.tournament_id = null;
        this.gameToUpdate.name = '';
        this.gameToUpdate.current_game = null;
        this.gameToUpdate.next_game = null;
        this.$router.push({name: 'tournament-details', params: {id: this.$route.params.id}})
        window.location.reload();


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
 *  General Styles
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
  min-height :40px;
}

li.game-bottom { 
  border-top: 1px solid #aaa;
}
</style>
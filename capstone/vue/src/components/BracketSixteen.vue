<template>
  <div class="bracket">
    <main id="tournament-16">
      <ul class="round round-1">
        <li class="spacer">&nbsp;</li>
        
        <!--Match 1-->
        <!--Game 1 to Game 9 as P1-->
        <li class="game game-top">{{this.$store.state.games[0].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(0, 1, 9)" 
            v-if="(this.$store.state.games[8].participant_one=='TBD')
              &&this.$store.state.games[0].participant_one != 'TBD'
              &&this.$store.state.games[0].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li><!--Space between player 1 and player 2-->
        <li class="game game-bottom ">{{this.$store.state.games[0].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(0, 1, 9)" 
            v-if="(this.$store.state.games[8].participant_one=='TBD')
              &&this.$store.state.games[0].participant_one != 'TBD'
              &&this.$store.state.games[0].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li><!--Space between one match and the other-->
        
        <!--Match 1-->
        <!--Game 2 to Game 9 as P2-->
        <li class="game game-top ">{{this.$store.state.games[1].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(1, 2, 9)" 
            v-if="(this.$store.state.games[8].participant_two=='TBD')
              &&this.$store.state.games[1].participant_one != 'TBD'
              &&this.$store.state.games[1].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[1].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(1, 2, 9)" 
            v-if="(this.$store.state.games[8].participant_two=='TBD')
              &&this.$store.state.games[1].participant_one != 'TBD'
              &&this.$store.state.games[1].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
        <!--Match 2-->
        <!--Game 3 to Game 10 as P1-->
        <li class="game game-top ">{{this.$store.state.games[2].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(2, 3, 10)" 
            v-if="(this.$store.state.games[9].participant_one=='TBD')
              &&this.$store.state.games[2].participant_one != 'TBD'
              &&this.$store.state.games[2].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[2].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(2, 3, 10)" 
            v-if="(this.$store.state.games[9].participant_one=='TBD')
              &&this.$store.state.games[2].participant_one != 'TBD'
              &&this.$store.state.games[2].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
        <!--Match 2-->
        <!--Game 4 to Game 10 as P2-->
        <li class="game game-top ">{{this.$store.state.games[3].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(3, 4, 10)" 
            v-if="(this.$store.state.games[9].participant_two=='TBD')
              &&this.$store.state.games[3].participant_one != 'TBD'
              &&this.$store.state.games[3].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[3].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(3, 4, 10)" 
            v-if="(this.$store.state.games[9].participant_two=='TBD')
              &&this.$store.state.games[3].participant_one != 'TBD'
              &&this.$store.state.games[3].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
        <!--Match 3-->
        <!--Game 5 to Game 11 as P1-->
        <li class="game game-top ">{{this.$store.state.games[4].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(4, 5, 11)" 
            v-if="(this.$store.state.games[10].participant_one=='TBD')
              &&this.$store.state.games[4].participant_one != 'TBD'
              &&this.$store.state.games[4].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[4].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(4, 5, 11)" 
            v-if="(this.$store.state.games[10].participant_one=='TBD')
              &&this.$store.state.games[4].participant_one != 'TBD'
              &&this.$store.state.games[4].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
        <!--Match 3-->
        <!--Game 6 to Game 11 as P2-->
        <li class="game game-top ">{{this.$store.state.games[5].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(5, 6, 11)" 
            v-if="(this.$store.state.games[10].participant_two=='TBD')
              &&this.$store.state.games[5].participant_one != 'TBD'
              &&this.$store.state.games[5].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[5].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(5, 6, 11)" 
            v-if="(this.$store.state.games[10].participant_two=='TBD')
              &&this.$store.state.games[5].participant_one != 'TBD'
              &&this.$store.state.games[5].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
        <!--Match 4-->
        <!--Game 7 to Game 12 as P1-->
        <li class="game game-top ">{{this.$store.state.games[6].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(6, 7, 12)" 
            v-if="(this.$store.state.games[11].participant_one=='TBD')
              &&this.$store.state.games[6].participant_one != 'TBD'
              &&this.$store.state.games[6].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[6].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(6, 7, 12)" 
            v-if="(this.$store.state.games[11].participant_one=='TBD')
              &&this.$store.state.games[6].participant_one != 'TBD'
              &&this.$store.state.games[6].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
        <!--Match 4-->
        <!--Game 8 to Game 12 as P2-->
        <li class="game game-top ">{{this.$store.state.games[7].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(7, 8, 12)" 
            v-if="(this.$store.state.games[11].participant_two=='TBD')
              &&this.$store.state.games[7].participant_one != 'TBD'
              &&this.$store.state.games[7].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[7].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(7, 8, 12)" 
            v-if="(this.$store.state.games[11].participant_two=='TBD')
              &&this.$store.state.games[7].participant_one != 'TBD'
              &&this.$store.state.games[7].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
      </ul>

      <ul class="round round-2">
        <li class="spacer">&nbsp;</li>
        
        <!--Match 5-->
        <!--Game 9 to Game 13 as p1-->
        <li class="game game-top ">{{this.$store.state.games[8].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(8, 9, 13)" 
            v-if="(this.$store.state.games[12].participant_one=='TBD')
              &&this.$store.state.games[8].participant_one != 'TBD'
              &&this.$store.state.games[8].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[8].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(8, 9, 13)" 
            v-if="(this.$store.state.games[12].participant_one=='TBD')
              &&this.$store.state.games[8].participant_one != 'TBD'
              &&this.$store.state.games[8].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
        <!--Match 5-->
        <!--Game 10 to Game 13 as p2-->
        <li class="game game-top ">{{this.$store.state.games[9].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(9, 10, 13)" 
            v-if="(this.$store.state.games[12].participant_two=='TBD')
              &&this.$store.state.games[9].participant_one != 'TBD'
              &&this.$store.state.games[9].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[9].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(9, 10, 13)" 
            v-if="(this.$store.state.games[12].participant_two=='TBD')
              &&this.$store.state.games[9].participant_one != 'TBD'
              &&this.$store.state.games[9].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
        <!--Match 6-->
        <!--Game 11 to Game 14 as p1-->
        <li class="game game-top ">{{this.$store.state.games[10].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(10, 11, 14)" 
            v-if="(this.$store.state.games[13].participant_one=='TBD')
              &&this.$store.state.games[10].participant_one != 'TBD'
              &&this.$store.state.games[10].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[10].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(10, 11, 14)" 
            v-if="(this.$store.state.games[13].participant_one=='TBD')
              &&this.$store.state.games[10].participant_one != 'TBD'
              &&this.$store.state.games[10].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
        <!--Match 6-->
        <!--Game 12 to Game 14 as p2-->
        <li class="game game-top ">{{this.$store.state.games[11].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(11, 12, 14)" 
            v-if="(this.$store.state.games[13].participant_two=='TBD')
              &&this.$store.state.games[11].participant_one != 'TBD'
              &&this.$store.state.games[11].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[11].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(11, 12, 14)" 
            v-if="(this.$store.state.games[13].participant_two=='TBD')
              &&this.$store.state.games[11].participant_one != 'TBD'
              &&this.$store.state.games[11].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
      </ul>

      <ul class="round round-3">
        <li class="spacer">&nbsp;</li>
        
        <!--Match 7-->
        <!--Game 13 to Game 15 as p1-->
        <li class="game game-top ">{{this.$store.state.games[12].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(12, 13, 15)" 
            v-if="(this.$store.state.games[14].participant_one=='TBD')
              &&this.$store.state.games[12].participant_one != 'TBD'
              &&this.$store.state.games[12].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[12].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(12, 13, 15)" 
            v-if="(this.$store.state.games[14].participant_one=='TBD')
              &&this.$store.state.games[12].participant_one != 'TBD'
              &&this.$store.state.games[12].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
        
        <!--Match 7-->
        <!--Game 14 to Game 15 as p2-->
        <li class="game game-top ">{{this.$store.state.games[13].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(13, 14, 15)" 
            v-if="(this.$store.state.games[14].participant_two=='TBD')
              &&this.$store.state.games[13].participant_one != 'TBD'
              &&this.$store.state.games[13].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[13].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(13, 14, 15)" 
            v-if="(this.$store.state.games[14].participant_two=='TBD')
              &&this.$store.state.games[13].participant_one != 'TBD'
              &&this.$store.state.games[13].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>

        <li class="spacer">&nbsp;</li>
      </ul>

      <ul class="round round-4">
        <li class="spacer">&nbsp;</li>
        
        <!--Match 7-->
        <!--Game 15 to Game 16 as p1 winner-->
        <li class="game game-top ">{{this.$store.state.games[14].participant_one}}
          <button class = "winButton" v-on:click="updateGamePlayerOne(14, 15, 16)" 
            v-if="(this.$store.state.games[15].participant_one=='TBD')
              &&this.$store.state.games[14].participant_one != 'TBD'
              &&this.$store.state.games[14].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        <li class="game game-spacer">&nbsp;</li>
        <li class="game game-bottom ">{{this.$store.state.games[14].participant_two}}
          <button class = "winButton" v-on:click="updateGamePlayerTwo(14, 15, 16)" 
            v-if="(this.$store.state.games[15].participant_one=='TBD')
              &&this.$store.state.games[14].participant_one != 'TBD'
              &&this.$store.state.games[14].participant_two != 'TBD'
              &&this.$store.state.user.authorities[0].name == 'ROLE_ORGANIZER'
              &&this.$store.state.user.id==this.organizer"> >
          </button>
        </li>
        
        <li class="spacer">&nbsp;</li>
      </ul>

      <ul class="round round-5">
          <li class="spacer">&nbsp;</li>
          <li class="game game-top ">{{this.$store.state.games[15].participant_one}}</li>

          <li class="spacer">&nbsp;</li>
      </ul>
    </main> 
  </div>
</template>
                                   <!-- I never want to look at HTML again - Michael -->

<script>
import apiService from '../services/apiService';
export default {
    name: 'bracket-sixteen',
    props: {
      organizer: Number
    },
    data() {
        return {
          //GAME OBJECT TO SEND UPDATED RANKINGS
          gameToUpdate:{
            tournament_id: null,  //this.$route.params.id
            name: '',             //this.$store.state.games[?].participant_one OR this.$store.state.games[?].participant_two
            current_game: null,   
            next_game: null
          }
        }
    },

    methods: {
      updateGamePlayerOne(gameIndex, current_game, next_game){
        this.gameToUpdate.tournament_id = this.$route.params.id;                                  //fill game object
        this.gameToUpdate.name = this.$store.state.games[gameIndex].participant_one;
        this.gameToUpdate.current_game = current_game;
        this.gameToUpdate.next_game = next_game;

        apiService.win(this.gameToUpdate);                                                        //call api

        this.gameToUpdate.tournament_id = null;                                                   //reset game object
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

.bracket {
    display: flex;
    background-color: white;
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

main#tournament-16 {
  margin: auto;
  
}
</style>
BEGIN TRANSACTION;

DROP TABLE IF EXISTS users, tournament, organizer_tournament, participant_name, game, tournament_id CASCADE;

CREATE TABLE users (
	user_id SERIAL,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE tournament (
	tournament_id SERIAL,
	tournament_name varchar(50) NOT NULL UNIQUE,
	tournament_date date NOT NULL,
	max_number_of_participants integer NOT NULL,
	current_number_of_participants integer DEFAULT 0,
	CONSTRAINT PK_tournament PRIMARY KEY(tournament_id)
);

CREATE TABLE organizer_tournament (
	organizer_id integer,
	tournament_id integer NOT NULL UNIQUE,
	CONSTRAINT PK_organizer_tournament PRIMARY KEY (organizer_id, tournament_id),
	CONSTRAINT FK_organizer_tournament_user FOREIGN KEY (organizer_id) REFERENCES users(user_id),
	CONSTRAINT FK_organizer_tournament_tournament FOREIGN KEY (tournament_id) REFERENCES tournament(tournament_id)

);

CREATE TABLE participant_name (
	name_id SERIAL,
	name varchar(100) NOT NULL,
	CONSTRAINT PK_name PRIMARY KEY (name_id)
);

CREATE TABLE game (
	game_id SERIAL,
	tournament_id integer,
	game_number integer NOT NULL,
	participant_one integer,
	participant_two integer,
	CONSTRAINT PK_game PRIMARY KEY (game_id),
	CONSTRAINT FK_game_participant_one FOREIGN KEY (participant_one) REFERENCES participant_name(name_id),
	CONSTRAINT FK_game_participant_two FOREIGN KEY (participant_two) REFERENCES participant_name(name_id),
	CONSTRAINT FK_game_tournament FOREIGN KEY (tournament_id) REFERENCES tournament(tournament_id)
);


COMMIT TRANSACTION;

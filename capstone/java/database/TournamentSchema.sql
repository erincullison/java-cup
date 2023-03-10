BEGIN TRANSACTION;
DROP TABLE IF EXISTS tournament, user_tournament, organizer_tournament CASCADE;
CREATE TABLE tournament (
	tournament_id SERIAL,
	tournament_name varchar(50) NOT NULL UNIQUE,
	tournament_date date NOT NULL,
	number_of_participants integer NOT NULL,
	CONSTRAINT PK_tournament PRIMARY KEY(tournament_id)
);
CREATE TABLE user_tournament (
	user_id integer,
	tournament_id integer NOT NULL UNIQUE,
	CONSTRAINT PK_user_tournament PRIMARY KEY (user_id, tournament_id),
	CONSTRAINT FK_user_tournament_user FOREIGN KEY (user_id) REFERENCES users(user_id),
	CONSTRAINT FK_user_tournament_tournament FOREIGN KEY (tournament_id) REFERENCES tournament(tournament_id)

);

CREATE TABLE organizer_tournament (
	organizer_id integer,
	tournament_id integer NOT NULL UNIQUE,
	CONSTRAINT PK_organizer_tournament PRIMARY KEY (organizer_id, tournament_id),
	CONSTRAINT FK_organizer_tournament_user FOREIGN KEY (organizer_id) REFERENCES users(user_id),
	CONSTRAINT FK_organizer_tournament_tournament FOREIGN KEY (tournament_id) REFERENCES tournament(tournament_id)

);
COMMIT TRANSACTION;
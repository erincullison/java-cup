BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');
INSERT INTO users (username,password_hash,role) VALUES ('organizer','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ORGANIZER');


INSERT INTO tournament(tournament_name, tournament_date, max_number_of_participants, current_number_of_participants)
	VALUES ('US Open 2022 - Mens Singles', '2022-08-23',8, 8);

INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (1, 1, 'N Kyrgios', 'K Khachanov');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (1, 2, 'M Berrettini', 'C Ruud');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (1, 3, 'J Sinner', 'C Alcaraz');    
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (1, 4, 'A Rublev', 'F Tiafoe'); 
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (1, 5, 'K Khachanov', 'C Ruud'); 
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (1, 6, 'C Alcaraz', 'F Tiafoe'); 
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (1, 7, 'C Ruud', 'C Alcaraz'); 
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (1, 8, 'C Alcaraz', ''); 

INSERT INTO tournament(tournament_name, tournament_date, max_number_of_participants, current_number_of_participants)
	VALUES ('NFL Championship 2022', '2022-01-22',4, 4);

INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (2, 1, 'Bengals', 'Chiefs');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (2, 2, '49ers', 'Rams');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (2, 3, 'Bengals', 'Rams');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (2, 4, 'Rams', '');


INSERT INTO tournament(tournament_name, tournament_date, max_number_of_participants, current_number_of_participants)
	VALUES ('The Official Java Cup', '2022-12-16', 16, 16);

INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 1, 'Java Yellow', 'Java Maroon');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 2, 'Java Gray', 'Java Red');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 3, 'Java Green', 'Java Silver');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 4, 'Java Blue', 'Java Fushsia');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 5, 'Java Black', 'Java Navy');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 6, 'Java Teal', 'Java Purple');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 7, 'Java Orange', 'Java Lime');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 8, 'Java Aqua', 'Java White');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 9, 'Java Yellow', 'Java Red');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 10, 'Java Green', 'Java Blue');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 11, 'Java Navy', 'Java Purple');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 12, 'Java Orange', 'Java Aqua');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 13, 'Java Yellow', 'TBD');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 14, 'TBD', 'TBD');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 15, 'TBD', 'TBD');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (3, 16, 'TBD', 'TBD');


INSERT INTO tournament(tournament_name, tournament_date, max_number_of_participants, current_number_of_participants)
	VALUES ('San Diego Amateur WrestleMania', '2023-01-12', 8, 3);

INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (4, 1, 'R Evans', 'S Hester');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (4, 2, 'J Smith', 'TBD');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (4, 3, 'TBD', 'TBD');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (4, 4, 'TBD', 'TBD');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (4, 5, 'TBD', 'TBD');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (4, 6, 'TBD', 'TBD');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (4, 7, 'TBD', 'TBD');
INSERT INTO game(tournament_id, game_number, participant_one, participant_two)
	VALUES (4, 8, 'TBD', 'TBD');




COMMIT TRANSACTION;


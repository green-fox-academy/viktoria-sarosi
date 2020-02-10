
USE Movies;
CREATE TABLE IF NOT EXISTS Movie(
mID INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR (100),
year INT ,
director VARCHAR (100)
);
ALTER TABLE Movie AUTO_INCREMENT = 101;
INSERT INTO Movie (title, year, director)
VALUES ("Gone With The Wind", 1939, "Victor Fleming");

SELECT * FROM Movie;
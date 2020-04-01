
USE Movies;
CREATE TABLE IF NOT EXISTS Movie(
mID INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR (100),
year INT ,
director VARCHAR (100)
);
ALTER TABLE Movie AUTO_INCREMENT = 101;
INSERT INTO Movie (title, year, director)
VALUES ("Gone With The Wind", 1939, "Victor Fleming"),
		("Star Wars", 1977, "George Lucas"),
        ("The Sound of Music", 1965, "Robert Wise"),
        ("E.T.", 1982, "Steven Spielberg"),
        ("Titanic", 1997, "James Cameron"),
        ("Snow White", 1937, null),
        ("Avatar", 2009, "James Cameron"),
        ("Raiders of the Lost Ark",	1981, "Steven Spielberg");

CREATE TABLE IF NOT EXISTS Reviewer(
rID INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR (100)
);
ALTER TABLE Reviewer AUTO_INCREMENT = 201;


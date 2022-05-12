CREATE DATABASE bas;

DROP TABLE IF EXISTS users;

CREATE TABLE users (
	user_id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	username VARCHAR ( 255 ) UNIQUE NOT NULL,
	password TEXT NOT NULL,
	created_on TIMESTAMP NOT NULL,
	last_login TIMESTAMP);
	

CREATE TABLE account_details (account_id serial PRIMARY KEY, deposit MONEY NOT NULL, withdraw MONEY NOT NULL, balance MONEY NOT NULL);
CREATE DATABASE bas;

CREATE TABLE users (
	user_id serial PRIMARY KEY,
	username VARCHAR ( 50 ) UNIQUE NOT NULL,
	password VARCHAR ( 50 ) NOT NULL,
	created_on TIMESTAMP NOT NULL,
	last_login TIMESTAMP);
	

CREATE TABLE account_details (account_id serial PRIMARY KEY, deposit MONEY NOT NULL, withdraw MONEY NOT NULL, balance MONEY NOT NULL);
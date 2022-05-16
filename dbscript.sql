CREATE DATABASE bas;

DROP TABLE IF EXISTS users;

DROP TABLE IF EXISTS account_details;

CREATE TABLE users (
	user_id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	user_name VARCHAR ( 255 ) UNIQUE NOT NULL,
	password TEXT NOT NULL,
	created_on TIMESTAMP NOT NULL,
	last_login TIMESTAMP WITHOUT TIME ZONE);
	

CREATE TABLE account_details (
	account_id INT GENERATED ALWAYS AS IDENTITY, 
	userId INT,
	deposit MONEY NOT NULL, 
	withdraw MONEY NOT NULL, 
	balance MONEY NOT NULL),
	PRIMARY KEY(account_id)
	CONSTRAINT fk_customer
      FOREIGN KEY(userId) 
	  REFERENCES account_details(userId)
	  ON DELETE CASCADE;
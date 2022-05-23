CREATE DATABASE bas;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS account_details;


CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE users (
	user_id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	user_name VARCHAR ( 255 ) UNIQUE NOT NULL,
	password TEXT NOT NULL,
	created_on DATE,
	last_login timestamp WITHOUT time zone);


CREATE TABLE account_details (
	account_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, 
	account_type VARCHAR (50) NOT NULL,
	balance MONEY NOT NULL
	);

CREATE TABLE bank_account(
	user_id INT NOT NULL,
	account_id INT NOT NULL,
	PRIMARY KEY (user_id, account_id),
	FOREIGN KEY (user_id) REFERENCES users(user_id) ON UPDATE CASCADE,
	FOREIGN KEY (account_id) REFERENCES account_details(account_id) ON UPDATE CASCADE
);


INSERT INTO users(user_name, password,created_on,last_login) VALUES('abc123',crypt('jkjk',gen_salt('bf')),CURRENT_DATE,NOW());

INSERT INTO users(user_name, password,created_on,last_login) VALUES('bbc123',crypt('abab',gen_salt('bf')),CURRENT_DATE,NOW());

INSERT INTO users(user_name, password,created_on,last_login) VALUES('admin101',crypt('root',gen_salt('bf')),CURRENT_DATE,NOW());

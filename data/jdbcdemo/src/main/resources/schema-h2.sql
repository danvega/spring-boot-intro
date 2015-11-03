DROP TABLE IF EXISTS Author;

CREATE TABLE Author (
	id bigint NOT NULL,
	first_name varchar(100),
	last_name varchar(100),
	email varchar(100),
	PRIMARY KEY (id)
);

DROP TABLE IF EXISTS Post;

CREATE TABLE Post (
	id bigint NOT NULL,
	title varchar(100),
	slug varchar(100),
	teaser varchar(4000),
	body varchar(4000),
	posted_on TIMESTAMP,
	author_id bigint,
	PRIMARY KEY (id)
);


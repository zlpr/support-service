CREATE TABLE IF NOT EXISTS users (
    id          BIGSERIAL PRIMARY KEY,
    password    CHARACTER VARYING(60) NOT NULL,
    first_name  CHARACTER VARYING(255) NOT NULL,
    last_name   CHARACTER VARYING(255) NOT NULL,
    email       CHARACTER VARYING(255) NOT NULL UNIQUE
);
CREATE TABLE IF NOT EXISTS chat (
    id          BIGSERIAL PRIMARY KEY,
    status    CHARACTER VARYING(60) NOT NULL
    );
CREATE TABLE IF NOT EXISTS participant (
    id          BIGSERIAL PRIMARY KEY
    );
CREATE TABLE IF NOT EXISTS participant_chat (
    participant_id           BIGSERIAL NOT NULL,
    chat_id                  BIGSERIAL NOT NULL,
    CONSTRAINT participant_chat_key UNIQUE (participant_id,chat_id )
    );

CREATE TABLE IF NOT EXISTS comment (
    id              BIGSERIAL PRIMARY KEY,
    chat_id          BIGSERIAL NOT NULL,
    participant_id   BIGSERIAL NOT NULL,
    message         CHARACTER VARYING(600) NOT NULL,
    instant         TIMESTAMP NOT NULL
    );

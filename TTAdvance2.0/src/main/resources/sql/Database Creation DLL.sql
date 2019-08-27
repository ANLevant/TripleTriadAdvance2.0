-- Table: ttadvancet3.PLAYER

-- DROP TABLE ttadvancet3.PLAYER;

CREATE TABLE ttadvancet3.PLAYER
(
    ID serial NOT NULL,
    NAME character varying(255) COLLATE pg_catalog.default NOT NULL,
	PASSWORD character varying(255) NOT NULL,
    EMAIL character varying(255) COLLATE pg_catalog.default NOT NULL,
    POINTS numeric(10),
    CONSTRAINT PLAYER_pkey PRIMARY KEY (ID)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE ttadvancet3.PLAYER
    OWNER to postgres;

	
-- Table: ttadvancet3.DECK

-- DROP TABLE ttadvancet3.DECK;

CREATE TABLE ttadvancet3.DECK
(
    ID serial NOT NULL,
    NAME character varying(255) COLLATE pg_catalog.default NOT NULL,
	ABBREVIATION character varying(5) COLLATE pg_catalog.default NOT NULL,
    CONSTRAINT DECK_pkey PRIMARY KEY (ID)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE ttadvancet3.DECK
    OWNER to postgres;
COMMENT ON TABLE ttadvancet3.DECK
    IS 'Table to represent a Card Deck';
	
-- Table: ttadvancet3.ELEMENT

-- DROP TABLE ttadvancet3.ELEMENT;

CREATE TABLE ttadvancet3.ELEMENT
(
    ID serial NOT NULL,
    NAME character varying(255) NOT NULL,
    CONSTRAINT ELEMENT_PKey PRIMARY KEY (ID)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE ttadvancet3.ELEMENT
    OWNER to postgres;	

-- Table: ttadvancet3.GAME

-- DROP TABLE ttadvancet3.GAME;

CREATE TABLE ttadvancet3.GAME
(
    ID serial NOT NULL,
    HOST_PLAYER_ID integer NOT NULL,
    CHALLENGER_PLAYER_ID integer,
	PLAYER_TO_MOVE_ID integer,
    USABLE_DECKS_IDS integer[] NOT NULL,
    HOST_PLAYER_HAND_CARD_IDS integer[],
    CHALLENGER_PLAYER_HAND_CARD_IDS integer[],
    USABLE_LEVELS integer[] NOT NULL,
    RULESET_RULES_IDS integer[],
    CONSTRAINT GAME_pkey PRIMARY KEY (ID),
    CONSTRAINT GAME_CHALLENGER_PLAYER_ID FOREIGN KEY (CHALLENGER_PLAYER_ID)
        REFERENCES ttadvancet3.PLAYER (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT GAME_HOST_PLAYER_ID FOREIGN KEY (HOST_PLAYER_ID)
        REFERENCES ttadvancet3.PLAYER (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
	CONSTRAINT GAME_PLAYER_TO_MOVE_ID FOREIGN KEY (PLAYER_TO_MOVE_ID)
        REFERENCES ttadvancet3.PLAYER (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE ttadvancet3.GAME
    OWNER to postgres;

-- Table: ttadvancet3.GAMEBOARD

-- DROP TABLE ttadvancet3.GAMEBOARD;

CREATE TABLE ttadvancet3.GAMEBOARD
(
    GAME_ID integer NOT NULL,
    FIRST_SLOT integer,
    SECOND_SLOT integer,
    THIRD_SLOT integer,
    FOURHT_SLOT integer,
    FIFTH_SLOT integer,
    SIXTH_SLOT integer,
    SEVENTH_SLOT integer,
    EIHGTH_SLOT integer,
    NINTH_SLOT integer,
    CONSTRAINT GAMEBOARD_PKEY PRIMARY KEY (GAME_ID),
    CONSTRAINT BOARD_GAME_ID FOREIGN KEY (GAME_ID)
        REFERENCES ttadvancet3.GAME (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE ttadvancet3.GAMEBOARD
    OWNER to postgres;
	
-- Table: ttadvancet3.CARD

-- DROP TABLE ttadvancet3.CARD;

CREATE TABLE ttadvancet3.CARD
(
    ID serial NOT NULL,
	NAME character varying(255),
    TOP_VALUE numeric(2) NOT NULL,
    BOTTOM_VALUE numeric(2) NOT NULL,
    RIGHT_VALUE numeric(2) NOT NULL,
    LEFT_VALUE numeric(2) NOT NULL,
    DECK_ID integer NOT NULL,
	LEVEL_NUMBER numeric(2) NOT NULL,
	ELEMENT_ID integer NOT NULL,
    CONSTRAINT CARD_pkey PRIMARY KEY (ID),
    CONSTRAINT CARD_DECK_ID FOREIGN KEY (DECK_ID)
        REFERENCES ttadvancet3.DECK (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
	CONSTRAINT CARD_ELEMENT_ID FOREIGN KEY (ELEMENT_ID)
        REFERENCES ttadvancet3.ELEMENT (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE ttadvancet3.CARD
    OWNER to postgres;
COMMENT ON TABLE ttadvancet3.CARD
    IS 'Table to hold the information of all existing cards';
	
-- Table: ttadvancet3.RULES

-- DROP TABLE ttadvancet3.RULES;

CREATE TABLE ttadvancet3.RULES
(
    ID serial NOT NULL,
    NAME character varying(255) COLLATE pg_catalog.default NOT NULL,
    CONSTRAINT RULES_pkey PRIMARY KEY (ID)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE ttadvancet3.RULES
    OWNER to postgres;
	
-- Table: ttadvancet3.PLAYER_CARDS

-- DROP TABLE ttadvancet3.PLAYER_CARDS;

CREATE TABLE ttadvancet3.PLAYER_CARDS
(
    PLAYER_ID integer NOT NULL,
    CARD_ID integer NOT NULL,
    AMMOUNT_OWNED numeric(2) NOT NULL,
    CONSTRAINT PLAYER_CARDS_pkey PRIMARY KEY (PLAYER_ID, CARD_ID),
    CONSTRAINT CARD_ID_FK FOREIGN KEY (CARD_ID)
        REFERENCES ttadvancet3.CARD (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT PLAYER_ID_FK FOREIGN KEY (PLAYER_ID)
        REFERENCES ttadvancet3.PLAYER (ID) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE ttadvancet3.PLAYER_CARDS
    OWNER to postgres;
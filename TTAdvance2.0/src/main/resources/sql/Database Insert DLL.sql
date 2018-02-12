-- Table: ttadvancet3.PLAYER
INSERT INTO ttadvancet3.PLAYER (name, email, password) VALUES('ANLevant', 'levant.alejandro@hotmail.com', '8339f515da14eaf568c575e6be6cb308d48d0453de2fb3ab75dc7930673bf81c');
INSERT INTO ttadvancet3.PLAYER(name, email, password) VALUES('JPandoraMed', 'juanapiola@hotmail.com', 'fa674cd1bbd473cde6f4bc130f261bbf9b8f89c5cf3b9badb3ea2bebac6cdae1');

-- Table: ttadvancet3.DECK
INSERT INTO ttadvancet3.DECK (name, abbreviation) VALUES('Final Fantasy Origins', 'FFO');

-- Table: ttadvancet3.ELEMENT
INSERT INTO ttadvancet3.ELEMENT (name) VALUES('None');
INSERT INTO ttadvancet3.ELEMENT (name) VALUES('Poison');
INSERT INTO ttadvancet3.ELEMENT (name) VALUES('Water');
INSERT INTO ttadvancet3.ELEMENT (name) VALUES('Dark');

-- Table: ttadvancet3.GAME
INSERT INTO ttadvancet3.game(host_player_id, challenger_player_id, usable_decks_ids, host_player_hand_card_ids, challenger_player_hand_card_ids, usable_levels, ruleset_rules_ids, game_matrix) VALUES (1, 2, {1}, {1,3,5,7,9}, {2,4,6,8,10}, {1,2,3}, null, null);

-- Table: ttadvancet3.CARD

-- Final Fantasy Origins LV1
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Hornet', 1, 1, 1, 2, 2, 2, 1,);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Imp', 1, 1, 1, 4, 1, 4, 3);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('LegEater', 1, 1, 1, 2, 2, 1, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Mage', 1, 1, 1, 2, 1, 2, 6);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Petit', 1, 1, 1, 1, 1, 4, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Poison Bat', 1, 2, 1, 3, 5, 1, 3);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Sasquatch', 1, 1, 1, 3, 3, 5, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Sea Troll', 1, 3, 1, 3, 5, 2, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Skeleton', 1, 4, 1, 1, 2, 6, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Sprinter', 1, 1, 1, 5, 2, 2, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Wererat', 1, 1, 1, 5, 2, 1, 3);

-- Table: ttadvancet3.RULES

-- Table: ttadvancet3.PLAYER_CARDS
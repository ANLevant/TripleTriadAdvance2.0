-- Table: ttadvancet3.PLAYER
INSERT INTO ttadvancet3.PLAYER (name, email, password) VALUES('ANLevant', 'levant.alejandro@hotmail.com', '8339f515da14eaf568c575e6be6cb308d48d0453de2fb3ab75dc7930673bf81c');
INSERT INTO ttadvancet3.PLAYER(name, email, password) VALUES('JPandoraMed', 'juanapiola@hotmail.com', 'fa674cd1bbd473cde6f4bc130f261bbf9b8f89c5cf3b9badb3ea2bebac6cdae1');

-- Table: ttadvancet3.DECK
INSERT INTO ttadvancet3.DECK (name, abbreviation) VALUES('Final Fantasy Origins', 'FFO');
INSERT INTO ttadvancet3.DECK (name, abbreviation) VALUES('Final Fantasy IV', 'FFIV');
INSERT INTO ttadvancet3.DECK (name, abbreviation) VALUES('Final Fantasy V', 'FFV');
INSERT INTO ttadvancet3.DECK (name, abbreviation) VALUES('Final Fantasy VI', 'FFVI');
INSERT INTO ttadvancet3.DECK (name, abbreviation) VALUES('Final Fantasy VII', 'FFVII');
INSERT INTO ttadvancet3.DECK (name, abbreviation) VALUES('Final Fantasy VIII', 'FF8');
INSERT INTO ttadvancet3.DECK (name, abbreviation) VALUES('Final Fantasy IX', 'FFIX');
INSERT INTO ttadvancet3.DECK (name, abbreviation) VALUES('Final Fantasy X', 'FFX');
INSERT INTO ttadvancet3.DECK (name, abbreviation) VALUES('Final Fantasy Tactics', 'FFT');

-- Table: ttadvancet3.ELEMENT
INSERT INTO ttadvancet3.ELEMENT (name) VALUES('None');
INSERT INTO ttadvancet3.ELEMENT (name) VALUES('Poison');
INSERT INTO ttadvancet3.ELEMENT (name) VALUES('Water');
INSERT INTO ttadvancet3.ELEMENT (name) VALUES('Dark');
INSERT INTO ttadvancet3.ELEMENT (name) VALUES('Ice');

-- Table: ttadvancet3.GAME
INSERT INTO ttadvancet3.GAME(host_player_id, challenger_player_id, usable_decks_ids, host_player_hand_card_ids, challenger_player_hand_card_ids, usable_levels, ruleset_rules_ids) VALUES (1, 2, '{1}', '{1,3,5,7,9}', '{2,4,6,8,10}', '{1,2,3}', null);

-- Table: ttadvancet3.GAMEBOARD
INSERT INTO ttadvancet3.GAMEBOARD(game_id, first_slot, second_slot, third_slot, fourht_slot, fifth_slot, sixth_slot, seventh_slot, eihgth_slot, ninth_slot) VALUES (1,0,0,0,0,0,0,0,0,0);

-- Table: ttadvancet3.RULES
INSERT INTO ttadvancet3.RULES(name) VALUES('Open');
INSERT INTO ttadvancet3.RULES(name) VALUES('Random');
INSERT INTO ttadvancet3.RULES(name) VALUES('Elemental');
INSERT INTO ttadvancet3.RULES(name) VALUES('Sudden Death');
INSERT INTO ttadvancet3.RULES(name) VALUES('Same');
INSERT INTO ttadvancet3.RULES(name) VALUES('Plus');
INSERT INTO ttadvancet3.RULES(name) VALUES('SameWall');
INSERT INTO ttadvancet3.RULES(name) VALUES('PlusWall');

-- Table: ttadvancet3.CARD

-- Final Fantasy Origins : FFO

-- Final Fantasy Origins LV1

INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Hornet I/II/III', 1, 1, 1, 2, 2, 2, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Imp', 1, 1, 1, 4, 1, 4, 3);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('LegEater', 1, 1, 1, 2, 2, 1, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Mage', 1, 1, 1, 2, 1, 2, 6);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Petit', 1, 1, 1, 1, 1, 4, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Poison Bat', 1, 2, 1, 3, 5, 1, 3);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Sasquatch', 1, 1, 1, 3, 3, 5, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Sea Troll', 1, 3, 1, 3, 5, 2, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Skeleton I/II/III', 1, 4, 1, 1, 2, 6, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Sprinter', 1, 1, 1, 5, 2, 2, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Wererat', 1, 1, 1, 5, 2, 1, 3);

-- Final Fantasy Origins : FFIV

-- Final Fantasy IV LV1

INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Egg', 2, 1, 1, 4, 1, 1, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Larva', 2, 1, 1, 3, 2, 5, 2);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Mooncell', 2, 1, 1, 1, 5, 4, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Pike', 2, 1, 1, 5, 3, 2, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Puppet', 2, 1, 1, 3, 4, 3, 2);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Sand Moth', 2, 1, 1, 2, 3, 5, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Sandpede', 2, 1, 1, 4, 2, 3, 2);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Sword Rat', 2, 1, 1, 1, 2, 4, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Tiny Mage', 2, 1, 1, 2, 1, 3, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Zombie', 2, 1, 1, 1, 2, 2, 6);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Zuu', 2, 1, 1, 2, 3, 1, 3);

-- Final Fantasy V : FFV

-- Final Fantasy V LV1

INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Bighorn', 3, 1, 1, 4, 2, 4, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Defeater', 3, 1, 1, 3, 5, 1, 2);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Gatlings', 3, 1, 1, 5, 3, 2, 3);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Goblin', 3, 1, 1, 1, 2, 4, 5);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Motor Trap', 3, 1, 1, 2, 2, 4, 3);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('NutEater', 3, 1, 1, 4, 1, 3, 2);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Poltergeist', 3, 4, 1, 4, 3, 2, 2);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Rikalld Mage', 3, 1, 1, 1, 3, 4, 3);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Skeleton V', 3, 4, 1, 1, 1, 1, 6);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Steel Bat', 3, 1, 1, 3, 2, 3, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('White Snake', 3, 1, 1, 4, 2, 1, 4);

-- Final Fantasy VI : FFVI

-- Final Fantasy VI LV1

INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Brawler', 4, 2, 1, 3, 1, 3, 5);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Doberman', 4, 1, 1, 2, 3, 6, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Hornet IV', 4, 1, 1, 5, 1, 4, 2);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Leafer', 4, 5, 1, 4, 1, 5, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Lobo', 4, 1, 1, 2, 2, 3, 3);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Merchant', 4, 2, 1, 2, 1, 4, 4);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Repo Man', 4, 1, 1, 2, 2, 5, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Rhodox', 4, 1, 1, 4, 5, 1, 2);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Still Going', 4, 4, 1, 1, 3, 3, 5);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Templar', 4, 1, 1, 6, 1, 1, 1);
INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Trilobiter', 4, 1, 1, 3, 2, 4, 3);

-- Final Fantasy VII : FFVII

-- Final Fantasy VII LV1

INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Hornet', 1, 1, 1, 2, 2, 2, 1);
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

-- Final Fantasy VIII : FF8

-- Final Fantasy VIII LV1

INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Hornet', 1, 1, 1, 2, 2, 2, 1);
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

-- Final Fantasy IX : FFIX

-- Final Fantasy IX LV1

INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Hornet', 1, 1, 1, 2, 2, 2, 1);
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

-- Final Fantasy X : FFX

-- Final Fantasy X LV1

INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Hornet', 1, 1, 1, 2, 2, 2, 1);
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

-- Final Fantasy Tactics : FFT

-- Final Fantasy Tactics LV1

INSERT INTO ttadvancet3.CARD (name, deck_id, element_id, level_number, top_value, bottom_value, right_value, left_value) VALUES('Hornet', 1, 1, 1, 2, 2, 2, 1);
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
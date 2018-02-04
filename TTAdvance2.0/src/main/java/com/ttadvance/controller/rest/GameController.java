package com.ttadvance.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Game")
public interface GameController {

    long createGame(long hostPlayerId, long[] usableDecks, long[] usableLevels, long[] ruleset);

}

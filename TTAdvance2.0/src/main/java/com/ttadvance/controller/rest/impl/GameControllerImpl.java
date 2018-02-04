package com.ttadvance.controller.rest.impl;

import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.service.IGameService;
import com.ttadvance.controller.rest.GameController;
import org.springframework.beans.factory.annotation.Autowired;

public class GameControllerImpl implements GameController {

    @Autowired
    private IGameService gameService;

    @Override
    public long createGame(long hostPlayerId, long[] usableDecks, long[] usableLevels, long[] ruleset) {

        GameDTO createdGameDTO = gameService.createGame(hostPlayerId, usableDecks, usableLevels, ruleset);
        return createdGameDTO.getId();
    }
}

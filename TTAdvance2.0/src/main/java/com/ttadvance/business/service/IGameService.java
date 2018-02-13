package com.ttadvance.business.service;

import com.ttadvance.business.dto.GameBoardDTO;
import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.dto.GameRulesDTO;

import java.io.IOException;
import java.util.List;

/**
 * The Interface for GameServices, in case various versions are needed.
 */
public interface IGameService {

	GameDTO createGame(long hostPlayerId, Integer[] usableDecks, Integer[] usableLevels, Integer[] ruleset);

    void updateGame(GameDTO gameDTO, int yPosition, int xPosition) throws IOException;

    GameDTO findGame(long gameId) throws IOException;

    GameBoardDTO findGameBoard(long gameId) throws IOException;
}

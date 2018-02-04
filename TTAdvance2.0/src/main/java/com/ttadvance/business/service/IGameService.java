package com.ttadvance.business.service;

import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.dto.GameRulesDTO;

/**
 * The Interface for GameServices, in case various versions are needed.
 */
public interface IGameService {

	GameDTO createGame(long hostPlayerId, long[] usableDecks, long[] usableLevels, long[] ruleset);
	
	GameDTO findGame(long gameId);
}

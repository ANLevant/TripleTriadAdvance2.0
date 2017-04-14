package com.ttadvance.business.service;

import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.dto.GameRulesDTO;

/**
 * The Interface for GameServices, in case various versions are needed.
 */
public interface IGameService {
	
	/**
	 * Creates a game.
	 *
	 * @param playerId the player id
	 * @param gameRules the game rules
	 * @return the game DTO
	 */
	public GameDTO createGame(long playerId, GameRulesDTO gameRules);
}

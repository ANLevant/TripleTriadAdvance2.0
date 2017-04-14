
package com.ttadvance.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.dto.GameRulesDTO;
import com.ttadvance.business.service.IGameService;
import com.ttadvance.persistence.dao.GameDAO;
import com.ttadvance.persistence.model.Game;

/**
 * Gamee Service Implementation that communicates with the Relational Database DAO to do operations
 * over games
 */
@Service
public class GameServiceImpl implements IGameService {
	
	@Autowired
	private GameDAO gameDao;

	/**
	 * @see com.ttadvance.business.service.IGameService#createGame(long, com.ttadvance.business.dto.GameRulesDTO)
	 */
	@Override
	public GameDTO createGame(long playerId, GameRulesDTO gameRules) {	
		Game game = new Game();
		
		gameDao.save(game);
		
		GameDTO gameDTO = new GameDTO();
			
		return gameDTO;
	}

	/**
	 * @see com.ttadvance.business.service.IGameService#findGame(long)
	 */
	@Override
	public GameDTO findGame(long gameId) {
		
		Game game = gameDao.findOne(gameId);
		
		GameDTO gameDto = new GameDTO();
		
		return null;
	}

}

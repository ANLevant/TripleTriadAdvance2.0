
package com.ttadvance.business.service.impl;

import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.mappers.EntityToDTOMapper;
import com.ttadvance.business.service.IGameService;
import com.ttadvance.persistence.dao.GameDAO;
import com.ttadvance.persistence.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Gamee Service Implementation that communicates with the Relational Database DAO to do operations
 * over games
 */
@Service
public class GameServiceImpl implements IGameService {
	
	@Autowired
	private GameDAO gameDao;

	/**
	 * @see com.ttadvance.business.service.IGameService#createGame(long, Integer[], Integer[], Integer[])
	 */
	@Override
	public GameDTO createGame(long hostPlayerId, Integer[] usableDecks, Integer[] usableLevels, Integer[] ruleset) {
		Game game = new Game();

		game.setHostPlayerId(hostPlayerId);
		game.setUsableDecksIds(usableDecks);
		game.setUsableLevels(usableLevels);
		game.setRulesetRulesIds(ruleset);

		game = gameDao.save(game);

		GameDTO gameDTO = new GameDTO();

		gameDTO.setId(game.getId());
			
		return gameDTO;
	}

	@Override
	public void updateGame(GameDTO gameDTO, int yPosition, int xPosition) throws IOException {
		GameDTO actualGameDTO = this.findGame(gameDTO.getId());

		if(actualGameDTO.getGameMatrix()[yPosition][xPosition] == 0){
			EntityToDTOMapper<GameDTO, Game> entityToDTOMapper = new EntityToDTOMapper<GameDTO, Game>();
			Game gameToModify = entityToDTOMapper.map(gameDTO, Game.class);
			Integer[][] newMatrix = gameToModify.getGameMatrix();
			gameToModify.setGameMatrix(newMatrix);
			gameDao.save(gameToModify);
		}

		throw new RuntimeException();
	}

	/**
	 * @see com.ttadvance.business.service.IGameService#findGame(long)
	 */
	@Override
	public GameDTO findGame(long gameId) throws IOException {
		
		Game game = gameDao.findOne(gameId);

		return new EntityToDTOMapper<Game, GameDTO>().map(game, GameDTO.class);
	}

}

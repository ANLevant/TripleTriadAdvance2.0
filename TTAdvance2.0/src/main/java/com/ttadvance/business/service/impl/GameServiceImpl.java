
package com.ttadvance.business.service.impl;

import com.ttadvance.business.dto.GameBoardDTO;
import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.mappers.EntityToDTOMapper;
import com.ttadvance.business.service.IGameService;
import com.ttadvance.persistence.dao.GameBoardDAO;
import com.ttadvance.persistence.dao.GameDAO;
import com.ttadvance.persistence.model.Game;
import com.ttadvance.persistence.model.GameBoard;
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

	@Autowired
	private GameBoardDAO gameBoardDAO;

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
	}

	/**
	 * @see com.ttadvance.business.service.IGameService#findGame(long)
	 */
	@Override
	public GameDTO findGame(long gameId) throws IOException {
		
		Game game = gameDao.findOne(gameId);

		return new EntityToDTOMapper<Game, GameDTO>().map(game, GameDTO.class);
	}

	@Override
	public GameBoardDTO findGameBoard(long gameId) throws IOException {
		GameBoard gameBoard = gameBoardDAO.findOne(gameId);
		return new EntityToDTOMapper<GameBoard, GameBoardDTO>().map(gameBoard, GameBoardDTO.class);
	}

}

package com.ttadvance.business.service.impl;

import org.springframework.stereotype.Service;

import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.dto.GameRulesDTO;
import com.ttadvance.business.service.IGameService;

@Service
public class GameServiceImpl implements IGameService {

	@Override
	public GameDTO createGame(long playerId, GameRulesDTO gameRules) {	
		GameDTO gameDTO = new GameDTO();
			
		return gameDTO;
	}

}

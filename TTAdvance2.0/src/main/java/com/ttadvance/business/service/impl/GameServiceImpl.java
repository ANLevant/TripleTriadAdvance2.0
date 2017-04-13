package com.ttadvance.business.service.impl;

import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.dto.GameRulesDTO;
import com.ttadvance.business.service.IGameService;

public class GameServiceImpl implements IGameService {

	@Override
	public GameDTO createCate(long playerId, GameRulesDTO gameRules) {	
		GameDTO gameDTO = new GameDTO();
			
		return gameDTO;
	}

}

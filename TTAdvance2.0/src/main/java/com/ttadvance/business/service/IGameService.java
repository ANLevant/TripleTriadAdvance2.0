package com.ttadvance.business.service;

import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.dto.GameRulesDTO;

public interface IGameService {
	
	public GameDTO createCate(long playerId, GameRulesDTO gameRules);
}

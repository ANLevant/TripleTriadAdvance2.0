package com.ttadvance.controller.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.service.IGameService;

@Controller
public class GameController {
	
	@Autowired
	private MessageSendingOperations<String> messagingTemplate;
	
	@Autowired
	private IGameService gameService;
	
	@MessageMapping("/game/{gameId}/makeMove")
	@SendTo("/topic/game/{gameId}")
	public GameDTO makeMove(@DestinationVariable long gameId, GameDTO gameDTO){
		return gameDTO;	
	}
	
	@SubscribeMapping("/game/{gameId}")
	public void getGame(@DestinationVariable long gameId){
		messagingTemplate.convertAndSend("/topic/game/"+gameId, new GameDTO());
	}

}

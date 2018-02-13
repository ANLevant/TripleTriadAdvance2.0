package com.ttadvance.controller.rest;

import com.ttadvance.business.dto.GameBoardDTO;
import com.ttadvance.business.dto.GameDTO;
import com.ttadvance.business.service.IGameService;
import com.ttadvance.persistence.model.GameBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Component
@RestController
@RequestMapping("/GameWeb")
public class GameWebController {

    @Autowired
    private IGameService gameService;

    @RequestMapping(method = {RequestMethod.POST})
    public long createGame(Long hostPlayerId, Integer[] usableDecks, Integer[] usableLevels, Integer[] ruleset) {
        GameDTO createdGameDTO = gameService.createGame(hostPlayerId, usableDecks, usableLevels, ruleset);
        return createdGameDTO.getId();
    }

    @RequestMapping(path = "/{gameId}", method = {RequestMethod.GET})
    public GameDTO getGame(@PathVariable  Long gameId) throws IOException {
        return gameService.findGame(gameId);
    }

    @RequestMapping(path = "/{gameId}/gameBoard", method = {RequestMethod.GET})
    public GameBoardDTO getGameBoard(@PathVariable  Long gameId) throws IOException {
        return gameService.findGameBoard(gameId);
    }

    @RequestMapping(path = "/{gameId}", method = {RequestMethod.PUT})
    public void makeMove(@PathVariable Long gameId, Long playerId, Integer cardId, int xPosition, int yPosition) throws IOException {
        GameDTO modifiedGameDTO = gameService.findGame(gameId);
        /*Integer[][] newMatrix = modifiedGameDTO.getGameMatrix();
        newMatrix[yPosition][xPosition] = cardId;
        modifiedGameDTO.setGameMatrix(newMatrix);*/
        if(modifiedGameDTO.getPlayerToMoveId() == playerId){
            if(modifiedGameDTO.getPlayerToMoveId() == modifiedGameDTO.getHostPlayerId() && Arrays.asList(modifiedGameDTO.getHostPlayerHandCardIds()).contains(cardId)){
                gameService.updateGame(modifiedGameDTO, yPosition, xPosition);
            }
        }
        throw new RuntimeException();
    }

}

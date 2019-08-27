package com.ttadvance.business.dto;

public class GameBoardDTO {

    /**Reference to game id and */
    private Long gameId;

    /**Slot reference to a card. null if empty*/
    private Long firstSlot;

    /**Slot reference to a card. null if empty*/
    private Long secondSlot;

    /**Slot reference to a card. null if empty*/
    private Long thirdSlot;

    /**Slot reference to a card. null if empty*/
    private Long fourthSlot;

    /**Slot reference to a card. null if empty*/
    private Long fifthSlot;

    /**Slot reference to a card. null if empty*/
    private Long sixthSlot;

    /**Slot reference to a card. null if empty*/
    private Long seventhSlot;

    /**Slot reference to a card. null if empty*/
    private Long eighthSlot;

    /**Slot reference to a card. null if empty*/
    private Long ninthSlot;

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
}

package com.ttadvance.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class to model a TT Board Game.
 *
 * @author Levant, ID = 48774
 */
@Entity
@Table(name="GAME", schema = "ttadvancet3")
public class GameBoard {

    /**Reference to game id and */
    @Id
    private Long gameId;

    /**Slot reference to a card. null if empty*/
    @Column(name = "first_slot")
    private Long firstSlot;

    /**Slot reference to a card. null if empty*/
    @Column(name = "second_slot")
    private Long secondSlot;

    /**Slot reference to a card. null if empty*/
    @Column(name = "third_slot")
    private Long thirdSlot;

    /**Slot reference to a card. null if empty*/
    @Column(name = "fourth_slot")
    private Long fourthSlot;

    /**Slot reference to a card. null if empty*/
    @Column(name = "fifth_slot")
    private Long fifthSlot;

    /**Slot reference to a card. null if empty*/
    @Column(name = "sixth_slot")
    private Long sixthSlot;

    /**Slot reference to a card. null if empty*/
    @Column(name = "seventh_slot")
    private Long seventhSlot;

    /**Slot reference to a card. null if empty*/
    @Column(name = "eighth_slot")
    private Long eighthSlot;

    /**Slot reference to a card. null if empty*/
    @Column(name = "ninth_slot")
    private Long ninthSlot;

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
}

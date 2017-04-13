package com.ttadvance.persistence.model;

/**
 * Class that models a player move on a game.
 *
 * @author Levant, ID = 48774
 */
public class PlayerMove {

	/** The card id. */
	private long cardId;
	
	/** The player id who actually has the card. */
	private long playerId;
	
	/**
	 * Gets the card id.
	 *
	 * @return the card id
	 */
	public long getCardId() {
		return cardId;
	}
	
	/**
	 * Sets the card id.
	 *
	 * @param cardId the new card id
	 */
	public void setCardId(long cardId) {
		this.cardId = cardId;
	}
	
	/**
	 * Gets the player id.
	 *
	 * @return the player id
	 */
	public long getPlayerId() {
		return playerId;
	}
	
	/**
	 * Sets the player id.
	 *
	 * @param playerId the new player id
	 */
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
}

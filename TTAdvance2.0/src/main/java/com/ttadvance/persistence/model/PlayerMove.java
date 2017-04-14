package com.ttadvance.persistence.model;

import javax.persistence.Entity;

/**
 * Class that models a player move on a game.
 *
 * @author Levant, ID = 48774
 */
public class PlayerMove {

	/** The card id. */
	private long cardId;
	

	/** The owner player id. */
	private long ownerPlayerId;
	
	/** The player id who actually has the card. */
	private long actualHolderPlayerId;
	
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
	 * Gets the owner player id.
	 *
	 * @return the owner player id
	 */
	public long getOwnerPlayerId() {
		return ownerPlayerId;
	}

	/**
	 * Sets the owner player id.
	 *
	 * @param ownerPlayerId the new owner player id
	 */
	public void setOwnerPlayerId(long ownerPlayerId) {
		this.ownerPlayerId = ownerPlayerId;
	}

	/**
	 * Gets the actual holder player id.
	 *
	 * @return the actual holder player id
	 */
	public long getActualHolderPlayerId() {
		return actualHolderPlayerId;
	}

	/**
	 * Sets the actual holder player id.
	 *
	 * @param actualHolderPlayerId the new actual holder player id
	 */
	public void setActualHolderPlayerId(long actualHolderPlayerId) {
		this.actualHolderPlayerId = actualHolderPlayerId;
	}
}

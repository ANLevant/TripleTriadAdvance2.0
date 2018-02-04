package com.ttadvance.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class to model a TT game.
 *
 * @author Levant, ID = 48774
 */
@Entity
public class Game {

	/** The id. */
	@Id
	@GeneratedValue
	private long id;
	
	/** The host player id. */
	private long hostPlayerId;
	
	/** The challenger played id. */
	private long challengerPlayedId;
	
	/** The game matrix. */
	private PlayerMove[][] gameMatrix;

	/** The host player hand represented in card ids*/
	private long[] hostPlayerHand;

	/**The challenger player hand represented in card ids*/
	private long[] challengerPlayerHand;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the host player id.
	 *
	 * @return the host player id
	 */
	public long getHostPlayerId() {
		return hostPlayerId;
	}

	/**
	 * Sets the host player id.
	 *
	 * @param hostPlayerId the new host player id
	 */
	public void setHostPlayerId(long hostPlayerId) {
		this.hostPlayerId = hostPlayerId;
	}

	/**
	 * Gets the challenger played id.
	 *
	 * @return the challenger played id
	 */
	public long getChallengerPlayedId() {
		return challengerPlayedId;
	}

	/**
	 * Sets the challenger played id.
	 *
	 * @param challengerPlayedId the new challenger played id
	 */
	public void setChallengerPlayedId(long challengerPlayedId) {
		this.challengerPlayedId = challengerPlayedId;
	}

	/**
	 * Gets the game matrix.
	 *
	 * @return the game matrix
	 */
	public PlayerMove[][] getGameMatrix() {
		return gameMatrix;
	}

	/**
	 * Sets the game matrix.
	 *
	 * @param gameMatrix the new game matrix
	 */
	public void setGameMatrix(PlayerMove[][] gameMatrix) {
		this.gameMatrix = gameMatrix;
	}


	/**
	 * Gets the host player hand.
	 *
	 * @return the host player hand
	 */
	public long[] getHostPlayerHand() {
		return hostPlayerHand;
	}

	/**
	 * Sets the host player hand.
	 *
	 * @param hostPlayerHand the new host player hand
	 */
	public void setHostPlayerHand(long[] hostPlayerHand) {
		this.hostPlayerHand = hostPlayerHand;
	}

	/**
	 * Gets the challenger player hand.
	 *
	 * @return the challenger player hand
	 */
	public long[] getChallengerPlayerHand() {
		return challengerPlayerHand;
	}

	/**
	 * Sets the challenger player hand.
	 *
	 * @param challengerPlayerHand the new challenger player hand
	 */
	public void setChallengerPlayerHand(long[] challengerPlayerHand) {
		this.challengerPlayerHand = challengerPlayerHand;
	}
}

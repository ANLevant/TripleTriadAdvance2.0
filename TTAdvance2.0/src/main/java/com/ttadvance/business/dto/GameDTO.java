package com.ttadvance.business.dto;

/**
 * Class to model a TT game.
 *
 * @author Levant, ID = 48774
 */
public class GameDTO {

	/** The id. */
	private long id;
	
	/** The host player id. */
	private long hostPlayerId;
	
	/** The host payer hand card ids. */
	private long[] hostPayerHandCardIds;
	
	/** The challenger played id. */
	private long challengerPlayerId;
	
	/** The challenger player card ids. */
	private long[] challengerPlayerCardIds;
	
	/** The player to move id. */
	private long playerToMoveId;
	
	/** The first player to move id. */
	private long firstPlayerToMoveId;
	
	/** The game matrix. */
	private PlayerMoveDTO[][] gameMatrix;

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
	public long getChallengerPlayerId() {
		return challengerPlayerId;
	}

	/**
	 * Sets the challenger played id.
	 *
	 * @param challengerPlayerId the new challenger player id
	 */
	public void setChallengerPlayerId(long challengerPlayerId) {
		this.challengerPlayerId = challengerPlayerId;
	}

	/**
	 * Gets the game matrix.
	 *
	 * @return the game matrix
	 */
	public PlayerMoveDTO[][] getGameMatrix() {
		return gameMatrix;
	}

	/**
	 * Sets the game matrix.
	 *
	 * @param gameMatrix the new game matrix
	 */
	public void setGameMatrix(PlayerMoveDTO[][] gameMatrix) {
		this.gameMatrix = gameMatrix;
	}

	/**
	 * Gets the player to move id.
	 *
	 * @return the player to move id
	 */
	public long getPlayerToMoveId() {
		return playerToMoveId;
	}

	/**
	 * Sets the player to move id.
	 *
	 * @param playerToMoveId the new player to move id
	 */
	public void setPlayerToMoveId(long playerToMoveId) {
		this.playerToMoveId = playerToMoveId;
	}

	/**
	 * Gets the first player to move id.
	 *
	 * @return the first player to move id
	 */
	public long getFirstPlayerToMoveId() {
		return firstPlayerToMoveId;
	}

	/**
	 * Sets the first player to move id.
	 *
	 * @param firstPlayerToMoveId the new first player to move id
	 */
	public void setFirstPlayerToMoveId(long firstPlayerToMoveId) {
		this.firstPlayerToMoveId = firstPlayerToMoveId;
	}

	/**
	 * Gets the host payer hand card ids.
	 *
	 * @return the host payer hand card ids
	 */
	public long[] getHostPayerHandCardIds() {
		return hostPayerHandCardIds;
	}

	/**
	 * Sets the host payer hand card ids.
	 *
	 * @param hostPayerHandCardIds the new host payer hand card ids
	 */
	public void setHostPayerHandCardIds(long[] hostPayerHandCardIds) {
		this.hostPayerHandCardIds = hostPayerHandCardIds;
	}

	/**
	 * Gets the challenger player card ids.
	 *
	 * @return the challenger player card ids
	 */
	public long[] getChallengerPlayerCardIds() {
		return challengerPlayerCardIds;
	}

	/**
	 * Sets the challenger player card ids.
	 *
	 * @param challengerPlayerCardIds the new challenger player card ids
	 */
	public void setChallengerPlayerCardIds(long[] challengerPlayerCardIds) {
		this.challengerPlayerCardIds = challengerPlayerCardIds;
	}
	
}

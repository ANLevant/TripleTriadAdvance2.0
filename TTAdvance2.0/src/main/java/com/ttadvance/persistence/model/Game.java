package com.ttadvance.persistence.model;

import javax.persistence.*;

/**
 * Class to model a TT game.
 *
 * @author Levant, ID = 48774
 */
@Entity(name = "ttadvancet3.GAME")
public class Game {

	/** The id. */
	@Id
	@GeneratedValue
	private long id;
	
	/** The host player id. */
	/** The deck. */
	@ManyToOne(targetEntity=Player.class, fetch= FetchType.EAGER)
	private long hostPlayerId;
	
	/** The challenger played id. */
	/** The deck. */
	@ManyToOne(targetEntity=Player.class, fetch=FetchType.EAGER)
	private long challengerPlayedId;

	/** The host player hand represented in card ids*/
	private long[] hostPlayerHandCardIds;

	/**The challenger player hand represented in card ids*/
	private long[] challengerPlayerHandCardIds;

	/**The ruleset containing rules ids*/
	private long[] rulesetRulesIds;

	/**The usableDecksIds containing decks ids*/
	private long[] usableDecksIds;

	/**The usableLevels containing level numbers*/
	private long[] usableLevels;

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
	 * Gets the host player hand.
	 *
	 * @return the host player hand
	 */
	public long[] getHostPlayerHandCardIds() {
		return hostPlayerHandCardIds;
	}

	/**
	 * Sets the host player hand.
	 *
	 * @param hostPlayerHand the new host player hand
	 */
	public void setHostPlayerHandCardIds(long[] hostPlayerHand) {
		this.hostPlayerHandCardIds = hostPlayerHand;
	}

	/**
	 * Gets the challenger player hand.
	 *
	 * @return the challenger player hand
	 */
	public long[] getChallengerPlayerHandCardIds() {
		return challengerPlayerHandCardIds;
	}

	/**
	 * Sets the challenger player hand.
	 *
	 * @param challengerPlayerHand the new challenger player hand
	 */
	public void setChallengerPlayerHandCardIds(long[] challengerPlayerHand) {
		this.challengerPlayerHandCardIds = challengerPlayerHand;
	}

	public long[] getRulesetRulesIds() {
		return rulesetRulesIds;
	}

	public void setRulesetRulesIds(long[] rulesetRulesIds) {
		this.rulesetRulesIds = rulesetRulesIds;
	}

	public long[] getUsableDecksIds() {
		return usableDecksIds;
	}

	public void setUsableDecksIds(long[] usableDecksIds) {
		this.usableDecksIds = usableDecksIds;
	}

	public long[] getUsableLevels() {
		return usableLevels;
	}

	public void setUsableLevels(long[] usableLevels) {
		this.usableLevels = usableLevels;
	}
}

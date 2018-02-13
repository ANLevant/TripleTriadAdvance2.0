package com.ttadvance.business.dto;

import java.util.List;

/**
 * Class to model a TT game.
 *
 * @author Levant, ID = 48774
 */
public class GameDTO {

	/** The id. */
	private Long id;
	
	/** The host player id. */
	private Long hostPlayerId;

	/** The challenger player id. */
	private Long challengerPlayerId;

	/** The player to move id. */
	private Long playerToMoveId;
	
	/** The challenger player card ids. */
	private Integer[] challengerPlayerHandCardIds;

	/** The host payer hand card ids. */
	private Integer[] hostPlayerHandCardIds;

	/**The ruleset containing rules ids*/
	private Integer[] rulesetRulesIds;

	/**The usableDecksIds containing decks ids*/
	private Integer[] usableDecksIds;

	/**The usableLevels containing level numbers*/
	private Integer[] usableLevels;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getHostPlayerId() {
		return hostPlayerId;
	}

	public void setHostPlayerId(Long hostPlayerId) {
		this.hostPlayerId = hostPlayerId;
	}

	public Long getChallengerPlayerId() {
		return challengerPlayerId;
	}

	public void setChallengerPlayerId(Long challengerPlayerId) {
		this.challengerPlayerId = challengerPlayerId;
	}

	public Long getPlayerToMoveId() {
		return playerToMoveId;
	}

	public void setPlayerToMoveId(Long playerToMoveId) {
		this.playerToMoveId = playerToMoveId;
	}

	public Integer[] getChallengerPlayerHandCardIds() {
		return challengerPlayerHandCardIds;
	}

	public void setChallengerPlayerHandCardIds(Integer[] challengerPlayerHandCardIds) {
		this.challengerPlayerHandCardIds = challengerPlayerHandCardIds;
	}

	public Integer[] getHostPlayerHandCardIds() {
		return hostPlayerHandCardIds;
	}

	public void setHostPlayerHandCardIds(Integer[] hostPlayerHandCardIds) {
		this.hostPlayerHandCardIds = hostPlayerHandCardIds;
	}

	public Integer[] getRulesetRulesIds() {
		return rulesetRulesIds;
	}

	public void setRulesetRulesIds(Integer[] rulesetRulesIds) {
		this.rulesetRulesIds = rulesetRulesIds;
	}

	public Integer[] getUsableDecksIds() {
		return usableDecksIds;
	}

	public void setUsableDecksIds(Integer[] usableDecksIds) {
		this.usableDecksIds = usableDecksIds;
	}

	public Integer[] getUsableLevels() {
		return usableLevels;
	}

	public void setUsableLevels(Integer[] usableLevels) {
		this.usableLevels = usableLevels;
	}
}

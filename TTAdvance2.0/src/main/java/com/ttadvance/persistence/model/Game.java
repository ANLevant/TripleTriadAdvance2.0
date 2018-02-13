package com.ttadvance.persistence.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

/**
 * Class to model a TT game.
 *
 * @author Levant, ID = 48774
 */
@Entity
@Table(name="GAME", schema = "ttadvancet3")
public class Game {

	/** The id. */
	@Id
	@GeneratedValue
	private Long id;

	/** The host player id. */
	@Column(name = "host_player_id")
	private Long hostPlayerId;

	/** The challenger played id. */
	@Column(name = "challenger_player_id")
	private Long challengerPlayerId;

	/** The player to move id. */
	@Column(name = "player_to_move_id")
	private Long playerToMoveId;

	/** The host player hand represented in card ids*/
	@Column(name = "host_player_hand_card_ids")
	@Type(type = "com.ttadvance.persistence.model.customtypes.GenericArrayUserType")
	private Integer[] hostPlayerHandCardIds;

	/**The challenger player hand represented in card ids*/
	@Column(name = "challenger_player_hand_card_ids")
	@Type(type = "com.ttadvance.persistence.model.customtypes.GenericArrayUserType")
	private Integer[] challengerPlayerHandCardIds;

	/**The ruleset containing rules ids*/
	@Column(name = "ruleset_rules_ids")
	@Type(type = "com.ttadvance.persistence.model.customtypes.GenericArrayUserType")
	private Integer[] rulesetRulesIds;

	/**The usableDecksIds containing decks ids*/
	@Column(name = "usable_decks_ids")
	@Type(type = "com.ttadvance.persistence.model.customtypes.GenericArrayUserType")
	private Integer[] usableDecksIds;

	/**The usableLevels containing level numbers*/
	@Column(name = "usable_levels")
	@Type(type = "com.ttadvance.persistence.model.customtypes.GenericArrayUserType")
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

	public Integer[] getHostPlayerHandCardIds() {
		return hostPlayerHandCardIds;
	}

	public void setHostPlayerHandCardIds(Integer[] hostPlayerHandCardIds) {
		this.hostPlayerHandCardIds = hostPlayerHandCardIds;
	}

	public Integer[] getChallengerPlayerHandCardIds() {
		return challengerPlayerHandCardIds;
	}

	public void setChallengerPlayerHandCardIds(Integer[] challengerPlayerHandCardIds) {
		this.challengerPlayerHandCardIds = challengerPlayerHandCardIds;
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

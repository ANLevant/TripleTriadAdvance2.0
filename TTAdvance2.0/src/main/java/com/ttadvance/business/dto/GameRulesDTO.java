package com.ttadvance.business.dto;

import java.util.List;

/**
 * Class that models a game Ruleset.
 *
 * @author Levant, Id = 48774
 */
public class GameRulesDTO {

	/** The open choice. */
	private String openChoice;
	
	/** The trade choice. */
	private String tradeChoice;
	
	/** The same. */
	private boolean same;
	
	/** The plus. */
	private boolean plus;
	
	/** The same wall. */
	private boolean sameWall;
	
	/** The plus wall. */
	private boolean plusWall;
	
	/** The combo. */
	private boolean combo;
	
	/** The random. */
	private boolean random;
	
	/** The elemental. */
	private boolean elemental;
	
	/** The card decks. */
	private List<Long> cardDecksIds;
	
	/**
	 * Gets the open choice.
	 *
	 * @return the open choice
	 */
	public String getOpenChoice() {
		return openChoice;
	}
	
	/**
	 * Sets the open choice.
	 *
	 * @param openChoice the new open choice
	 */
	public void setOpenChoice(String openChoice) {
		this.openChoice = openChoice;
	}
	
	/**
	 * Gets the trade choice.
	 *
	 * @return the trade choice
	 */
	public String getTradeChoice() {
		return tradeChoice;
	}
	
	/**
	 * Sets the trade choice.
	 *
	 * @param tradeChoice the new trade choice
	 */
	public void setTradeChoice(String tradeChoice) {
		this.tradeChoice = tradeChoice;
	}
	
	/**
	 * Checks if is same.
	 *
	 * @return true, if is same
	 */
	public boolean isSame() {
		return same;
	}
	
	/**
	 * Sets the same.
	 *
	 * @param same the new same
	 */
	public void setSame(boolean same) {
		this.same = same;
	}
	
	/**
	 * Checks if is plus.
	 *
	 * @return true, if is plus
	 */
	public boolean isPlus() {
		return plus;
	}
	
	/**
	 * Sets the plus.
	 *
	 * @param plus the new plus
	 */
	public void setPlus(boolean plus) {
		this.plus = plus;
	}
	
	/**
	 * Checks if is same wall.
	 *
	 * @return true, if is same wall
	 */
	public boolean isSameWall() {
		return sameWall;
	}
	
	/**
	 * Sets the same wall.
	 *
	 * @param sameWall the new same wall
	 */
	public void setSameWall(boolean sameWall) {
		this.sameWall = sameWall;
	}
	
	/**
	 * Checks if is plus wall.
	 *
	 * @return true, if is plus wall
	 */
	public boolean isPlusWall() {
		return plusWall;
	}
	
	/**
	 * Sets the plus wall.
	 *
	 * @param plusWall the new plus wall
	 */
	public void setPlusWall(boolean plusWall) {
		this.plusWall = plusWall;
	}
	
	/**
	 * Checks if is combo.
	 *
	 * @return true, if is combo
	 */
	public boolean isCombo() {
		return combo;
	}
	
	/**
	 * Sets the combo.
	 *
	 * @param combo the new combo
	 */
	public void setCombo(boolean combo) {
		this.combo = combo;
	}
	
	/**
	 * Checks if is random.
	 *
	 * @return true, if is random
	 */
	public boolean isRandom() {
		return random;
	}
	
	/**
	 * Sets the random.
	 *
	 * @param random the new random
	 */
	public void setRandom(boolean random) {
		this.random = random;
	}
	
	/**
	 * Checks if is elemental.
	 *
	 * @return true, if is elemental
	 */
	public boolean isElemental() {
		return elemental;
	}
	
	/**
	 * Sets the elemental.
	 *
	 * @param elemental the new elemental
	 */
	public void setElemental(boolean elemental) {
		this.elemental = elemental;
	}
	
	/**
	 * Gets the card decks.
	 *
	 * @return the card decks
	 */
	public List<Long> getCardDecksIds() {
		return cardDecksIds;
	}
	
	/**
	 * Sets the card decks.
	 *
	 * @param cardDecks the new card decks
	 */
	public void setCardDecksIds(List<Long> cardDecksIds) {
		this.cardDecksIds = cardDecksIds;
	} 
	
}

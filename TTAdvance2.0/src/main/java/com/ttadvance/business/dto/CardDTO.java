package com.ttadvance.business.dto;

/**
 * Class to model a Card.
 *
 * @author Levant, ID = 48774
 */
public class CardDTO {

	/** The id. */
	private Long id;

	/** The left value. */
	private int elementId;

	/** The top value. */
	private int topValue;

	/** The bottom value. */
	private int bottomValue;

	/** The right value. */
	private int rightValue;

	/** The left value. */
	private int leftValue;

	/** The level. */
	private int level;

	/** The card name*/
	private String name;

	private int cardDeckId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getElementId() {
		return elementId;
	}

	public void setElementId(int elementId) {
		this.elementId = elementId;
	}

	public int getTopValue() {
		return topValue;
	}

	public void setTopValue(int topValue) {
		this.topValue = topValue;
	}

	public int getBottomValue() {
		return bottomValue;
	}

	public void setBottomValue(int bottomValue) {
		this.bottomValue = bottomValue;
	}

	public int getRightValue() {
		return rightValue;
	}

	public void setRightValue(int rightValue) {
		this.rightValue = rightValue;
	}

	public int getLeftValue() {
		return leftValue;
	}

	public void setLeftValue(int leftValue) {
		this.leftValue = leftValue;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCardDeckId() {
		return cardDeckId;
	}

	public void setDeck(int cardDeckId) {
		this.cardDeckId = cardDeckId;
	}
}

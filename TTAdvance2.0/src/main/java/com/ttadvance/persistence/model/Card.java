package com.ttadvance.persistence.model;

import javax.persistence.*;

/**
 * Class to model a Card.
 *
 * @author Levant, ID = 48774
 */
@Entity
@Table(name="CARD", schema = "ttadvancet3")
public class Card {
	
	/** The id. */
	@Id
	@GeneratedValue
	private Long id;

	/** The left value. */
	@Column(name = "element_id")
	private int elementId;
	
	/** The top value. */
	@Column(name = "top_value")
	private int topValue;
	
	/** The bottom value. */
	@Column(name = "bottom_value")
	private int bottomValue;
	
	/** The right value. */
	@Column(name = "right_value")
	private int rightValue;

	/** The left value. */
	@Column(name = "left_value")
	private int leftValue;
	
	/** The level. */
	@Column(name = "level_number")
	private int level;

	/** The card name*/
	private String name;
	
	/** The deck. */
	@ManyToOne(targetEntity=Deck.class, fetch=FetchType.EAGER)
	private Deck deck;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * Gets the top value.
	 *
	 * @return the top value
	 */
	public int getTopValue() {
		return topValue;
	}
	
	/**
	 * Sets the top value.
	 *
	 * @param topValue the new top value
	 */
	public void setTopValue(int topValue) {
		this.topValue = topValue;
	}
	
	/**
	 * Gets the bottom value.
	 *
	 * @return the bottom value
	 */
	public int getBottomValue() {
		return bottomValue;
	}
	
	/**
	 * Sets the bottom value.
	 *
	 * @param bottomValue the new bottom value
	 */
	public void setBottomValue(int bottomValue) {
		this.bottomValue = bottomValue;
	}
	
	/**
	 * Gets the right value.
	 *
	 * @return the right value
	 */
	public int getRightValue() {
		return rightValue;
	}
	
	/**
	 * Sets the right value.
	 *
	 * @param rightValue the new right value
	 */
	public void setRightValue(int rightValue) {
		this.rightValue = rightValue;
	}
	
	/**
	 * Gets the left value.
	 *
	 * @return the left value
	 */
	public int getLeftValue() {
		return leftValue;
	}
	
	/**
	 * Sets the left value.
	 *
	 * @param leftValue the new left value
	 */
	public void setLeftValue(int leftValue) {
		this.leftValue = leftValue;
	}
	
	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * Sets the level.
	 *
	 * @param level the new level
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * Gets the deck.
	 *
	 * @return the deck
	 */
	public Deck getDeck() {
		return deck;
	}

	/**
	 * Sets the deck.
	 *
	 * @param deck the new deck
	 */
	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
}

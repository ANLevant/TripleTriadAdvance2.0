package com.ttadvance.business.dto;

/**
 * Class that models a Deck of cards.
 *
 * @author Levant, Id = 48774
 */
public class DeckDTO {
	
	/** The id. */
	private long id;
	
	/** The name. */
	private String name;
	
	/** The cards in deck. */
	private long cardsInDeck;
	
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
	
	/**
	 * Gets the cards in deck.
	 *
	 * @return the cards in deck
	 */
	public long getCardsInDeck() {
		return cardsInDeck;
	}
	
	/**
	 * Sets the cards in deck.
	 *
	 * @param cardsInDeck the new cards in deck
	 */
	public void setCardsInDeck(long cardsInDeck) {
		this.cardsInDeck = cardsInDeck;
	}

}

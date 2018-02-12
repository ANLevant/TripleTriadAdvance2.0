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

	private String abbreviation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
}

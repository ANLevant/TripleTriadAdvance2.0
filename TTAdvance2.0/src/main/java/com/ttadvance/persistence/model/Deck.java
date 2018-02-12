package com.ttadvance.persistence.model;

import java.util.List;

import javax.persistence.*;

/**
 * Class that models a Deck of cards.
 *
 * @author Levant, Id = 48774
 */
@Entity
@Table(name="DECK", schema = "ttadvancet3")
public class Deck {
	
	/** The id. */
	@Id
	@GeneratedValue
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

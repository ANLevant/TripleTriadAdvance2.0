using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CardDTO {

	public int id;
	public int cardDeckId;
	public int elementId;
	public int topValue;
	public int bottomValue;
	public int rightValue;
	public int leftValue;
	public int level;
	public string name;
	public DeckDTO deck;

	public CardDTO(){
	}

	public static CardDTO CreateFromJSON(string jsonString)
	{
		return JsonUtility.FromJson<CardDTO>(jsonString);
	}
}
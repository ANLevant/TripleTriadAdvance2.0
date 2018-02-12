using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class DeckDTO {

	public long id;
	public string name;
	public string abbreviation;

	public DeckDTO(){
	}

	public static DeckDTO CreateFromJSON(string jsonString)
	{
		return JsonUtility.FromJson<DeckDTO>(jsonString);
	}
}

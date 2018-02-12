using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerDTO {

	public long id;
	public string name;
	public string email;

	public PlayerDTO(){
	}	

	public static PlayerDTO CreateFromJSON(string jsonString)
	{
		return JsonUtility.FromJson<PlayerDTO>(jsonString);
	}
}

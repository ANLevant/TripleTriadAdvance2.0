using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[System.Serializable]
public class GameDTO {

	/** The id. */
	public long id;

	/** The host player id. */
	public long hostPlayerId;

	/** The challenger player id. */
	public long challengerPlayerId;

	/** The player to move id. */
	public long playerToMoveId;

	/** The challenger player card ids. */
	public int[] challengerPlayerHandCardIds;

	/** The host payer hand card ids. */
	public int[] hostPlayerHandCardIds;

	/** The game matrix. */
	public int[][] gameMatrix;

	/**The ruleset containing rules ids*/
	public int[] rulesetRulesIds;

	/**The usableDecksIds containing decks ids*/
	public int[] usableDecksIds;

	/**The usableLevels containing level numbers*/
	public int[] usableLevels;

	public GameDTO()
	{

	}

	public static GameDTO CreateFromJSON(string jsonString)
	{
		return JsonUtility.FromJson<GameDTO>(jsonString);
	}
}

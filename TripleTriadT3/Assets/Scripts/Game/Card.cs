using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Networking;

public class Card : MonoBehaviour {
	public bool isChallengerPlayer;
	public int position;
	private CardDTO cardInfo;

	// Use this for initialization
	void Start () {
 		StartCoroutine (FetchDeckInformation());
	}

	// Update is called once per frame
	void Update () {
		if (GameboardController.isReady){
			string cardSuffix = "";
			if (isChallengerPlayer) {
				cardSuffix = "r";
				cardInfo.id = GameboardController.gameDTO.challengerPlayerHandCardIds [position];
			} else {
				cardInfo.id = GameboardController.gameDTO.hostPlayerHandCardIds [position];
			}
			Texture cardTexture = (Texture)Resources.Load ("Textures/Cards/"+cardInfo.deck.abbreviation+"/"+cardInfo.level+cardInfo.id+cardSuffix);
			Material componentMaterial = GetComponent<Renderer> ().material;
			componentMaterial.mainTexture = cardTexture;
		}
	}

	IEnumerator FetchDeckInformation(){

		string url = Constants.SERVER_URL + Constants.CARD_CONTROLLER_REST_CONTEXT + "/" + cardInfo.id;

		UnityWebRequest cardRequest = UnityWebRequest.Get(Constants.SERVER_URL+Constants.CARD_CONTROLLER_REST_CONTEXT+"/"+cardInfo.id);

		yield return cardRequest.Send();
		string result = cardRequest.downloadHandler.text;

		cardInfo = CardDTO.CreateFromJSON (result);

		GameboardController.isReady = true;
	}
}

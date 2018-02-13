using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Networking;

public class Card : MonoBehaviour {
	public bool isChallengerPlayer;
	public static int readyCounter;
	public int position;
	private bool initialized;
	private CardDTO cardInfo;
	private DeckDTO deckInfo;
	private bool alreadyLoaded = false;

	// Use this for initialization
	void Start () {
		cardInfo = new CardDTO ();
	}

	// Update is called once per frame
	void Update () {
		if (GameboardController.isReady && GameboardController.gameDTO != null){
			string cardSuffix = "";
			if (!initialized && cardInfo.id != 0) {
				StartCoroutine (FetchDeckInformation());
			}
			if (isChallengerPlayer) {
				cardSuffix = "r";
				cardInfo.id = GameboardController.gameDTO.challengerPlayerHandCardIds [position];
			} else {
				cardInfo.id = GameboardController.gameDTO.hostPlayerHandCardIds [position];
			}
			if(deckInfo != null && !alreadyLoaded){
				string folderPath = "Textures/Cards/" + deckInfo.abbreviation + "/" + cardInfo.level + "/" + cardInfo.id + cardSuffix;
				Texture cardTexture = (Texture)Resources.Load (folderPath);
				Material componentMaterial = GetComponent<Renderer> ().material;
				componentMaterial.mainTexture = cardTexture;

				readyCounter++;
				alreadyLoaded = true;
			}
		}
		if (readyCounter >= 9) {
			HandScript.waitStill = false;
		}
	}

	IEnumerator FetchDeckInformation(){
		initialized = true;
		if (cardInfo.leftValue == 0) {
			string urlCard = Constants.SERVER_URL + Constants.CARD_CONTROLLER_REST_CONTEXT + "/" + cardInfo.id;

			UnityWebRequest cardRequest = UnityWebRequest.Get (urlCard);

			yield return cardRequest.SendWebRequest ();
			string result = cardRequest.downloadHandler.text;

			cardInfo = CardDTO.CreateFromJSON (result);
		}
		if (deckInfo == null) {
			string urlDeck = Constants.SERVER_URL + Constants.DECK_CONTROLLER_REST_CONTEXT + "/" + cardInfo.cardDeckId;

			UnityWebRequest deckRequest = UnityWebRequest.Get (urlDeck);

			yield return deckRequest.SendWebRequest ();
			string result = deckRequest.downloadHandler.text;

			deckInfo = DeckDTO.CreateFromJSON (result);
		}
		GameboardController.isReady = true;
	}
}

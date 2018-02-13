using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CardLogic : MonoBehaviour {
	
	Animator animator;
	public static bool cardAlreadySelected;
	public static int selectedCardId;
	bool isSelectedOne;
	public int position;
	public bool isChallengerPlayer;

	// Use this for initialization
	void Start () {
		animator = gameObject.GetComponent<Animator> ();
	}
	
	// Update is called once per frame
	void Update () {
		
	}

	void OnMouseEnter(){
		if (!HandScript.waitStill && !cardAlreadySelected && GameboardController.isHostTurn) {
			animator.SetBool ("highlightCard"+position, true);

			HandScript.isHighlightable = false;
		}
	}

	void OnMouseUp(){
		if (cardAlreadySelected && GameboardController.isHostTurn && isSelectedOne) {
			animator.SetBool ("selectedCard" + position, true);
			cardAlreadySelected = false;
			isSelectedOne = false;
			selectedCardId = 0;
		} else if (!HandScript.waitStill && !cardAlreadySelected && GameboardController.isHostTurn) {
			animator.SetBool ("selectedCard" + position, true);

			cardAlreadySelected = true;
			isSelectedOne = true;

			if (isChallengerPlayer) {
				selectedCardId = GameboardController.gameDTO.challengerPlayerHandCardIds [position];
			} else {
				selectedCardId = GameboardController.gameDTO.hostPlayerHandCardIds [position];
			}
		}
	}

	void OnMouseExit(){
		if (!HandScript.waitStill && !cardAlreadySelected && GameboardController.isHostTurn) {
			animator.SetBool ("highlightCard"+position, true);
			HandScript.isHighlightable = true;
		}
	}

	void DrawCard()
	{
		AudioSource backgroundSong = gameObject.GetComponent<AudioSource>();
		AudioClip backgroundClip = (AudioClip)Resources.Load("Audio/Game/draw");
		backgroundSong.clip = backgroundClip;
		backgroundSong.Play();
	}

}

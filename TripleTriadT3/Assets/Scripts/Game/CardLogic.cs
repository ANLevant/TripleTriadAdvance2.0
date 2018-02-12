using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CardLogic : MonoBehaviour {
	
	Animator animator;
	bool isSelected;

	// Use this for initialization
	void Start () {
		animator = gameObject.GetComponent<Animator> ();
		animator.SetTrigger("idle");
	}
	
	// Update is called once per frame
	void Update () {
		
	}

	void OnMouseEnter(){
		if (!HandScript.waitStill &&!isSelected && GameboardController.isHostTurn) {
			animator.SetTrigger ("highlight");

			HandScript.isHighlightable = false;
		}
	}

	void OnMouseUp(){
		if (isSelected && GameboardController.isHostTurn) {
			animator.SetTrigger ("idle");
			HandScript.waitStill = false;
			isSelected = false;
		} else if (!HandScript.waitStill && !isSelected && GameboardController.isHostTurn) {
			animator.SetTrigger ("selected");
			isSelected = true;
			HandScript.waitStill = true;
		}
	}

	void OnMouseExit(){
		if (!HandScript.waitStill && !isSelected && GameboardController.isHostTurn) {
			animator.SetTrigger("idle");
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

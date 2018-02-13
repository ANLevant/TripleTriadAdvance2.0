using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class HandScript : MonoBehaviour {

	public bool isHostPlayer;
	public bool isOpen;
	public static bool isHighlightable;
	public static bool waitStill= true;
	private bool doneWaiting;
	Animator animator;

	// Use this for initialization
	void Start () {
		animator = gameObject.GetComponent<Animator> ();
	}
	
	// Update is called once per frame
	void Update () {
		if (!waitStill && !doneWaiting) {
			FilpHand ();
			doneWaiting = true;
			isHighlightable = true;
		}
	}

	void DrawCard()
	{
		AudioSource backgroundSong = gameObject.GetComponent<AudioSource>();
		AudioClip backgroundClip = (AudioClip)Resources.Load("Audio/Game/draw");
		backgroundSong.clip = backgroundClip;
		backgroundSong.Play();
	}

	void FilpHand(){
		if ((!isOpen && !isHostPlayer) || waitStill) {
			animator.SetTrigger ("idle");
		} else {
			isHighlightable = true;
			animator.SetTrigger ("flipHand");
		}
	}

	void DisableFlipping(){
		animator.SetTrigger ("idle");
	}		
}

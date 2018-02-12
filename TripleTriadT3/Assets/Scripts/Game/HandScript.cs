using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class HandScript : MonoBehaviour {

	public bool isHostPlayer;
	public bool isOpen;
	public static bool isHighlightable;
	public static bool waitStill;

	// Use this for initialization
	void Start () {
		waitStill = true;
	}
	
	// Update is called once per frame
	void Update () {
		
	}

	void DrawCard()
	{
		AudioSource backgroundSong = gameObject.GetComponent<AudioSource>();
		AudioClip backgroundClip = (AudioClip)Resources.Load("Audio/Game/draw");
		backgroundSong.clip = backgroundClip;
		backgroundSong.Play();
	}

	void FilpHand(){
		if (!isOpen && !isHostPlayer) {
			Animation animation = gameObject.GetComponent<Animation> ();
			animation.Stop ();
		}
		waitStill = false;
		isHighlightable = true;
	}
}

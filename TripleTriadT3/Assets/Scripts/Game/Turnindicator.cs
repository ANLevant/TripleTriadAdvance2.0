using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Turnindicator : MonoBehaviour {

	public static Animator animator;

	// Use this for initialization
	void Start () {
		animator = gameObject.GetComponent<Animator>();
	}
	
	// Update is called once per frame
	void Update () {
		animator.SetBool ("isHostTurn", GameboardController.isHostTurn);
	}
}

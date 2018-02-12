using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Networking;

public class GameboardController : MonoBehaviour {

	public static bool isHostTurn;
	public static bool isReady;
	public static GameDTO gameDTO;
	public static PlayerDTO playerDTO;
	public long gameId = 1;

    // Use this for initialization
    void Start () {
		StartCoroutine(PlayMusic());
		StartCoroutine (LoadValues());
    }
	
	// Update is called once per frame
	void Update () {
	}


    private IEnumerator PlayMusic()
    {
		AudioSource backgroundSong = gameObject.GetComponent<AudioSource>();
        AudioClip backgroundClip = (AudioClip)Resources.Load("Audio/BackgroundMusic/ShuffleOrBoogieIntro");
        backgroundSong.clip = backgroundClip;
        backgroundSong.Play();
        yield return new WaitForSeconds(backgroundSong.clip.length);
		backgroundClip = (AudioClip)Resources.Load("Audio/BackgroundMusic/ShuffleOrBoogieLoopable");
        backgroundSong.clip = backgroundClip;
        backgroundSong.loop = true;
        backgroundSong.Play();
    }

	private IEnumerator LoadValues()
	{
		string url = Constants.SERVER_URL + Constants.GAME_CONTROLLER_REST_CONTEXT + "/" + gameId;
		UnityWebRequest request = UnityWebRequest.Get(url);
		yield return request.SendWebRequest();
		string result = request.downloadHandler.text;

		gameDTO = GameDTO.CreateFromJSON (result);

		if(gameDTO.playerToMoveId == gameDTO.hostPlayerId){
			isHostTurn = true;
		}
		else{
			isHostTurn = false;
		}

		GameboardController.isReady = true;
	}
}
  TTAdvance.service('gameboardService', function(TTADVANCE_CONSTANTS, stompCommunicationFactory)
  {

    this.connectToGame = function(gameId)
    {
      var connectToGame = function(gameDTO)
      {
        console.log(gameDTO);
      }

      var channel = TTADVANCE_CONSTANTS.WEBSOCKET_RESOURCES.GAME.RECEPTION_URLS.WATCH_GAME.replace(':gameId', gameId);

      return stompCommunicationFactory.subscribe(channel, connectToGame);
    };

    this.makeMove = function(gameId, gameDTO){
      var channel = TTADVANCE_CONSTANTS.WEBSOCKET_RESOURCES.GAME.TRANSMISSION_URLS.MAKE_MOVE.replace(':gameId', gameId);

      return stompCommunicationFactory.sendMessage(channel, gameDTO);
    }

/*    function disconnect() {
      if (stompClient != null) {
          stompClient.disconnect();
      }
      console.log("Disconnected");
    }

    function sendName() {
      var deck =
      {
        'id': that.gameId,
        'name':'ff8',
        'cardsInDeck':120
      }

      $rootScope.stompjsClient.send('/ws/game/'+that.gameId+'/makeMove', {}, JSON.stringify(deck));
    }

    function showGreeting(message) {
    }

    this.stompResponse = '';*/

  });

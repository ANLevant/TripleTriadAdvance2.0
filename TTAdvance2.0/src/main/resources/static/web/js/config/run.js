TTAdvance.run(function($rootScope, TTADVANCE_CONSTANTS)
{
  $rootScope.sockjsClient = new SockJS(TTADVANCE_CONSTANTS.WEBSOCKET_RESOURCES.SERVER_URL);
  $rootScope.stompjsClient = Stomp.over($rootScope.sockjsClient);

  $rootScope.stompjsClient.connect({}, function (frame)
  {
  });
});

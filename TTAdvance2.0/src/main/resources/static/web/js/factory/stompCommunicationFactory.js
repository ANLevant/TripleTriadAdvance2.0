TTAdvance.factory('stompCommunicationFactory', function($timeout, $rootScope)
{

  var subscribe = function(channel, callback)
  {
    return $timeout(function()
    {
        return $rootScope.stompjsClient.subscribe(channel, callback);
    }, 1000);
  };

  var sendMessage = function(channel, payload)
  {
    $timeout(function()
    {
      $rootScope.stompjsClient.send(channel, {}, JSON.stringify(payload));
    }, 1000);
  };

  return{
    subscribe: subscribe,
    sendMessage: sendMessage
  };

});

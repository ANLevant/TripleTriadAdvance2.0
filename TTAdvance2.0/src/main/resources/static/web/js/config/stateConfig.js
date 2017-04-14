TTAdvance.config(function($stateProvider){
    var gameboardState={
      name:'gameboardState',
      url:'/game/:gameId',
      templateUrl:'game/gameboard.html',
      controller: 'gameboardController'
    }

    $stateProvider.state(gameboardState);
});

TTAdvance.config(function($urlRouterProvider) {
    $urlRouterProvider.otherwise('/game/1');
});

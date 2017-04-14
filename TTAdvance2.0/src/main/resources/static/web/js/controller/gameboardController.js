TTAdvance.controller('gameboardController', function($rootScope, $stateParams, gameboardService){

  var that = this;

  this.game = {}
  this.game.id=$stateParams.gameId;
  this.game.hostPlayerId=1;
  this.game.challengerPlayerId=2;
  this.game.hostPlayerId=2;
  this.game.playerToMoveId=1;
  this.game.firstPlayerToMoveId=1;
  this.game.gameMatrix=[[]];

  gameboardService.connectToGame(this.game.id);
  gameboardService.makeMove(this.game.id, this.game);
});

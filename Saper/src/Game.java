public class Game {
    public void startGame(){
        BoardGame boardGame = new BoardGame(10,10);
        BoardPlayer boardPlayer = new BoardPlayer(10,10);
        boardGame.fillBoard(10);
        boardGame.printBoardTest();
        //boardPlayer.printBoardTest();
    }

}

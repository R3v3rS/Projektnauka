public class Game {
    public void startGame(){
        BoardGame boardGame = new BoardGame(10,10);
        boardGame.fillBoard(10);
        BoardPlayer boardPlayer = new BoardPlayer();
        boardGame.printBoardTest();
    }

}

public class Game {
    public void startGame() {
        BoardGame boardGame = new BoardGame();
        boardGame.printGameBoard();
        boardGame.findWinner(boardGame.game);
    }
}

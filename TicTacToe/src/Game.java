public class Game {
    public void startGame() {
        BoardGame boardGame = new BoardGame();
        System.out.println("Test wydruku pola gry");
        boardGame.printGameBoard();
        System.out.println("Czy znaleziono wygranego:");
        System.out.println(boardGame.findWinner(boardGame.game));
        System.out.println("Sprawdzanie czy można grać dalej");
        System.out.println(boardGame.checkGame(boardGame.game));
    }
}

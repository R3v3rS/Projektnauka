import java.util.Scanner;

public class Game {
    Player playersOne = new Player();
    Player playersTwo = new Player();
    public void startGame() {
        BoardGame boardGame = new BoardGame();
        int playerRound = 1;
        while (true) {
            System.out.println(playersOne.getIdPlayer());
            System.out.println(playersTwo.getIdPlayer());
            if (boardGame.findWinner()) {
                System.out.print("Gratulacje wygrał gracz");
                if (playerRound %2 == 1) {
                    System.out.println(" " + playersTwo.getIdPlayer());
                } else {
                    System.out.println(" " + playersOne.getIdPlayer());
                }
                break;
            } else if (boardGame.checkGame()) {
                System.out.println("Niestety nikt nie wygrał");
                break;
            }
            System.out.println("Test wydruku pola gry");
            boardGame.printGameBoard();
            System.out.println("Czy znaleziono wygranego:");
            System.out.println(boardGame.findWinner());
            System.out.println("Sprawdzanie czy można grać dalej");
            System.out.println(boardGame.checkGame());
            if (playerRound %2 == 0) {
                hit(boardGame, playersTwo);
            } else {
                hit(boardGame, playersOne);
            }
            playerRound++;
        }
    }
    public void hit(BoardGame boardGame, Player player){
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Gracz" + player.getIdPlayer() + " proszę podaj wspórzędne x");
            int x = scan.nextInt()-1;
            System.out.println("Gracz" + player.getIdPlayer() + " proszę podaj wspórzędne y");
            int y = scan.nextInt()-1;
            if (boardGame.checkField(x,y)){
                if (player.getIdPlayer() == 1) {
                    boardGame.board[x][y] = 'O';
                } else if (player.getIdPlayer() == 2) {
                    boardGame.board[x][y] = 'X';
                }
                break;
            }
        }
    }
}

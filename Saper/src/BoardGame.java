import java.util.Random;

public class BoardGame {
    private char[][] board;

    public BoardGame(int a, int b) {
        this.board = new char[a][b];
    }

    public void fillBoard(int a) {
        Random random = new Random();
        for (char[] chars : board) {
            for (int i = 0; i < board.length; i++) {
                chars[i] = ' ';
            }

        }
        for (int i = 0; i <= a; i++) {
            while (true) {
                int x = random.nextInt(board.length - 1);
                int y = random.nextInt(board.length - 1);
                if (board[x][y] == ' ') {
                    board[x][y] = 'O';
                    break;
                }
            }
        }
    }

    public void printBoardTest() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        char a = 'A';
        for (char[] chars : board) {
            System.out.println(" ---------------------");
            System.out.print(a);
            a++;
            for (int i = 0; i < board.length; i++) {

                System.out.print("|"+ chars[i]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println(" ---------------------");
    }
}

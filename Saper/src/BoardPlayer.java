import java.util.Random;

public class BoardPlayer {
    private char[][] board;

    public BoardPlayer(int a, int b) {
        Random random = new Random();
        this.board = new char[a][b];
        for (char[] chars : this.board) {
            for (int i = 0; i < this.board.length; i++) {
                chars[i] = ' ';
            }

        }
    }
        public void printBoardTest () {
            for (char[] chars : board) {
                System.out.println();
                for (int i = 0; i < board.length; i++) {
                    System.out.print(chars[i]);
                }
            }
        }
}

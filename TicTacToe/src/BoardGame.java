public class BoardGame {
    char[][] board = {
            {'X', ' ', ' '},
            {' ', 'X', ' '},
            {' ', ' ', ' '}
    };

    public void printGameBoard() {
        for (char[] chars : board) {
            System.out.println(" -------------");
            for (char aChar : chars) {
                System.out.print(" | ");
                System.out.print(aChar);
            }
            System.out.print(" | ");
            System.out.println();
        }
        System.out.println(" -------------");
    }

    public boolean findWinner() {// po zwroceniu true wygrywa gracz z ostatniego ruchu
        if (checkCols() || checkRows() || checkDiags()) {
            return true;
        }
        return false;
    }

    public boolean checkRows() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkCols() {
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiags() {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        } else return board[2][2] != ' ' && board[2][2] == board[1][1] && board[2][2] == board[2][0];
    }

    public boolean checkGame() {// do sprawdzenia czy mozna grac dalej
        char emptyField = ' ';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] ==emptyField){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean checkField(int x, int y) {
        if (x <= board.length && x >= 0 && y <= board.length && y >= 0) {
            if (board[x][y] == ' ') {
                return true;
            } else {
                System.out.println("Niepoprawne współrzędne");
                return false;
            }
        }
        System.out.println("Niepoprawne współrzędne");
        return false;
    }
}


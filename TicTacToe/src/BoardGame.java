public class BoardGame {
    char[][] game = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public void printGameBoard() {
        for (char[] chars : game) {
            System.out.println("----------");
            for (char aChar : chars) {
                System.out.print("| ");
                System.out.print(aChar);
            }
            System.out.print("| ");
            System.out.println();
        }
        System.out.println("----------");
    }

    public boolean findWinner(char[][] game) { // po zwroceniu true wygrywa gracz z ostatniego ruchu
        return false;
    }

    public boolean checkRows(char game[][]) {
        return false;
    }

    public boolean checkCols(char game[][]) {
        return false;
    }

    public boolean checkDiags(char game[][]) {
        return false;
    }

    public boolean checkGame(char game[][]) { // do sprawdzenia czy mozna grac dalej
        return true;
    }
}

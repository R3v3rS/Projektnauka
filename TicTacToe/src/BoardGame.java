public class BoardGame {
    char[][] game = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public void printGameBoard() {
        for (char[] chars : game) {
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

    public boolean findWinner(char[][] game) {// po zwroceniu true wygrywa gracz z ostatniego ruchu
       if (checkCols(game) || checkRows(game) || checkDiags(game)){
           System.out.println("find");
           return true;
       }
        return false;
    }

    public boolean checkRows(char game[][]) {
        for (int i = 0; i < game.length; i++){
            if (game[i][0] != ' ' && game[i][0] == game[i][1] && game[i][0] == game[i][2]){
                return true;
                }
            }
        return false;
    }

    public boolean checkCols(char game[][]) {
        for (int i = 0; i < game.length; i++){
            if (game[0][i] != ' ' && game[0][i] == game[1][i] && game[0][i] == game[2][i]){
                return true;
            }
        }
        return false;
    }

    public boolean checkDiags(char game[][]) {
            if (game[0][0] != ' ' && game[0][0] == game[1][1] && game[0][0] == game[2][2]){
                return true;
            } else return game[2][2] != ' ' && game[2][2] == game[1][1] && game[2][2] == game[2][0];
    }

    public boolean checkGame(char game[][]) { // do sprawdzenia czy mozna grac dalej
        return true;
    }
}

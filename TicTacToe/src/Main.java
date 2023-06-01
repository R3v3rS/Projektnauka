

public class Main {
    public static void main(String[] args) {
        char[][] game = {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}
        };
        printGameBoard(game);
            }
    public static void printGameBoard(char[][] game){
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
}
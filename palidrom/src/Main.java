import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        if (word1.length() % 2 == 1) {
            boolean polidrome = true;
            System.out.println("is ok");
            char[] word2 = word1.toCharArray();
            for ( int i =0; i < word2.length/2;i++){
                System.out.println("Porównuje znak " + word2[i] +" oraz " + word2[word2.length-1-i]);
                if (word2[i] != word2[word2.length-i-1]){
                    System.out.println("Podane słowo nie jest palidromem");
                    polidrome = false;
                    break;
                }
            }
            if (polidrome){
                System.out.println(word1 + " jest palidromem");
            }
        } else {
            System.out.println("Podane słowo nie jest palidromem");
        }
    }
}
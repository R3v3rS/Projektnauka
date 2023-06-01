import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lowerLimit;
        int upperLimit;
        int suma = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            System.out.println("Podaj liczbę z dolnego zakresu:");
            lowerLimit = scan.nextInt();
            System.out.println("Podaj liczbę z górnego zakresu:");
            upperLimit = scan.nextInt();
            if (lowerLimit > upperLimit) {
                System.out.println("Podałeś niepoprawny zakres liczb");
            } else {
                break;
            }
        }
        for (int i = lowerLimit; i <= upperLimit; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma += j;
                }
            }
            if (suma == i) {
                list.add(i);
            }
            suma = 0;
        }
        System.out.println(list);
    }
}
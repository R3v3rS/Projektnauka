import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liczbaFirst;
        int podanaLiczba;
        int suma = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            System.out.println("Podaj liczbe z dolnego zakresu:");
            liczbaFirst = scan.nextInt();
            System.out.println("Podaj liczbe z górnego zakresu:");
            podanaLiczba = scan.nextInt();
            if (liczbaFirst < podanaLiczba){
                System.out.println("Podałeś niepoprawny zakres liczb");
                break;
            }
        }
        while (liczbaFirst < podanaLiczba){
            for (int i = 1; i < liczbaFirst; i++) {
                if (liczbaFirst %i == 0) {
                    suma += i;
                }
            }
            if (suma == liczbaFirst){
                list.add(liczbaFirst);
            }
            liczbaFirst++;
            suma=0;
        }

        System.out.println(list);
    }
}
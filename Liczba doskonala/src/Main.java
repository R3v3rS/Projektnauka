import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int liczba = 6;
        int suma = 0;
        int podanaLiczba = 100;
        ArrayList<Integer> list = new ArrayList<>();
        while (liczba < podanaLiczba){
            for (int i = 1; i < liczba; i++) {
                if (liczba %i == 0) {
                    suma += i;
                }
            }
            if (suma == liczba){
                list.add(liczba);
            }
            liczba++;
            suma=0;
        }

        System.out.println(list);
    }
}
package infoshareacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lotto {
    public static void start() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj końcową liczbę zakresu z jakiego będziesz losował (od 1 do...) ?");
            int rangeOfNumbers = scan.nextInt();
            System.out.println("Zakres liczb wybranych do losowania to: 1 - " + rangeOfNumbers);

            System.out.println("Podaj ilość liczb do losowania z wybranego zakresu?");
            int numberOfDraws = scan.nextInt();
            ArrayList numbers = new ArrayList();
            for (int i = 0; i < rangeOfNumbers; i++) {
                numbers.add(i + 1);
            }
            Collections.shuffle(numbers);
            System.out.println("Chcesz wylosować " + numberOfDraws + " liczb(y). Zwalniam mechanizm maszyny losującej..." +
                    " Oto wynik losowania:");
            for (int j = 0; j < numberOfDraws; j++) {
                System.out.println(numbers.get(j));
            }


        } catch (Exception e) {
            System.out.println("Coś poszło nie tak. Spróbuj ponownie odpalić maszynę losującą.");
        }
    }
}


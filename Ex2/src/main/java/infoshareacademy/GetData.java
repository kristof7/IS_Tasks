package infoshareacademy;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class GetData {
    Scanner scanner = new Scanner(System.in);
    private Integer scopeNumber;
    private Integer numberOfDigits;

    public void getScopeNumber() {
        try {
            System.out.println("podaj zakres liczb: od 1 do...");
            scopeNumber = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Nie podałeś liczby całkowitej dodatniej, następuje zamknięcie programu ");
            System.exit(0);
        }
        if (scopeNumber <= 0) {
            System.out.println("Musisz podać liczbę całkowitą większą od 0! ");
            System.exit(0);
        }
    }


    public void getNumberOfDigits() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("podaj ile liczb mam wylosować");
            numberOfDigits = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Nie podałeś liczby całkowitej dodatniej, następuje zamknięcie programu");
            System.exit(0);
        }
        if (numberOfDigits > scopeNumber || numberOfDigits <= 0) {
            System.out.println("Podałeś liczbę większą od zakresu lub mniejszą od 0. Następuje za ");
            System.exit(0);
        }
    }


    public void drawNumber() {

        Random r = new Random();
        Set<Integer> results = new HashSet<>();

        for (int i = 0; results.size() < this.numberOfDigits; i++) {
            int a = r.nextInt(this.scopeNumber);
            int a2 = a + 1;
            results.add(a2);
        }
        System.out.println("Wylosowane liczby to: ");
        for (int i : results) {
            System.out.println(i);
        }
    }
}
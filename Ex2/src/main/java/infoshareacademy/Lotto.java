package infoshareacademy;

import java.util.*;


public class Lotto {

    static Integer range;
    static Integer amountOfRolls;

    public static void start() {

        Random random = new Random();

        System.out.println("podaj zakres losowania (od 1 do podanej liczby)");
        while (range == null) {
            try {
                Scanner scanner = new Scanner(System.in);
                range = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("podana wartosc jest nieprawidlowa, sprobuj jeszcze raz");
            }
        }

        System.out.println("podaj ilosc liczb do wylosowania");
        while (amountOfRolls == null) {
            try {
                Scanner scanner2 = new Scanner(System.in);
                amountOfRolls = scanner2.nextInt();
            } catch (Exception e) {
                System.out.println("podana wartosc jest nieprawidlowa, sprobuj jeszcze raz");
            }
        }
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < amountOfRolls ; i++) {
            int randomValue  = random.nextInt(range-1)+1;
            while(results.contains(randomValue)){
                randomValue  = random.nextInt(range-1)+1;
            }
            results.add(randomValue);
        }
        Collections.sort(results);
        for (int i = 0; i < amountOfRolls ; i++) {
            System.out.println(results.get(i));
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

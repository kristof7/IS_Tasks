package infoshareacademy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Lotto {

    static long range;
    static long amountOfNumbersToRoll;
    static Set<Integer> luckyNumbers = new HashSet<>();

    public static void start() {

        System.out.println("---------------------------------------------------");
        System.out.println("Cześć, jestem Twoim programem do losowania liczb.");
        System.out.println("Podążąj za moimi instrukcjami aby wylosować liczby.");
        System.out.println("---------------------------------------------------");
        Lotto.pickRange();
        Lotto.pickAmountOfNumbers();
        Lotto.getLuckyNumbers(range, amountOfNumbersToRoll);

        try {
            Lotto.luckyNumbersPresentation(luckyNumbers);
        } catch (InterruptedException e) {
            System.out.println("Coś poszło nie tak - skontaktuj się z twórcą maszyny losującej");
        }

        try {
            Lotto.writeLuckyNumbersToTxt(luckyNumbers);
        } catch (IOException e) {
            System.out.println("Wystąpił problem przy zapisie wyników do pliku - skontaktuj się z twórcą maszyny losującej");;
        }


    }

    public static void pickRange() {

        boolean isRangeOK = false;

        while (!isRangeOK) {
            try {

                System.out.println("Zakres losowania zaczyna się od 1 - podaj liczbę całkowitą, która ma stanowić koniec zakresu losowania:");
                Scanner scanner = new Scanner(System.in);
                range = scanner.nextLong();

                if (range <= 1) {
                    System.out.println("Wprowadzona liczba całkowita musi być większa od 1");
                } else {
                    isRangeOK = true;
                    System.out.println("---------------------------------------------------");
                    System.out.println("Maszyna losująca wylosuje z zakresu od 1 do " + range);
                    System.out.println("---------------------------------------------------");
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono błędne dane, wpisz liczbę całkowitą");
            }

        }
    }

    public static void pickAmountOfNumbers() {

        boolean isAmountOK = false;
        while (!isAmountOK) {
            try {
                System.out.println("Wpisz ilość liczb, jaką mam wylosować: ");
                Scanner scanner = new Scanner(System.in);
                amountOfNumbersToRoll = scanner.nextLong();

                if (amountOfNumbersToRoll >= range) {
                    System.out.println("Maszyna losuje tylko unikalne wartości - ilość liczb do wylosowania nie może być większa od zakresu losowania");
                } else if (amountOfNumbersToRoll <= 0) {
                    System.out.println("Wprowadź liczbę całkowitą większą od 0");
                } else {
                    isAmountOK = true;
                    System.out.println("---------------------------------------------------");
                    System.out.println("Maszyna wylosuje " + amountOfNumbersToRoll + " liczb z zakresu od 1 do " + range);
                    System.out.println("---------------------------------------------------");
                }

            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono błędne dane, wpisz liczbę całkowitą");
            }


        }
    }

    public static Set<Integer> getLuckyNumbers(long range, long amountOfNumbersToRoll) {


        while (luckyNumbers.size() != amountOfNumbersToRoll) {
            Integer randomNumber = (new Random().nextInt((int) range) + 1);
            luckyNumbers.add(randomNumber);
        }

        return luckyNumbers;

    }

    public static void luckyNumbersPresentation(Set<Integer> luckyNumbers) throws InterruptedException {

        List<Integer> luckyNumbersInList = new ArrayList<>(luckyNumbers);
        Collections.sort(luckyNumbersInList);


        System.out.println("｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.");
        System.out.println("｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.");
        System.out.println("｡*ﾟ.*.｡｡*ﾟ.*.｡Bęben maszyny jest pusty｡*ﾟ.*.｡｡*ﾟ.*.｡");
        System.out.println("｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.");
        System.out.println("｡*ﾟ.*.｡｡*ﾟ.*.｡Następuje zwolnienie blokady.｡｡*ﾟ.*.｡｡");
        System.out.println("｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.");
        System.out.println("｡*ﾟ.*.｡｡*ﾟ.*.｡I losowanie z " + range + " liczb｡*ﾟ.*.｡｡*ﾟ.*.｡");
        System.out.println("｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.");

        for (Integer i: luckyNumbersInList) {
            System.out.println("｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.");
            System.out.println("Wylosowana liczba to: >>>>>>>>>>" + i + "<<<<<<<<<<");
            System.out.println("Pozostało do wylosowania jeszcze " + ((amountOfNumbersToRoll- luckyNumbersInList.indexOf(i))-1) + " liczb");
            System.out.println("｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.*.｡｡*ﾟ.");
            Thread.sleep(1000);



        } System.out.println("Losowanie zakończone, gratulujemy zwycięzcom");

    }

    public static void writeLuckyNumbersToTxt(Set<Integer> luckyNumbers) throws IOException {

        FileWriter writer = new FileWriter("Wyniki_Losowania.txt");
        for (Integer i : luckyNumbers){
            writer.write(i + System.lineSeparator());
        }
        writer.close();
        System.out.println("Wyniki zostały zapisane do pliku tekstowego");

    }
}







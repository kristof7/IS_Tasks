package infoshareacademy;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Lotto {
    public static void start () {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("podaj zakres liczb: ");
            Integer maxNumber = scanner.nextInt();
            System.out.print("podaj ilosc liczb do wylosowania: ");
            Integer amountOfNumbers = scanner.nextInt();
            if (amountOfNumbers > maxNumber) {
                System.out.println("zakres musi byc wiekszy od ilosci liczb");
            } else {
                System.out.println("losowanie...");
                Integer randomNumber = 0;
                ArrayList<Integer> drawnNumbersArray = new ArrayList<>();
                while (drawnNumbersArray.size() < amountOfNumbers) {
                    randomNumber = (int) (Math.random() * maxNumber) + 1;
                    if (drawnNumbersArray.contains(randomNumber)) {
                    } else {
                        drawnNumbersArray.add(randomNumber);
                    }
                }
                Collections.sort(drawnNumbersArray);
                FileWriter writer = new FileWriter("lottoResults.text");
                PrintWriter printWriter = new PrintWriter(writer);
                for (int j = 0; j < drawnNumbersArray.size(); j++) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(drawnNumbersArray.get(j));
                    printWriter.println(drawnNumbersArray.get(j));
                }
                printWriter.close();
            }
        }
        catch (Exception InputMismatchException) {
            System.out.println("musisz podac liczbe");
        }
    }
}

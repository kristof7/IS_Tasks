package infoshareacademy;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {

    public static void start() {
        try {
            System.out.println("Please enter a range of numbers: ");
            Scanner scanner = new Scanner(System.in);
            int rangeOfNumbers = scanner.nextInt();

            System.out.println("Please enter the number of numbers to draw: ");
            Scanner scanner1 = new Scanner(System.in);
            int quantity = scanner1.nextInt();

            System.out.println("---------------------------------");
            System.out.println("    THE LOCK IS RELEASED.   ");
            System.out.println("---------------------------------");

            TreeSet<Integer> tab = new TreeSet<>();
            Random random = new Random();

            PrintWriter record = new PrintWriter("LottoYourNumbers.txt");
            record.println("Yours numbers are : ");

            System.out.println("Yours numbers are : ");

            for (int i = 0; i < quantity; i++) {

                tab.add(random.nextInt(rangeOfNumbers));

                System.out.println(i + 1 + ". " + tab);
                Thread.sleep(1000);

                record.println(i + 1 + ". " + tab);
            }
            System.out.println("We wish you a great win!");

            record.println("We wish you a great win!");
            record.close();

        } catch (InputMismatchException e) {
            System.out.println("Error! Enter only an integer.");
        } catch (InterruptedException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
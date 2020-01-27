package com.infoshareacademy;

import com.infoshareacademy.zadanie1.ZadanieB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    //zmienna oznaczająca ostateczne uzyskanie wyniku i zakonczenie działania kalkulatora
    public static Boolean isFinished = false;

    public static void main(String[] args) {

// zbieranie danych dla metody

        while (!isFinished) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj pierwszą liczbę:");
                long firstNumber = scanner.nextLong();
                System.out.println("Podaj drugą liczbę:");
                long secondNumber = scanner.nextLong();
                String nothing = scanner.nextLine();
                System.out.println("Podaj symbol działania (+,-,* lub /)");
                String symbol = scanner.nextLine();

// wywołanie metody i zabezpieczenie przed wprowadzeniem liczb zmiennoprzecinkowych i znaków innych od liczby

                ZadanieB.calculateTwoNumbersFromScanner(firstNumber, secondNumber, symbol);

            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane - wprowadzaj tylko liczby całkowite ");
            } catch (Exception e) {
                System.out.println("Coś poszło nie tak - skontaktuj się z twórcą kalkulatora :D ");
                break;
            }


        }
    }
}

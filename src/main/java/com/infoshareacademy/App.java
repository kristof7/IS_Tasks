package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Podaj dwie dowolne liczby?");
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();


            System.out.println("Twoje liczby to: " + number1 + " " + number2);

            System.out.println("Podaj jakie działania arytmetyczne z podanych w nawiasie chcesz wykonać " +
                    "na tych liczbach (+, -, *, /)?");

            char ch;
            ch = (char) System.in.read();

            switch (ch) {
                case '+':
                    System.out.println("Wynik Twojego działania to " + (number1 + number2));
                    break;
                case '-':
                    System.out.println("Wynik Twojego działania to " + (number1 - number2));
                    break;
                case '*':
                    System.out.println("Wynik Twojego działania to " + number1 * number2);
                    break;
                case '/':
                    System.out.println("Wynik Twojego działania to " + number1 / number2);
                    break;
                default:
                    System.out.println("Nie ma takiego działania.");
            }

        } catch (Exception e) {
            System.out.println("Nieprawidłowa liczba.");
        }
    }
}




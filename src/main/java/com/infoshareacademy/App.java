package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Ze względu na to, iż ma to być prosty kalkukator posługuję się zmiennymi long (na wejściu proszę o dowolne
         * liczby całkowite) i tylko przy operacji dzielenia rzutuję long na double.
         * Pętlę for, używam po to, żeby po każdej operacji arytmetycznej program nie kończył działania, tylko,
         * żeby można było podawać mu nieskończoną ilość działań arytmetycznych (+, -, *, /) do wykonania.
         */
        try {

            for (int i = 0; ; i++) {
                System.out.println("Podaj dwie dowolne liczby całkowite?");
                long number1 = scanner.nextLong();
                long number2 = scanner.nextLong();


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
                        System.out.println("Wynik Twojego działania to " + (double) number1 / number2);
                        break;
                    default:
                        System.out.println("Nie ma takiego działania.");
                }

            }
        } catch (Exception e) {
            System.out.println("Nieprawidłowa liczba.");
        }
    }
}




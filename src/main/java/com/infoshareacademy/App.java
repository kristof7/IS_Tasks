package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Double number1 = null;
        Double number2 = null;
        /*zastosowanie pętli "while" w celu ciągłego i nieprzerwanego działania kalkulatora, działanie programu
        nie zostaje nawet przerwane, gdy użytkownik wprowadzi inny znak, niż dowolna liczba, jest proszony do skutku
        o wprowadznie liczby */
        while (number1 == null && number2 == null || number1 != null && number2 != null) {
            Scanner scanner = new Scanner(System.in);
            try {

                System.out.println("Podaj dwie dowolne liczby?");
                number1 = scanner.nextDouble();
                number2 = scanner.nextDouble();


                System.out.println("Twoje liczby to: " + number1 + " " + number2);

                System.out.println("Podaj jakie działania arytmetyczne z podanych w nawiasie chcesz wykonać " +
                        "na tych liczbach (+, -, *, /)?");

                char ch, ignore;
                ch = (char) System.in.read(); //wczytuje znak z klawiatury
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n'); //usuwa pozostałe znaki z bufora wejściowego

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
}




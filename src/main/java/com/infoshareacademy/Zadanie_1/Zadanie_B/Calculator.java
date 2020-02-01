package com.infoshareacademy.Zadanie_1.Zadanie_B;
import java.util.Scanner;

public class Calculator {
    public static void calculateData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        double a = scanner.nextDouble();
        System.out.println("Podaj druga liczbe");
        double b = scanner.nextDouble();
        System.out.println("Podaj symbol dzialania (+,-,*,/):");
        Scanner scanner2 = new Scanner(System.in);
        String symbol = scanner2.nextLine();
        if (symbol.equals("*") || symbol.equals("/") || symbol.equals("+") || symbol.equals("-")) {
            if (b == 0 && symbol.equals("/")) {
                System.out.println("Nie mozna dzielic przez 0");
            } else {
                System.out.println("Wynik dzialania " + a + " " + symbol + " " + b + " = " + calculate(a, b, symbol));
            }
        } else {
            System.out.println("Podales(as) nieprawidlowy symbol dzialania.");
        }
    }

    private static double calculate(double a, double b, String symbol) {
        double result = 0;
        if (symbol.equals("*")) {
            result = a * b;
        } else if (symbol.equals("/")) {
            result = a / b;
        } else if (symbol.equals("+")) {
            result = a + b;
        } else if (symbol.equals("-")) {
            result = a - b;
        }
        return result;
    }
}

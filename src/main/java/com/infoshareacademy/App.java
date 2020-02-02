package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj pierwsza liczbe: ");
            Double a = scanner.nextDouble();
            System.out.println("Podaj druga liczbe: ");
            Double b = scanner.nextDouble();
            Scanner scanner1 = new Scanner((System.in));
            System.out.println("Podaj symbol dzialania(+,-,*,/");
            String z = scanner1.nextLine();

            Double sum;
            if (z.equals("+")) {
                sum = a + b;
                System.out.println("Wynik dzialania " + a + " " + z + " " + b + " = " + sum);
            }
            if (z.equals("-")) {
                sum = a - b;
                System.out.println("Wynik dzialania " + a + " " + z + " " + b + " = " + sum);
            }
            if (z.equals("*")) {
                sum = a * b;
                System.out.println("Wynik dzialania " + a + " " + z + " " + b + " = " + sum);
            }
            if (z.equals("/")) {
                sum = a / b;
                System.out.println("Wynik dzialania " + a + " " + z + " " + b + " = " + sum);
            }
        } catch (Exception e) {
            System.out.println("Podaj inna liczbe.");
        }
    }
}


package com.infoshareacademy;

import java.util.Scanner;

public class Calculator {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj symbol działania (+,-,*,/)");
        String symbol = scanner.nextLine();
        System.out.println("Podaj pierwszą liczbę:");
        Integer pierwszaLiczba = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        Integer drugaLiczba = scanner.nextInt();
        System.out.println("Wynik działania " + pierwszaLiczba + " " + symbol + " " + drugaLiczba + " =");


        if (symbol.equals("+")){
            System.out.println((double)pierwszaLiczba + (double)drugaLiczba);
        }
        else if (symbol.equals("-")){
            System.out.println((double)pierwszaLiczba - (double)drugaLiczba);
        }
        else if (symbol.equals("*")){
            System.out.println((double)pierwszaLiczba * (double)drugaLiczba);
        }
        else if (symbol.equals("/")){
            System.out.println((double)pierwszaLiczba / (double)drugaLiczba);
        }
        else {
            System.out.println("Niepoprawna operacja");
        }



    }

}


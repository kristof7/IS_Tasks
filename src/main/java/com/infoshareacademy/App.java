package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);


        System.out.println("Prosty kalkulatorek, który dodaj odejmuje mnoży i dzieli!");
        System.out.println("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();
        System.out.println("Jaką operacje chcesz wykonać? Wpisz :");
        System.out.println("+ dodawnie");
        System.out.println("- odejmowanie");
        System.out.println("* mnożenie");
        System.out.println("/ dzielenie");
        String operacja = scanner1.nextLine();


        if (operacja.equals("+")){
            double result = a + b;
            System.out.println("wynik działania "+ a + operacja + b +" = " + result);
        }
        else if (operacja.equals("-")) {
            double result =  a - b;
            System.out.println("wynik działania " + a + operacja + b + " = " + result);
        }
        else if (operacja.equals("*")){
            double result = a * b;
            System.out.println("wynik działania " + a + operacja + b + " = " + result);
        }
        else if (operacja.equals("/")){
            double result = a / b;
            System.out.println("wynik działania " + a + operacja + b + " = " + result);
        }
        else {
            System.out.println("Błędny znak operacji");
        }




    }

public static char returnFirstCharacter(String input) {

        char firstCharacter = input.charAt(0);

        return firstCharacter;
    }
}
package com.infoshareacademy;

import java.util.Scanner;

public class App {
 //@Homework2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int b = scanner.nextInt();
        Scanner scanner1 = new Scanner((System.in));
        System.out.println("Podaj symbol dzialania(+,-,*,/");
        String z = scanner1.nextLine();

        int sum;
        if(z.equals("+")){
          sum = a + b;
          System.out.println("Wynik dzialania " + a + " " + z + " " + b + " = " + sum);
        }
        if (z.equals("-")){
            sum = a - b;
            System.out.println("Wynik dzialania " + a + " " + z + " " + b + " = " + sum);
        }
        if (z.equals("*")){
            sum = a * b;
            System.out.println("Wynik dzialania " + a + " " + z + " " + b + " = " + sum);
        }
        if (z.equals("/")){
            sum = a/b;
            System.out.println("Wynik dzialania " + a + " " + z + " " + b + " = " + sum);
        }
    }
}

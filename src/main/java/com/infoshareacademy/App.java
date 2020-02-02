package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {


        System.out.println("Zadanie 1 - A : ");

        ExerciseA zadanie1A = new ExerciseA();

        System.out.println("Podaj jakis wyraz : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char letter = zadanie1A.firstChar(input);

        System.out.println(input + " - " + letter);
    }
}

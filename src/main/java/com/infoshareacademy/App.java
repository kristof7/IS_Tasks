package com.infoshareacademy;

import com.infoshareacademy.zadanie1.Zadanie_A;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        /* Uruchomienie zadania 1A */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź ciąg znaków, a ja zwrócę pierwszą występującą LITERĘ w tym ciągu:");
        String word = scanner.nextLine();
        System.out.println(word + " - " + Zadanie_A.returnFirstLetterFromScanner(word));
        scanner.close();


    }
}

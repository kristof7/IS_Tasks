package com.infoshareacademy;

import Zadanie1.ZadanieA.ExerciseA;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

//--------------ZADANIE A--------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word.., program will display first letter of the world:");
        String charWord = scanner.nextLine();
        System.out.println(charWord+" - "+ExerciseA.stringToChar(charWord));
//--------------------------------------------------

    }
}

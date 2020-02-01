package com.infoshareacademy.Zadanie_1.Zadanie_A;
import java.util.Scanner;

public class FirstLetter {
    public static void printFirstLetter() {
        System.out.println("Write something - i will tell you the first letter:");
        Scanner myScanner = new Scanner(System.in);
        String myInput = myScanner.nextLine();
        char firstLetter = myInput.charAt(0);
        System.out.println(myInput + " - " + firstLetter);
    }
}

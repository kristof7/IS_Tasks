package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz cos! ");
        String s = scanner.nextLine();
        char sReturned = returnFirstCharacter(s);
        System.out.println(s + " - "+sReturned);

        String a = "Test";
        String b = "2. Test";
        String c = ".3 Test";
        String d = "  cztery";

        char aReturned = returnFirstCharacter(a);
        char bReturned = returnFirstCharacter(b);
        char cReturned = returnFirstCharacter(c);
        char dReturned = returnFirstCharacter(d);

        System.out.println(a + " - " + aReturned);
        System.out.println(b + " - " + bReturned);
        System.out.println(c + " - " + cReturned);
        System.out.println(d + " - " + dReturned);

    }

public static char returnFirstCharacter(String input) {

        char firstCharacter = input.charAt(0);

        return firstCharacter;
    }
}
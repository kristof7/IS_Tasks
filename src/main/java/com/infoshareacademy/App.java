package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        printChar("");
    }


    public static char printChar(String name) {
        System.out.println("Podaj jakiś wyraz");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println(name + " - " + name.charAt(0));
        return name.charAt(0);
    }
}

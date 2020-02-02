package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s + " - " + myMethod(s));
    }

    public static char myMethod(String a) {
        char b = a.charAt(0);
        return b;
    }
}

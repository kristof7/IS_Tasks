package com.infoshareacademy;

import java.util.Scanner;

public class App {

    static char litera;
    static String wyraz;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("cw1");
        System.out.println("podaj napis:");

        wyraz = scanner.nextLine();
        System.out.println(wyraz+" - "+metoda(wyraz));
    }

    public static char metoda(String a) {

        for (int i = 0; i < a.length(); i++) {
            char[] listaliter = a.toCharArray();
            litera = listaliter[0];
        }

        return litera;

    }

}

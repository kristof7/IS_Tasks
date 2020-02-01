package com.infoshareacademy;

import java.util.Scanner;

public class FirstLetter {
        public static void firstLetter() {
            System.out.println("Write something you want:");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            char letter = text.charAt(0);
            System.out.println(text + " - " + letter);
    }
}

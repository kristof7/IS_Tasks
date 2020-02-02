package main.java.com.infoshareacademy;

import java.util.Scanner;

public class FirstLetter {
    public void firstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz jakiś łańcuch znaków:");
        String userString = scanner.nextLine();
        char first = userString.charAt(0);
        System.out.println(userString + " - " + first);
    }
}

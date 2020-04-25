package infoshareacademy.tasks.a_task;

import java.util.Scanner;

public class FirstLetter {

    public char returnFirstChar() {
        String string = "Java";
        return string.charAt(0);
    }

    public static run() {
        return scanString() + " - " + returnFirstChar();
    }

    public String scanString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
package infoshareacademy.tasks;

import java.util.Scanner;

public class TaskA {

    public char returnFirstChar(String example) {
        return example.charAt(0);
    }

    public void run() {
        System.out.println("Please enter an exemplary word: ");
        String example = scanString();
        System.out.println("Display of a word and its first letter: " + example + " - " + returnFirstChar(example));
    }

    public String scanString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
package com.infoshareacademy.tasks;

public class TaskA {
    public static char getFirstLetter(String text) {
        return text.charAt(0);
    }

    public static void run() {
        String text = "example";

        System.out.println(text + " - " + getFirstLetter(text));
    }
}

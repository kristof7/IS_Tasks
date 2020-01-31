package com.infoshareacademy;

public class App {
    public static void main(String[] args) {
        printChar("cokolwiek");
    }


    public static char printChar(String name) {
        System.out.println(name + " - " + name.charAt(0));
        return name.charAt(0);
    }
}
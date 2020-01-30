package com.infoshareacademy;

public class App {
    public static void main(String[] args) {
        printChar("cokolwiek");
    }


    public static char printChar(String name) {
        char[] chars = {'c', 'o', 'k', 'o', 'l', 'w', 'i', 'e', 'k'};
        name = new String(chars);
        System.out.println(name + " - " + chars[0]);
        return chars[0];
    }
}
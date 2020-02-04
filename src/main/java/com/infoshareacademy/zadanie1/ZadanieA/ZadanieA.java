package com.infoshareacademy.zadanie1.ZadanieA;

public class ZadanieA {

    public static char returnFirstLetterFromString(String string) {

    /* - metoda zwraca pierwszą LITERĘ wprowadzonego w skanerze stringa,
    pomija znaki specjalne, liczby, spacje*/

        return string.trim().replaceAll("[^a-zA-Z]", "").charAt(0);
    }
}

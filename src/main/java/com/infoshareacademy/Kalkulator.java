package com.infoshareacademy;

import java.util.Scanner;

public class Kalkulator {
    public void obliczenia() {
        double wynik = 0.0;
        Scanner podanaWartosc = new Scanner(System.in);
        Scanner podanaWartosc2 = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe : ");
        Double liczba1 = podanaWartosc.nextDouble();

        System.out.println("Podaj druga liczbe : ");
        Double liczba2 = podanaWartosc.nextDouble();

        System.out.println("Podaj rodzaj dzialania (+,-,*,/) : ");
        String rodzajDzialania = podanaWartosc2.nextLine();

        switch (rodzajDzialania) {
            case "+":
                wynik = dodawanie(liczba1, liczba2);
                System.out.println("Wynik operacji to : " + wynik);
                break;
            case "-":
                wynik = odejmowanie(liczba1, liczba2);
                System.out.println("Wynik operacji to : " + wynik);
                break;
            case "*":
                wynik = mnozenie(liczba1, liczba2);
                System.out.println("Wynik operacji to : " + wynik);
                break;
            case "/":
                if (liczba2 == 0) {
                    System.out.println("nie podzielisz przez 0 :) , wybierz ponownie liczby i dzialanie");
                    break;
                } else {
                    wynik = dzielenie(liczba1, liczba2);
                    System.out.println("Wynik operacji to : " + wynik);
                    break;
                }
            default: {
                System.out.println("Niepoprawna operacja, cyk i od nowa :)");
                break;
            }
        }
    }

    double dodawanie(Double l1, Double l2) {
        return l1 + l2;
    }

    double odejmowanie(Double l1, Double l2) {
        return l1 - l2;
    }

    double mnozenie(Double l1, Double l2) {
        return l1 * l2;
    }

    double dzielenie(Double l1, Double l2) {
        return l1 / l2;
    }

}
package com.infoshareacademy;

import java.util.Scanner;

public class Kalkulator {
    public void obliczenia() {
        double wynik = 0;
        double liczba1 = 0;
        double liczba2 = 0;
        double licznik = 0;
        Scanner podanaWartoscDzialania = new Scanner(System.in);

        while (licznik == 0) {
            Scanner podanaWartoscLiczbowa1 = new Scanner(System.in);
            try {
                System.out.println("Podaj pierwsza liczbe : ");
                liczba1 = podanaWartoscLiczbowa1.nextDouble();
                licznik +=1;
            } catch (Exception e) {
                System.out.println("bledna wartosc, podaj prawidlowa : ");
            }
        }
        licznik = 0;
        while (licznik == 0) {
            Scanner podanaWartoscLiczbowa2 = new Scanner(System.in);
            try {
                System.out.println("Podaj druga liczbe : ");
                liczba2 = podanaWartoscLiczbowa2.nextDouble();
                licznik +=1;
            } catch (Exception e) {
                System.out.println("bledna wartosc, podaj prawidlowa : ");
            }
        }
       licznik = 0;
        System.out.println("Podaj rodzaj dzialania (+,-,*,/) : ");
        while (licznik == 0) {
            String rodzajDzialania = podanaWartoscDzialania.nextLine();

            switch (rodzajDzialania) {
                case "+":
                    wynik = dodawanie(liczba1, liczba2);
                    System.out.println("Wynik operacji to : " + wynik);
                    licznik +=1;
                    break;
                case "-":
                    wynik = odejmowanie(liczba1, liczba2);
                    System.out.println("Wynik operacji to : " + wynik);
                    licznik +=1;
                    break;
                case "*":
                    wynik = mnozenie(liczba1, liczba2);
                    System.out.println("Wynik operacji to : " + wynik);
                    licznik +=1;
                    break;
                case "/":
                    if (liczba2 == 0) {
                        System.out.println("nie podzielisz przez 0 :) , wybierz ponownie dzialanie");
                        break;
                    } else {
                        wynik = dzielenie(liczba1, liczba2);
                        System.out.println("Wynik operacji to : " + wynik);
                        break;
                    }
                default: {
                    System.out.println("Niepoprawna operacja, wskaz prawidlowa (+,-,*,/)");
                    break;
                }
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
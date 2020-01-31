package com.infoshareacademy;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        System.out.println("JJDZ8 - homeworks!");
        Scanner pobranieZadania = new Scanner(System.in);
        System.out.println("A : Zadanie A - Wskazanie pierwszej litery z wyrazu.");
        System.out.println("B : Zadanie B - Prosty kalkulator.");
        System.out.println("C : Zadanie C - Karty, kolor - figura.");
        System.out.println("Wybierz zadanie : ");
        String rodzajZadania = pobranieZadania.nextLine();
        System.out.println("Wybrane zadanie : " + rodzajZadania.toUpperCase().charAt(0));

        switch (rodzajZadania.toUpperCase().charAt(0)) {
            case 'A': {
                Tekst napis = new Tekst();
                napis.wpiszNapis();
                break;
            }
            case 'B': {
                Kalkulator dzialanie = new Kalkulator();
                dzialanie.obliczenia();
                break;
            }
            case 'C': {
                Card karta = new Card();
                karta.wymienKarty();
                break;
            }
            default: {
                System.out.println("Nieprawidlowy wybor, sprobuj jeszcze raz :)");
                break;
            }
        }
    }
}

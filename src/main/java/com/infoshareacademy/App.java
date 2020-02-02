package com.infoshareacademy;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        System.out.println("JJDZ8 - homeworks!");

        int licznik = 0;
        while (licznik == 0) {
            Scanner pobranieZadania = new Scanner(System.in);
            System.out.println("A : Zadanie A - Wskazanie pierwszej litery z wyrazu.");
            System.out.println("B : Zadanie B - Prosty kalkulator.");
            System.out.println("C : Zadanie C - Karty, kolor - figura.");
            System.out.println("Wybierz zadanie : ");
            String rodzajZadania = pobranieZadania.nextLine();
            char rodzajZadaniaPierwsza = rodzajZadania.toUpperCase().charAt(0);
            System.out.println("Wybrane zadanie : " + rodzajZadaniaPierwsza);

            switch (rodzajZadaniaPierwsza) {
                case 'A': {
                    Tekst napis = new Tekst();
                    napis.wpiszNapis();
                    licznik +=1;
                    break;
                }
                case 'B': {
                    Kalkulator dzialanie = new Kalkulator();
                    dzialanie.obliczenia();
                    licznik +=1;
                    break;
                }
                case 'C': {
                    Card karta = new Card();
                    karta.wymienKarty();
                    licznik +=1;
                    break;
                }
                default: {
                    System.out.println("Nieprawidlowy wybor, sprobuj jeszcze raz :)");
                    break;
                }
            }
        }
    }
}

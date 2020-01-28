package com.infoshareacademy;

import com.infoshareacademy.zadanie1.ZadanieA.ZadanieA;
import com.infoshareacademy.zadanie1.ZadanieB.ZadanieB;
import com.infoshareacademy.zadanie1.ZadanieC.Card;
import com.infoshareacademy.zadanie1.ZadanieC.Ranks;
import com.infoshareacademy.zadanie1.ZadanieC.Suits;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Boolean isFinished = false;

    public static void main(String[] args) {



//--------------------------------------------------------------------------------
/* Uruchomienie zadania 1A */


        System.out.println("-----------------Zad 1a ------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź ciąg znaków, a ja zwrócę pierwszą występującą LITERĘ w tym ciągu:");
        String word = scanner.nextLine();
        System.out.println(word + " - " + ZadanieA.returnFirstLetterFromScanner(word));




//----------------------------------------------------------------------------------
/*Uruchomienie zadania 1B*/

        // zbieranie danych dla metody
        System.out.println("-----------------Zad 1b ------------------");


        while (!isFinished) {
            try {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Podaj pierwszą liczbę:");
                long firstNumber = scanner2.nextLong();
                System.out.println("Podaj drugą liczbę:");
                long secondNumber = scanner2.nextLong();
                String nothing = scanner2.nextLine();
                System.out.println("Podaj symbol działania (+,-,* lub /)");
                String symbol = scanner2.nextLine();

        // wywołanie metody i zabezpieczenie przed wprowadzeniem liczb zmiennoprzecinkowych i znaków innych od liczby

                ZadanieB.calculateTwoNumbersFromScanner(firstNumber, secondNumber, symbol);

            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane - wprowadzaj tylko liczby całkowite ");
            } catch (Exception e) {
                System.out.println("Coś poszło nie tak - skontaktuj się z twórcą kalkulatora :D ");
                break;
            }

        }

//--------------------------------------------------------------------------------
/* Uruchomienie zadania 1C*/

        System.out.println("-----------------Zad 1c ------------------");
        //tworzy kartę losując rank i suit
         Card randomCard = new Card(Card.getRandomSuit(), Card.getRandomRank());
         Card randomCard1 = new Card(Card.getRandomSuit(), Card.getRandomRank());
         Card randomCard2 = new Card(Card.getRandomSuit(), Card.getRandomRank());

        //printuje wyniki
        System.out.println("---------------------------------");
        System.out.println("Losowo wygenerowane karty: ");
        System.out.println(randomCard.getDescription(randomCard));
        System.out.println(randomCard.getDescription(randomCard1));
        System.out.println(randomCard.getDescription(randomCard2));
        System.out.println("--------------------------------");


        //umozliwia użytkownikowi stworzenie własnej karty

         //pozwala skorygować błędy użytkownikowi
        Boolean isPicked = null;
        while(isPicked ==null)

    {
        //wybór koloru karty ze skanera
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Stwórz swoją własną kartę - wybierz kolor karty wpisując literę odpowiadającą danej opcji:");
        System.out.println("c - clubs");
        System.out.println("d - diamonds");
        System.out.println("h - hearts");
        System.out.println("s - spades");
        String customSuitScan = scanner1.nextLine();
        Suits customSuit = Card.createCustomSuit(customSuitScan);

        //wybor figury karty ze skanera
        System.out.println("--------------------------------");
        System.out.println("wybierz figurę karty wpisując literę odpowiadającą danej opcji:");
        System.out.println("a - ace");
        System.out.println("k - king");
        System.out.println("q - queen");
        System.out.println("j - jack");
        String customRankScan = scanner1.nextLine();
        Ranks customRank = Card.createCustomRank(customRankScan);

        // Przywraca program do działania po błędzie użytkownika
        try {
            Card customCard = new Card(customSuit, customRank);
            System.out.println(customCard.getDescription(customCard));
            isPicked = true;
        } catch (Exception e) {
            System.out.println("Wybrano błędne literki, spróbuj jeszcze raz ");
        }
    }
}
}

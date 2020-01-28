package com.infoshareacademy;

import com.infoshareacademy.zadanie1.ZadanieC.Card;
import com.infoshareacademy.zadanie1.ZadanieC.Ranks;
import com.infoshareacademy.zadanie1.ZadanieC.Suits;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

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
        while (isPicked == null) {

            //wybór koloru karty ze skanera
            Scanner scanner = new Scanner(System.in);
            System.out.println("Stwórz swoją własną kartę - wybierz kolor karty wpisując literę odpowiadającą danej opcji:");
            System.out.println("c - clubs");
            System.out.println("d - diamonds");
            System.out.println("h - hearts");
            System.out.println("s - spades");
            String customSuitScan = scanner.nextLine();
            Suits customSuit = Card.createCustomSuit(customSuitScan);

            //wybor figury karty ze skanera
            System.out.println("--------------------------------");
            System.out.println("wybierz figurę karty wpisując literę odpowiadającą danej opcji:");
            System.out.println("a - ace");
            System.out.println("k - king");
            System.out.println("q - queen");
            System.out.println("j - jack");
            String customRankScan = scanner.nextLine();
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

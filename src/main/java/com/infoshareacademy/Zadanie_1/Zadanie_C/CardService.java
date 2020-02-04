package com.infoshareacademy.Zadanie_1.Zadanie_C;

import java.util.Scanner;

public class CardService {
    public static void printDescription(Card card) {
        System.out.println("Your card is:");
        System.out.println(card.getRank().toString().toLowerCase() + " - " + card.getSuit().toString().toLowerCase());
    }

    public static void addNewCard() {
        try {
            Card myCard = new Card();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Set your card rank:");
            myCard.setRank(Ranks.valueOf(scanner.nextLine().toUpperCase()));
            System.out.println("Set your card suit:");
            myCard.setSuit(Suits.valueOf(scanner.nextLine().toUpperCase()));

            printDescription(myCard);

        } catch (IllegalArgumentException e) {
            System.out.println("Not a proper rank (try ACE, QUEEN, KING or JACK)");
            System.out.println("or not a proper suit (try CLUBS, DIAMONDS, HEARTS or SPADES).");
        }
    }
}

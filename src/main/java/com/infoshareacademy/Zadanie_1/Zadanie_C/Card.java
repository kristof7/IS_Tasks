package com.infoshareacademy.Zadanie_1.Zadanie_C;

import java.util.Scanner;

public class Card {
    Suits suit;
    Ranks rank;

    public static void addNewCard() {
        try {
            Card myCard = new Card();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Set your card rank:");
            myCard.setRank(Ranks.valueOf(scanner.nextLine().toUpperCase()));
            System.out.println("Set your card suit:");
            myCard.setSuit(Suits.valueOf(scanner.nextLine().toUpperCase()));

            myCard.getDescription();

        } catch (IllegalArgumentException e) {
            System.out.println("Not a proper rank (try ACE, QUEEN, KING or JACK)");
            System.out.println("or not a proper suit (try CLUBS, DIAMONDS, HEARTS or SPADES)");
        }
    }

    public void getDescription() {
        System.out.println("Your card is:");
        System.out.println(this.getRank().toString().toLowerCase() + " - " + this.getSuit().toString().toLowerCase());
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }
}

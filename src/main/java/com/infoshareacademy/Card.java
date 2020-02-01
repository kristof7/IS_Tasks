package com.infoshareacademy;

import java.util.Scanner;

public class Card {
    private Ranks ranks;
    private Suits suits;

    public Ranks getRanks() {
        return ranks;
    }

    public void setRanks(Ranks ranks) {
        this.ranks = ranks;
    }

    public Suits getSuits() {
        return suits;
    }

    public void setSuits(Suits suits) {
        this.suits = suits;
    }

    Scanner scanner = new Scanner(System.in);
    public Card (Suits suits, Ranks ranks){
        this.suits = suits;
        this.ranks = ranks;
    }


    public static void getDescription() {
        System.out.println("Suits:");
        Scanner scanner = new Scanner(System.in);
        for (Suits suits : Suits.values())
            System.out.println(suits);
        System.out.println("Ranks:");
        for (Ranks ranks :Ranks.values())
            System.out.println(ranks);

        try{
            System.out.println("Enter suits and ranks value:");
            System.out.println(Suits.valueOf(scanner.next()) + " - " + Ranks.valueOf(scanner.next()));
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e);
        }
       /* Card card = new Card(Suits.HEARTS, Ranks.QUEEN);
        Card card1 = new Card(Suits.DIAMONDS, Ranks.JACK);
        Card card2 = new Card(Suits.HEARTS, Ranks.QUEEN);
        System.out.println(card.ranks + " - " + card.suits);
        System.out.println(card1.ranks + " - " + card1.suits);
        System.out.println(card2.ranks + " - " + card2.suits);*/
    }

}

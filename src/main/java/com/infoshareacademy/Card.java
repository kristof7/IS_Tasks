package com.infoshareacademy;

public class Card {
    private Suits suit;
    private Ranks rank;


    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public void getDescription() {
        System.out.println(rank.toString().toLowerCase() + " - " + suit.toString().toLowerCase());
    }
}

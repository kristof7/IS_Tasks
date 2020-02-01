package com.infoshareacademy;

import java.util.Scanner;

public class Card {
    private Suits suit;
    private Ranks rank;

    public Card(Ranks rank, Suits suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public Ranks getRank() { return rank; }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public String getDescription() {
        return rank.toString().toLowerCase()+ " - " + suit.toString().toLowerCase();
    }

}

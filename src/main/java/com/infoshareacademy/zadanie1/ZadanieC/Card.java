package com.infoshareacademy.zadanie1.ZadanieC;

import java.util.Random;

public class Card {

    private Suits suit;
    private Ranks rank;

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
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

    public String getDescription() {

        return getSuit().toString() + " - " + getRank().toString();
    }
}


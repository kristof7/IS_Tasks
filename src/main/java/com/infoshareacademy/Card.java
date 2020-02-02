package com.infoshareacademy;

public class Card {
    private App.Suits suit;
    private App.Ranks rank;

    public void setSuit(App.Suits suit) {
        this.suit = suit;
    }

    public void setRank(App.Ranks rank) {
        this.rank = rank;
    }

    public App.Suits getSuit() {
        return suit;
    }

    public App.Ranks getRank() {
        return rank;
    }

    public String getDescription(App.Suits a, App.Ranks b) {
        String c = a.toString().toLowerCase();
        String d = b.toString().toLowerCase();
        return c + " - " + d;
    }
}

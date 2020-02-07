package com.infoshareacademy;

public class Card {
    private Suits suits;
    private Ranks ranks;

    public Card(Suits suits, Ranks ranks) {
        this.suits = suits;
        this.ranks = ranks;
    }

    public Suits getSuits() {
        return suits;
    }

    public void setSuits(Suits suits) {
        this.suits = suits;
    }

    public Ranks getRanks() {
        return ranks;
    }

    public void setRanks(Ranks ranks) {
        this.ranks = ranks;
    }

}



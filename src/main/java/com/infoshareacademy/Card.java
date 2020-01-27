package com.infoshareacademy;

public class Card {
    private SUITS suits;
    private RANKS ranks;

    public SUITS getSuits() {
        return suits;
    }

    public void setSuits(SUITS suits) {
        this.suits = suits;
    }

    public RANKS getRanks() {
        return ranks;
    }

    public void setRanks(RANKS ranks) {
        this.ranks = ranks;
    }

    public String description(){
        return suits + "-" + ranks;
    }
}

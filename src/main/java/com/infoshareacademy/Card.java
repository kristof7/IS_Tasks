package com.infoshareacademy;

public class Card {
    private RANKS rank;
    private  SUITS suit;

    public Card (){

    }
    public Card(RANKS rank, SUITS suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public RANKS getRank() {
        return rank;
    }

    public void setRank(RANKS rank) {
        this.rank = rank;
    }

    public SUITS getSuits() {
        return suit;
    }

    public void setSuit(SUITS suit) {
        this.suit = suit;
    }

    public String getDescription(){
        String result = rank +" - "+ suit ;
        return result;
    }
}

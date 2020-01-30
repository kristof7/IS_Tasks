package com.infoshareacademy;

public class Card {
    private Suit suit;
    private Rank rank;

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRanks() {
        return rank;
    }

    public void setRanks(Rank rank) {
        this.rank = rank;
    }

    public String description() {
        return suit + "-" + rank;
    }

    public void setSUITSFromUserInput(String suits) {
        switch (suits.toUpperCase()) {
            case "DIAMONDS": {
                setSuit(Suit.DIAMONDS);
                break;
            }
            case "CLUBS": {
                setSuit(Suit.CLUBS);
                break;
            }
            case "HEARTS": {
                setSuit(Suit.HEARTS);
                break;
            }
            case "SPADES": {
                setSuit(Suit.SPADES);
                break;
            }
        }
    }

    public void setRANKSFromUserInput(String ranks) {
        switch (ranks.toUpperCase()) {
            case "JACK": {
                setRanks(Rank.JACK);
                break;
            }
            case "ACE": {
                setRanks(Rank.ACE);
                break;
            }
            case "KING": {
                setRanks(Rank.KING);
                break;
            }
            case "QUEEN": {
                setRanks(Rank.QUEEN);
                break;
            }
        }
    }

}

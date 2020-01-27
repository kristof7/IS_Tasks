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

    public String description() {
        return suits + "-" + ranks;
    }

    public void setSUITSFromUserInput(String suits) {
        switch (suits) {
            case "DIAMONDS": {
                setSuits(SUITS.DIAMONDS);
                break;
            }
            case "CLUBS": {
                setSuits(SUITS.CLUBS);
                break;
            }
            case "HEARTS": {
                setSuits(SUITS.HEARTS);
                break;
            }
            case "SPADES": {
                setSuits(SUITS.SPADES);
                break;
            }
        }
    }

    public void setRANKSFromUserInput(String ranks) {
        switch (ranks) {
            case "JACK": {
                setRanks(RANKS.JACK);
                break;
            }
            case "ACE": {
                setRanks(RANKS.ACE);
                break;
            }
            case "KING": {
                setRanks(RANKS.KING);
                break;
            }
            case "QUEEN": {
                setRanks(RANKS.QUEEN);
                break;
            }
        }
    }

}

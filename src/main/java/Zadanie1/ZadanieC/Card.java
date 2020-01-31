package Zadanie1.ZadanieC;

public class Card {
    private Ranks ranks;
    private Suits suits;

    public Card(Suits spades, Ranks ace) {
    }

    public Ranks ranks() {
        return getRanks();
    }
    public Suits suits() {
        return getSuits();
    }
//----Getters-----

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
}

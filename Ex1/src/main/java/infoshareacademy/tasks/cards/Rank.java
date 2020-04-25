package infoshareacademy.tasks.cards;

public enum Rank {
    ACE("Ace"),
    KING("King"),
    QUEEN("Queen"),
    JACK("Jack");

    private String rank;

    public String getRank() {
        return rank;
    }

    Rank(String rank) {
        this.rank = rank;
    }
}
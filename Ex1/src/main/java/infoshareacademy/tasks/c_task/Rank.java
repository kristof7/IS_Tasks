package infoshareacademy.tasks.c_task;

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
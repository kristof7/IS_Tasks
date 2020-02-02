package ExerciseC;

public class Card {
    private static Ranks ranks;
    private static Suits suits;

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

    public static String getDescription() {
        return suits + "-" + ranks;
    }

//    public Card(Ranks ranks, Suits suits) {
//        this.ranks = ranks;
//        this.suits = suits;
//    }

    public void suitsInput(String suits) {
        switch (suits.toUpperCase()) {
            case "DIAMONDS":
                setSuits(Suits.DIAMONDS);
                break;
            case "CLUBS":
                setSuits(Suits.CLUBS);
                break;
            case "HEARTS":
                setSuits(Suits.HEARTS);
                break;
            case "SPADES":
                setSuits(Suits.SPADES);
                break;
            default:
                System.out.println("Wybierz z : DIAMONDS/CLUBS/HEARTS/SPADES!");

        }
    }

    public void ranksInput(String ranks) {
        switch (ranks.toUpperCase()) {
            case "ACE":
                setRanks(Ranks.ACE);
                break;
            case "KING":
                setRanks(Ranks.KING);
                break;
            case "QUEEN":
                setRanks(Ranks.QUEEN);
                break;
            case "JACK":
                setRanks(Ranks.JACK);
                break;
            default:
                System.out.println("Wybierz z : ACE/KING/QUEEN/JACK!");

        }

    }


//    public static void getDescription() {
//        Card card1 = new Card(Ranks.JACK, Suits.HEARTS);
//        Card card2 = new Card(Ranks.KING, Suits.SPADES);
//        Card card3 = new Card(Ranks.ACE, Suits.DIAMONDS);
//        System.out.println(card1.ranks + " - " + card1.suits);
//        System.out.println(card2.ranks + " - " + card2.suits);
//        System.out.println(card3.ranks + " - " + card3.suits);
//
//    }

}

package infoshareacademy.quiz;

public class ScoresPrinter {

    public static void print(int score) {
        if (score > 0) {
            System.out.println("****************************************");
            System.out.println("Congrats you have earn: " + score);
            System.out.println("****************************************");
            return;
        }
        System.out.println("****************************************");
        System.out.println("Sorry you have no correct answer");
        System.out.println("****************************************");
    }
}

package infoshareacademy;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> questionsArray;

    public Quiz() {
        questionsArray = new ArrayList<>();
        questionsArray.add(new Question(Category.history, "W ktorym roku odbyla sie Bitwa pod Grunwaldem?", "1410", "966", "1914", "A"));
        questionsArray.add(new Question(Category.geography,"W jakim wojewodztwie lezy Kalisz?", "mazowieckim", "malopolskim", "wielkopolskim", "C"));
        questionsArray.add(new Question(Category.finance,"Jezeli za 1 euro otrzymamy 4 zlote to ile euro otrzymamy za 1 zlotowke?", "0,25 euro", "4 euro", "2 euro", "A"));
        questionsArray.add(new Question(Category.film,"Serialowa Kasia z serialu Kasia i Tomek to:","Katarzyna Cichopek", "Malgorzata Foremniak", "Joanna Brodzik", "C"));
        questionsArray.add(new Question(Category.biology,"Najwiekszym ssakiem jest?","Slon", "Wieloryb", "Mamut", "B"));
    }

    public Question drawQuestion() {
        return questionsArray.get((int) (Math.random() * questionsArray.size()));
    }

    public String getAnswer(Question currentQuestion, Scanner scanner) {
        String currentAnswer;
        while (true) {
            System.out.print("Twoja odpowiedz (A, B lub C): ");
            currentAnswer = scanner.nextLine();
            if (currentAnswer.equalsIgnoreCase("A") || currentAnswer.equalsIgnoreCase("B") || currentAnswer.equalsIgnoreCase("C")) {
                break;
            } else {
                System.out.println("\nSproboj odpowiedzi sposrod A, B lub C");
            }
        }
        return currentAnswer;
    }
}

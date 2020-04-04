package infoshareacademy;

import java.util.Scanner;

public class Question {
    private String question;
    private Category category;
    private String [] answers;
    private int rightIndex;
    private final static char [] abc = {'a', 'b', 'c'};

    public Question(String question, Category category, String[] answers, int rightIndex) {
        this.question = question;
        this.category = category;
        this.answers = answers;
        this.rightIndex = rightIndex;
    }

    public void showQuestion(){
        System.out.println("Kategoria: "  + category);
        System.out.println("Pytanie: " + question);
        System.out.println("Odpowiedzi: ");
        for (int i = 0; i < answers.length; i++){
            System.out.println(abc[i] + ". " + answers[i]);
        }
    }

    public boolean isRightAnwserLetter (char usersAnwser) {
        char theRightAnwser = abc[rightIndex];
        return usersAnwser == theRightAnwser;
    }

    public String toString(){
        return question;
    }

    public void showRightAnwser(){
        System.out.println(Question.abc[rightIndex]);
    }
}

package main.java.infoshareacademy;

import java.util.UUID;

public class Question {
    private int questionNumber;
    private String questionText;
    private UUID id;

    public Question(int questionNumber, String questionText) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.id = UUID.randomUUID();
    }

    public String getQuestionText() {
        return questionText;
    }
}

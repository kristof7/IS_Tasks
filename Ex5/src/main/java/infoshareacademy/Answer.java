package main.java.infoshareacademy;

import java.util.UUID;

public class Answer {
    private int answerNumber;
    private String correctAnswer;
    private String[] falseAnswers;
    private UUID id;

    public Answer(int answerNumber, String correctAnswer, String[] falseAnswers, UUID id) {
        this.answerNumber= answerNumber;
        this.correctAnswer = correctAnswer;
        this.falseAnswers = falseAnswers;
        this.id = id;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String[] getFalseAnswers() {
        return falseAnswers;
    }
}

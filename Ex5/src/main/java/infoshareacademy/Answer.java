package main.java.infoshareacademy;

public class Answer {
    //private int answerNumber;
    private String correctAnswer;
    private String[] falseAnswers;

    public Answer(String correctAnswer, String[] falseAnswers) {
        //this.answerNumber= answerNumber;
        this.correctAnswer = correctAnswer;
        this.falseAnswers = falseAnswers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String[] getFalseAnswers() {
        return falseAnswers;
    }
}

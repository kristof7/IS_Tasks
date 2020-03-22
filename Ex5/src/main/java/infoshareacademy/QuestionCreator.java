package main.java.infoshareacademy;

import java.util.ArrayList;

public class QuestionCreator {
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void createQuestion(String[] rows) {
        this.question = new Question(
                Integer.getInteger(rows[0]),
                rows[1]
        );
    }
}

package infoshareacademy.questions;

import infoshareacademy.answers.Answers;

public class Question {

    private String content;

    private Answers answers = new Answers();

    public Question(String questionsContent) {
        this.content = questionsContent;
    }

    public String getContent() {
        return content;
    }

    public Answers getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionsContent='" + content + '\'' +
                '}';
    }
}

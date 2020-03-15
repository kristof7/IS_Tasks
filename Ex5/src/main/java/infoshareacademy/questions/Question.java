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

    public void printQuestion() {
        System.out.println("****************************************");
        System.out.println(this.content);
        System.out.println("****************************************");

        this.answers.getAnswersForQuestion().forEach((key, value) -> System.out.println(key + " : " + value));
        this.answers.setCorrectAnswersForQuestion();
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionsContent='" + content + '\'' +
                '}';
    }
}

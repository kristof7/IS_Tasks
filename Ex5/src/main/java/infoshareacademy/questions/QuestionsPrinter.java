package infoshareacademy.questions;

import infoshareacademy.gamers.Gamer;

public class QuestionsPrinter {

    public static void printQuestion(Question question) {
        System.out.println("****************************************");
        System.out.println(question.getContent());
        System.out.println("****************************************");

        question.getAnswers().getAnswersForQuestion().forEach((key, value) -> System.out.println(key + " : " + value));
        question.getAnswers().setCorrectAnswersForQuestion();
    }

    public static void printMistakeQuestionsWithCorrectAnswers(Gamer gamer) {
        System.out.println("****************************************");
        System.out.println("Wrong answers for Questions");
        System.out.println("****************************************");

        for (Question question : gamer.getWithWrongAnswers()) {
            System.out.println(question.getContent());
            System.out.println("Correct answers:");
            question.getAnswers().getCorrectAnswersForQuestion().forEach((key, value) -> System.out.println(key + " : " + value));

        }
    }
}

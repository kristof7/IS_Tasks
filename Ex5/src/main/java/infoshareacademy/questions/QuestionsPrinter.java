package infoshareacademy.questions;

public class QuestionsPrinter {

    public static void printQuestion(Question question) {
        System.out.println("****************************************");
        System.out.println(question.getContent());
        System.out.println("****************************************");
        question.getAnswers().getAnswersForQuestion().forEach((key, value) -> System.out.println(key + " : " + value));
        question.getAnswers().setCorrectAnswersForQuestion();
    }
}

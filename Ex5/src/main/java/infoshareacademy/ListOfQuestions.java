package infoshareacademy;

import java.util.ArrayList;

public class ListOfQuestions {

    public static ArrayList<Question> questionsLoad() {

        ArrayList<Question> questions = new ArrayList<>();

        Question question1 = new Question();
        question1.setContent("Jakiego koloru jest marchewka?");
        question1.getAnswers().add("a. zielonego");
        question1.getAnswers().add("b. zoltego");
        question1.getAnswers().add("c. pomaranczowego");
        question1.setCorrectAnswer("c");


        Question question2 = new Question();
        question2.setContent("Co oznacza nazwa 'Great Circle'?");
        question2.getAnswers().add("a. ortodrome");
        question2.getAnswers().add("b. loksodrome");
        question2.getAnswers().add("c. rownik");
        question2.setCorrectAnswer("a");


        Question question3 = new Question();
        question3.setContent("Co to sa monsuny?");
        question3.getAnswers().add("a. plywy ");
        question3.getAnswers().add("b. wiatry sezonowe");
        question3.getAnswers().add("c. wysokie fale");
        question3.setCorrectAnswer("b");

        Question question4 = new Question();
        question4.setContent("Jak na imie mial Lord Vader, postac z uniwersum Gwiezdnych Wojen?");
        question4.getAnswers().add("a. Obi-Wan Kenobi");
        question4.getAnswers().add("b. Anakin Skywalker");
        question4.getAnswers().add("c. Luke Skywalker");
        question4.setCorrectAnswer("b");

        Question question5 = new Question();
        question5.setContent("Kto jest najbogatszym czlowiekiem na swiecie?");
        question5.getAnswers().add("a. Jeff Bezos");
        question5.getAnswers().add("b. Billy Gates");
        question5.getAnswers().add("c. Vladimir Putin");
        question5.setCorrectAnswer("a");

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);

        return questions;
    }
}

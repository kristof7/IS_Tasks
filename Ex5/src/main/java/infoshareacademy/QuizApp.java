package infoshareacademy;

import infoshareacademy.quiz.Question;
import infoshareacademy.quiz.QuestionType;
import infoshareacademy.quiz.Quiz;

import java.util.*;

public class QuizApp {

    public static void main(String[] args) {

        Set<Question> questionSet = new HashSet<>();

        Question question1 = new Question();
        Question question2 = new Question();
        Question question3 = new Question();
        Question question4 = new Question();
        Question question5 = new Question();
        Question question6 = new Question();
        Question question7 = new Question();
        Question question8 = new Question();
        Question question9 = new Question();

        question1.setQuestionText("W którym roku miał swoją premierę film \"Killer\" w reżyserii Juliusza Machulskiego?");
        question1.setAnswerA("A) 1996");
        question1.setAnswerB("B) 1997");
        question1.setAnswerC("C) 1999");
        question1.setCorrectAnswer("b");
        question1.setQuestionType(QuestionType.FILM);
        question1.addAnswersToList(question1.getAnswerA(),question1.getAnswerB(),question1.getAnswerC());

        question2.setQuestionText("Kto był reżyserem filmu \"Quo Vadis\" z roku 2001");
        question2.setAnswerA("A) Jerzy Kawalerowicz");
        question2.setAnswerB("B) Krzysztof Zanussi");
        question2.setAnswerC("C) Agnieszka Holland");
        question2.setCorrectAnswer("a");
        question2.setQuestionType(QuestionType.FILM);
        question2.addAnswersToList(question2.getAnswerA(),question2.getAnswerB(),question2.getAnswerC());

        question3.setQuestionText("Kto wcielił się w rolę głównego bohatera filmu \"Fuks\"?");
        question3.setAnswerA("A) Bogusław Linda");
        question3.setAnswerB("B) Cezary Pazura");
        question3.setAnswerC("C) Maciej Stuhr");
        question3.setCorrectAnswer("c");
        question3.setQuestionType(QuestionType.FILM);
        question3.addAnswersToList(question3.getAnswerA(),question3.getAnswerB(),question3.getAnswerC());


        question4.setQuestionText("W którym roku został wydany album zespołu Raz Dwa Trzy pt. \"Trudno nie wierzyć w nic\"?");
        question4.setAnswerA("A) 2006");
        question4.setAnswerB("B) 2003");
        question4.setAnswerC("C) 2005");
        question4.setCorrectAnswer("b");
        question4.setQuestionType(QuestionType.MUSIC);
        question4.addAnswersToList(question4.getAnswerA(),question4.getAnswerB(),question4.getAnswerC());


        question5.setQuestionText("Z jakiego powodu kury piejo w piosence Grzegorza z Ciechowa");
        question5.setAnswerA("A) Nie maja koguta");
        question5.setAnswerB("B) Wzruszyła je ladna biłgoralsko nuta");
        question5.setAnswerC("C) Cierpią bo już są pełne mleka");
        question5.setCorrectAnswer("a");
        question5.setQuestionType(QuestionType.MUSIC);
        question5.addAnswersToList(question5.getAnswerA(),question5.getAnswerB(),question5.getAnswerC());


        question6.setQuestionText("Zespół Kwiat Jabłoni tworzą brat i siostra. Który znany muzyk jest ich ojcem?");
        question6.setAnswerA("A) Kazimierz Staszewski");
        question6.setAnswerB("B) Jędrzej Kodymowski");
        question6.setAnswerC("C) Kuba Sienkiewicz");
        question6.setCorrectAnswer("c");
        question6.setQuestionType(QuestionType.MUSIC);
        question6.addAnswersToList(question6.getAnswerA(),question6.getAnswerB(),question6.getAnswerC());

        question7.setQuestionText("Kto zamordował pierwszego prezydenta II RP Gabriela Narutowicza?");
        question7.setAnswerA("A) Józef Pankiewicz");
        question7.setAnswerB("B) Eligiusz Niewiadomski");
        question7.setAnswerC("C) Władysław Strzemiński.");
        question7.setCorrectAnswer("b");
        question7.setQuestionType(QuestionType.HISTORY);
        question7.addAnswersToList(question7.getAnswerA(),question7.getAnswerB(),question7.getAnswerC());

        question8.setQuestionText("O którym panie Stanisłąwie mówiono, że \"wprzód uderzy, nim wypowie\" ");
        question8.setAnswerA("A) S. Koniepolski");
        question8.setAnswerB("B) S. Żółkiewski");
        question8.setAnswerC("C) S. Staniszewski");
        question8.setCorrectAnswer("a");
        question8.setQuestionType(QuestionType.HISTORY);
        question8.addAnswersToList(question8.getAnswerA(),question8.getAnswerB(),question8.getAnswerC());

        question9.setQuestionText("Jak się nazywała druga żona Mieszka Pierwszego?");
        question9.setAnswerA("A) Bona Sforza");
        question9.setAnswerB("B) Dobrawa Przemyślidka");
        question9.setAnswerC("C) Oda Dytrykówna");
        question9.setCorrectAnswer("c");
        question9.setQuestionType(QuestionType.HISTORY);
        question9.addAnswersToList(question9.getAnswerA(),question9.getAnswerB(),question9.getAnswerC());


        questionSet.add(question1);
        questionSet.add(question2);
        questionSet.add(question3);
        questionSet.add(question4);
        questionSet.add(question5);
        questionSet.add(question6);
        questionSet.add(question7);
        questionSet.add(question8);
        questionSet.add(question9);

        int i = 1;
        byte score = 0;
        for (Question question: questionSet) {
            Quiz quiz = new Quiz();
            quiz.askAQuestion(question,i);
            if (quiz.expectAnAnswer(question)) score++;
            i++;
        }
        System.out.println("Twój wynik to " + score + " na 9 możliwych punktów!");


    }
}
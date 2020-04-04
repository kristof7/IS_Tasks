package infoshareacademy;

import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Question [] allQuestions = {
                new Question("Co to jest String pool?", Category.JAVA,
                        new String[]{"Nie ma zastosowania w javie.", "Tablica ze Stringami.", "Miejsce w pamieci gdzie przechowywan jest pula Stringow."}, 2),
                new Question("Co to są obiekty immutable? ", Category.JAVA,
                        new String[]{"Obiekty, które są niemodyfikowalne i nie mogą po utworzeniu zmienić swojego stanu.", "To tak naprawdę klasy, które po utworzeniu mogą zmienić swój stan.", "To obiekty modyfikowalne."}, 0),
                new Question("Co to jest Enum? ", Category.JAVA,
                        new String[]{"Rodzaj strusia.", "Typ wyliczeniowy.", "Nie wiem."}, 1),
                new Question("Czy klasa może dziedziczyć po interfejsach? ", Category.JAVA,
                        new String[]{"Tak.", "Nie.", "Czasem może, a czasem nie."}, 1)
        };
        List<Question> questionAppList = pickRandomlyQuestion(allQuestions, 3);
        Quiz quiz = new Quiz(questionAppList);
        while (!quiz.isOver()) {
            quiz.displayQuestion();
            quiz.compareProvidedAnwserToRightOne();
            quiz.nextQuestion();
        }
        quiz.showResult();

    }
    public static List<Question> pickRandomlyQuestion(Question[] allQuestions, int questionsNeeded){
        List<Question> result = new ArrayList<>();
        Set<Integer> usedQuestions = new HashSet<>();
        int numberQuestion;
        while (usedQuestions.size() != questionsNeeded) {
            numberQuestion = (int) (Math.random() * allQuestions.length);
            if(!usedQuestions.contains(numberQuestion)){
                result.add(allQuestions[numberQuestion]);
            }
            usedQuestions.add(numberQuestion);
        }
        return result;
    }
}
package org.example;

import java.util.*;

public class DatabaseOfQuestions {
    Set<Question> setOfQuestions = new HashSet<>();
    Scanner inputValue = new Scanner(System.in);

    public void addingQuestionsToDatabase() {

        Question question1 = new Question(Category.GEOGRAFIA, "Co jest stolicą Polski: \n A) Gdańsk \n B) Warszawa\n C) Kraków", "B");
        Question question2 = new Question(Category.WIEDZA_OGOLNA, "Ile mam lat: \n A) 20 \n B) 26 \n C) 32", "B");
        Question question3 = new Question(Category.PRZYRODA, "Jaką wagę jest w stanie podnieść trąba słonia? \n A) 50kg \n B) 270kg \n C) 540kg", "B");
        Question question4 = new Question(Category.PRZYRODA, "Jaką max pędkoś rozwijają zające w km/h?  \n A) 30 \n B) 50 \n C) 70", "C");
        Question question5 = new Question(Category.PRZYRODA, "Jak długo może nie pić wody wielbłąd w dniach?  \n A) 2 \n B) 8 \n C) 15", "B");

        Question[] questions = {question1, question2, question3, question4, question5};
        setOfQuestions.addAll(Arrays.asList(questions));
    }

    public void readingQuestionsFromDatabase() {
        String answer;
        int score = 0;
        int counterOfVisibleQuestions = 0;
        for (Question question : setOfQuestions) {
            System.out.println("KATEGORIA:" + question.getCategory());
            System.out.println(question.getQuestionBody());

            do {
                System.out.println("Twoja odpowiedź to: ");
                answer = inputValue.next();
            } while (!answer.equalsIgnoreCase("a") && !answer.equalsIgnoreCase("b") && !answer.equalsIgnoreCase("c"));

            if (answer.equalsIgnoreCase(question.getCorrectAnswer())) {
                score++;
                System.out.println("Zgadłeś! \n");
            } else {
                System.out.println("Prawidłową odpowiedzią była odpowiedź: " + question.getCorrectAnswer() + "\n");
            }

            counterOfVisibleQuestions++;
            if(counterOfVisibleQuestions>= setOfQuestions.size()-2)
            {
                break;
            }
        }
        System.out.println("Udzieliłeś " + score + "/" + counterOfVisibleQuestions + " poprawnych odpowiedzi");
    }

}

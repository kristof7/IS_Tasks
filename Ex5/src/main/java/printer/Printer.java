package printer;
import questions.Question;
import questions.QuestionsList;
import java.util.concurrent.TimeUnit;

import static java.lang.System.*;

public class Printer extends QuestionsList {

    public static Integer points = 0;
    public static final String LINE = "----------------------------------------------";
    public static final String CATEGORY = "Wybrano kategorię: ";


    protected Question printRandomQuestion() {
        Question question = questionsList.get(randomInt());
        out.println(question.getQuestion());
        out.println("A:      " + question.getAnswers()[0]);
        out.println("B:      " + question.getAnswers()[1]);
        out.println("C:      " + question.getAnswers()[2]);
        return question;
    }


    protected void printWelcomeMessage() throws InterruptedException {
        out.println(LINE);
        out.println("QUIZ GAME!\n");
        out.println("Quiz składa się z czterech pytań. Każde pytanie może mieć więcej niż jedną odpowiedź.");
        out.println("Aby udzielić odpowiedzi na pytanie, wprowadź litery odpowiadające poprawnym odpowiedziom\n");
        out.println("Np. jeśli uważasz, że poprawne odpowiedzi to A i B, należy od razu wprowadzić obie odpowiedzi.\n");
        out.println("Zaczynamy!");
        wait2Sec();
    }

    protected void printCategories() {
        out.println(LINE);
        out.println("Wybierz kategorię: ");
        out.println("#1: Programowanie         #2: Ekonomia        #3: Wiedza ogólna" );
    }

    private void wait2Sec() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }


    protected void printScore() {
        out.println("Twój wynik to : " + points + "/4 punkty.");
    }

    protected void info() {
        out.println("\n\n!!Pytania pochodzą z Internetu, zostały wymyślone samodzielnie oraz zostały pozyskane z testu INFOSHARE ACADEMY!!\n\n");
    }
}

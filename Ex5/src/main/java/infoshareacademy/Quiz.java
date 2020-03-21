package infoshareacademy;

import java.util.concurrent.TimeUnit;

public class Quiz {

    public static void startQuiz() throws InterruptedException {

        System.out.println("--- Witamy w grze InfoQuizEx5 ---\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("# Pytania są jednokrotnego wyboru");
        System.out.print("# Pytania z kategorii: ");
        Category.category();
        TimeUnit.SECONDS.sleep(3);
        System.out.println("\n");
        Questions.Questions();
    }
}

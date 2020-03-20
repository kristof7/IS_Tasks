package infoshareacademy;

import java.util.concurrent.TimeUnit;

public class Summary {

    public static void summaryQuiz(int score) throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);
        System.out.println(" --- Twój wynik Quizu to : " + score + "pkt --- ");
        TimeUnit.SECONDS.sleep(1);
        switch (score){
            case 0:
            case 1:
                System.out.println("Naprawde?! lepiej się poucz ;)");
                break;
            case 2:
            case 3:
                System.out.println("Mogło być lepiej! spróbuj jeszcze raz :)");
                break;
            case 4:
                System.out.println("Dobry wynik! Tak trzymać!");
                break;
            case 5:
                System.out.println("5! poproszę indeks studencie! :)");
                break;
        }
    }
}

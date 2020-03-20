package infoshareacademy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Answers {

    private static int score;
    private static int counter;

    public static void answersCorrect(Integer inputCategory, Integer inputQuestion, Character inputAnswer) throws InterruptedException {

        Map<Integer, Character> answersCorrectMap = new HashMap<>();
        answersCorrectMap.put(11, 'a');
        answersCorrectMap.put(12, 'c');
        answersCorrectMap.put(13, 'a');
        answersCorrectMap.put(21, 'c');
        answersCorrectMap.put(22, 'a');
        answersCorrectMap.put(23, 'b');
        answersCorrectMap.put(31, 'b');
        answersCorrectMap.put(32, 'c');
        answersCorrectMap.put(33, 'a');
        answersCorrectMap.put(41, 'b');
        answersCorrectMap.put(42, 'b');
        answersCorrectMap.put(43, 'c');

        Integer intInputCategoryInputQuestion = Integer.parseInt(inputCategory+""+inputQuestion);
        Character answerCorrectChar = answersCorrectMap.get(intInputCategoryInputQuestion);

        if( inputAnswer == answerCorrectChar){
            TimeUnit.SECONDS.sleep(1);
            System.out.println("TAK! - to prawidłowa odpowiedź\n");
            TimeUnit.SECONDS.sleep(1);
            score += 1;
            counter += 1;
        }else {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Niestety to nie jest prawidłowa odpowiedź, prawidłowa to : " + answerCorrectChar + "\n");
            TimeUnit.SECONDS.sleep(1);
            counter += 1;
        }

        if (counter == 5) {
            Summary.summaryQuiz(score);
        }

    }


    public static void answersAll(Integer inputCategory, Integer inputQuestion) throws InterruptedException {

        Map<Character, String> odpowiedzi_IT_1 = new HashMap<>();
        odpowiedzi_IT_1.put('a', "java");
        odpowiedzi_IT_1.put('b', "c++");
        odpowiedzi_IT_1.put('c', "ruby");

        Map<Character, String> odpowiedzi_IT_2 = new HashMap<>();
        odpowiedzi_IT_2.put('a', "terminator");
        odpowiedzi_IT_2.put('b', "noob");
        odpowiedzi_IT_2.put('c', "nerd");

        Map<Character, String> odpowiedzi_IT_3 = new HashMap<>();
        odpowiedzi_IT_3.put('a', "apple");
        odpowiedzi_IT_3.put('b', "microsoft");
        odpowiedzi_IT_3.put('c', "ibm");

        Map<Integer, Object> odpowiedzi_IT = new HashMap<>();
        odpowiedzi_IT.put(1, odpowiedzi_IT_1);
        odpowiedzi_IT.put(2, odpowiedzi_IT_2);
        odpowiedzi_IT.put(3, odpowiedzi_IT_3);

        Map<Character, String> odpowiedzi_SPORT_1 = new HashMap<>();
        odpowiedzi_SPORT_1.put('a', "hokej");
        odpowiedzi_SPORT_1.put('b', "koszykówka");
        odpowiedzi_SPORT_1.put('c', "krykiet");

        Map<Character, String> odpowiedzi_SPORT_2 = new HashMap<>();
        odpowiedzi_SPORT_2.put('a', "9,58s");
        odpowiedzi_SPORT_2.put('b', "9,69s");
        odpowiedzi_SPORT_2.put('c', "9,72s");

        Map<Character, String> odpowiedzi_SPORT_3 = new HashMap<>();
        odpowiedzi_SPORT_3.put('a', "Brazylia");
        odpowiedzi_SPORT_3.put('b', "Polska");
        odpowiedzi_SPORT_3.put('c', "Francja");

        Map<Integer, Object> odpowiedzi_SPORT = new HashMap<>();
        odpowiedzi_SPORT.put(1, odpowiedzi_SPORT_1);
        odpowiedzi_SPORT.put(2, odpowiedzi_SPORT_2);
        odpowiedzi_SPORT.put(3, odpowiedzi_SPORT_3);

        Map<Character, String> odpowiedzi_GEOGRAFIA_1 = new HashMap<>();
        odpowiedzi_GEOGRAFIA_1.put('a', "K2");
        odpowiedzi_GEOGRAFIA_1.put('b', "Mount Everest");
        odpowiedzi_GEOGRAFIA_1.put('c', "Kanczendzonga");

        Map<Character, String> odpowiedzi_GEOGRAFIA_2 = new HashMap<>();
        odpowiedzi_GEOGRAFIA_2.put('a', "Włochy");
        odpowiedzi_GEOGRAFIA_2.put('b', "Hiszpania");
        odpowiedzi_GEOGRAFIA_2.put('c', "Francja");

        Map<Character, String> odpowiedzi_GEOGRAFIA_3 = new HashMap<>();
        odpowiedzi_GEOGRAFIA_3.put('a', "Santa Maria");
        odpowiedzi_GEOGRAFIA_3.put('b', "Pinta");
        odpowiedzi_GEOGRAFIA_3.put('c', "Nina");

        Map<Integer, Object> odpowiedzi_GEOGRAFIA = new HashMap<>();
        odpowiedzi_GEOGRAFIA.put(1, odpowiedzi_GEOGRAFIA_1);
        odpowiedzi_GEOGRAFIA.put(2, odpowiedzi_GEOGRAFIA_2);
        odpowiedzi_GEOGRAFIA.put(3, odpowiedzi_GEOGRAFIA_3);

        Map<Character, String> odpowiedzi_POLSKA_1 = new HashMap<>();
        odpowiedzi_POLSKA_1.put('a', "odpoczywa");
        odpowiedzi_POLSKA_1.put('b', "remontuje");
        odpowiedzi_POLSKA_1.put('c', "pracuje");

        Map<Character, String> odpowiedzi_POLSKA_2 = new HashMap<>();
        odpowiedzi_POLSKA_2.put('a', "piłka nożna");
        odpowiedzi_POLSKA_2.put('b', "marudzenie");
        odpowiedzi_POLSKA_2.put('c', "picie");

        Map<Character, String> odpowiedzi_POLSKA_3 = new HashMap<>();
        odpowiedzi_POLSKA_3.put('a', "polo i chinosy");
        odpowiedzi_POLSKA_3.put('b', "marynarka i jeans");
        odpowiedzi_POLSKA_3.put('c', "koszulka na ramiaczka i skarpety do sandałów");

        Map<Integer, Object> odpowiedzi_POLSKA = new HashMap<>();
        odpowiedzi_POLSKA.put(1, odpowiedzi_POLSKA_1);
        odpowiedzi_POLSKA.put(2, odpowiedzi_POLSKA_2);
        odpowiedzi_POLSKA.put(3, odpowiedzi_POLSKA_3);

        Map<Integer, Object> answersCategoryMap = new HashMap<>();
        answersCategoryMap.put(1, odpowiedzi_IT);
        answersCategoryMap.put(2, odpowiedzi_SPORT);
        answersCategoryMap.put(3, odpowiedzi_GEOGRAFIA);
        answersCategoryMap.put(4, odpowiedzi_POLSKA);

        HashMap answersToInputQuestionHashMap = ((HashMap<Integer,HashMap<Integer,HashMap<Integer,String>>>)answersCategoryMap.get(inputCategory)).get(inputQuestion);

        for(Object answers : answersToInputQuestionHashMap.entrySet()){
            System.out.println(answers.toString());
            TimeUnit.SECONDS.sleep(1);
        }

        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nPodaj prawidłową odpowiedź :");

        Character choice = null;
        Character inputAnswer = null;
        boolean counter = false;

        while (!counter) {
            Scanner inputUserText = new Scanner(System.in);
            try {
                choice = inputUserText.next().toLowerCase().charAt(0);
            }catch(Exception e){
            }
            switch (choice) {
                case 'a':
                    inputAnswer = 'a';
                    counter = true;
                    break;
                case 'b':
                    inputAnswer = 'b';
                    counter = true;
                    break;
                case 'c':
                    inputAnswer = 'c';
                    counter = true;
                    break;
                default: {
                    System.out.println("Niepoprawidłowy zakres, wybierz : a,b,c");
                    TimeUnit.SECONDS.sleep(2);
                    break;
                }
            }
        }

        Answers.answersCorrect(inputCategory,inputQuestion,inputAnswer);
    }
}

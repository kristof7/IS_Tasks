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

        Map<Character, String> answer_IT_1_map = new HashMap<>();
        answer_IT_1_map.put('a', "java");
        answer_IT_1_map.put('b', "c++");
        answer_IT_1_map.put('c', "ruby");

        Map<Character, String> answer_IT_2_map = new HashMap<>();
        answer_IT_2_map.put('a', "terminator");
        answer_IT_2_map.put('b', "noob");
        answer_IT_2_map.put('c', "nerd");

        Map<Character, String> answer_IT_3_map = new HashMap<>();
        answer_IT_3_map.put('a', "apple");
        answer_IT_3_map.put('b', "microsoft");
        answer_IT_3_map.put('c', "ibm");

        Map<Integer, Object> answers_IT_maps = new HashMap<>();
        answers_IT_maps.put(1, answer_IT_1_map);
        answers_IT_maps.put(2, answer_IT_2_map);
        answers_IT_maps.put(3, answer_IT_3_map);

        Map<Character, String> answer_SPORT_1_map = new HashMap<>();
        answer_SPORT_1_map.put('a', "hokej");
        answer_SPORT_1_map.put('b', "koszykówka");
        answer_SPORT_1_map.put('c', "krykiet");

        Map<Character, String> answer_SPORT_2_map = new HashMap<>();
        answer_SPORT_2_map.put('a', "9,58s");
        answer_SPORT_2_map.put('b', "9,69s");
        answer_SPORT_2_map.put('c', "9,72s");

        Map<Character, String> answer_SPORT_3_map = new HashMap<>();
        answer_SPORT_3_map.put('a', "Brazylia");
        answer_SPORT_3_map.put('b', "Polska");
        answer_SPORT_3_map.put('c', "Francja");

        Map<Integer, Object> answers_SPORT_maps = new HashMap<>();
        answers_SPORT_maps.put(1, answer_SPORT_1_map);
        answers_SPORT_maps.put(2, answer_SPORT_2_map);
        answers_SPORT_maps.put(3, answer_SPORT_3_map);

        Map<Character, String> answer_GEOGRAFIA_1_map = new HashMap<>();
        answer_GEOGRAFIA_1_map.put('a', "K2");
        answer_GEOGRAFIA_1_map.put('b', "Mount Everest");
        answer_GEOGRAFIA_1_map.put('c', "Kanczendzonga");

        Map<Character, String> answer_GEOGRAFIA_2_map = new HashMap<>();
        answer_GEOGRAFIA_2_map.put('a', "Włochy");
        answer_GEOGRAFIA_2_map.put('b', "Hiszpania");
        answer_GEOGRAFIA_2_map.put('c', "Francja");

        Map<Character, String> answer_GEOGRAFIA_3_map = new HashMap<>();
        answer_GEOGRAFIA_3_map.put('a', "Santa Maria");
        answer_GEOGRAFIA_3_map.put('b', "Pinta");
        answer_GEOGRAFIA_3_map.put('c', "Nina");

        Map<Integer, Object> answers_GEOGRAFIA_maps = new HashMap<>();
        answers_GEOGRAFIA_maps.put(1, answer_GEOGRAFIA_1_map);
        answers_GEOGRAFIA_maps.put(2, answer_GEOGRAFIA_2_map);
        answers_GEOGRAFIA_maps.put(3, answer_GEOGRAFIA_3_map);

        Map<Character, String> answer_POLSKA_1_map = new HashMap<>();
        answer_POLSKA_1_map.put('a', "odpoczywa");
        answer_POLSKA_1_map.put('b', "remontuje");
        answer_POLSKA_1_map.put('c', "pracuje");

        Map<Character, String> answer_POLSKA_2_map = new HashMap<>();
        answer_POLSKA_2_map.put('a', "piłka nożna");
        answer_POLSKA_2_map.put('b', "marudzenie");
        answer_POLSKA_2_map.put('c', "picie");

        Map<Character, String> answer_POLSKA_3_map = new HashMap<>();
        answer_POLSKA_3_map.put('a', "polo i chinosy");
        answer_POLSKA_3_map.put('b', "marynarka i jeans");
        answer_POLSKA_3_map.put('c', "koszulka na ramiaczka i skarpety do sandałów");

        Map<Integer, Object> answers_POLSKA_maps = new HashMap<>();
        answers_POLSKA_maps.put(1, answer_POLSKA_1_map);
        answers_POLSKA_maps.put(2, answer_POLSKA_2_map);
        answers_POLSKA_maps.put(3, answer_POLSKA_3_map);

        Map<Integer, Object> answersCategoryMap = new HashMap<>();
        answersCategoryMap.put(1, answers_IT_maps);
        answersCategoryMap.put(2, answers_SPORT_maps);
        answersCategoryMap.put(3, answers_GEOGRAFIA_maps);
        answersCategoryMap.put(4, answers_POLSKA_maps);

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

package infoshareacademy;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Questions {

    private static List<Integer> checkingRepetitionOfQuestions = new ArrayList<>();

    public static void Questions() throws InterruptedException {

        Map<Integer, String> question_IT_map = new LinkedHashMap<>();
        question_IT_map.put(1, "Najlepszy jezyk programowania");
        question_IT_map.put(2, "Czlowiek z IT to");
        question_IT_map.put(3, "Polka Joanna Hoffman miała nie mały wpływ na firmę");

        Map<Integer, String> question_SPORT_map = new LinkedHashMap<>();
        question_SPORT_map.put(1, "Najbardziej popularny sport na świecie to piłka nożna a drugi");
        question_SPORT_map.put(2, "Rekord Świata 100m mężczyzn na stadionie wynosi");
        question_SPORT_map.put(3, "Obecny Mistrz Świata w piłce siatkowej mężczyzn");

        Map<Integer, String> question_GEOGRAFIA_map = new LinkedHashMap<>();
        question_GEOGRAFIA_map.put(1, "Najwyzszy szczyt na świecie");
        question_GEOGRAFIA_map.put(2, "\"Żelazna Dama\" została zbudowana na wystawę światową w 1889, w którym państwie");
        question_GEOGRAFIA_map.put(3, "Flagowy statek Krzysztofa Kolumba z podróży \"Odkrycia Ameryki\"");

        Map<Integer, String> question_POLSKA_map = new LinkedHashMap<>();
        question_POLSKA_map.put(1, "Co robi prawdziwy polak podczas urlopu");
        question_POLSKA_map.put(2, "Sport narodowy polaków");
        question_POLSKA_map.put(3, "Polski szyk mody zawiera");

        Map<Integer, Object> questionsCategoryMap = new LinkedHashMap<>();
        questionsCategoryMap.put(1, question_IT_map);
        questionsCategoryMap.put(2, question_SPORT_map);
        questionsCategoryMap.put(3, question_GEOGRAFIA_map);
        questionsCategoryMap.put(4, question_POLSKA_map);

        Integer numberOfCategories = questionsCategoryMap.size();
        int i = 1;
        while (i <= 5) {
            Integer selectedCategory = ThreadLocalRandom.current().nextInt(1, numberOfCategories + 1);
            Integer numberOfQuestionsInTheCategory = ((LinkedHashMap<Integer, LinkedHashMap<Integer, String>>) questionsCategoryMap.get(selectedCategory)).size();
            Integer selectedQuestion = ThreadLocalRandom.current().nextInt(1, numberOfQuestionsInTheCategory + 1);

            Integer intSelectedCategorySelectedQuestion = Integer.parseInt(selectedCategory+""+selectedQuestion);

            boolean repetitionQuestion = checkingRepetitionOfQuestions.contains(intSelectedCategorySelectedQuestion);
            if (!repetitionQuestion) {

                checkingRepetitionOfQuestions.add(intSelectedCategorySelectedQuestion);

                switch (selectedCategory) {
                    case 1:
                        System.out.println("Kategoria pytania to : " + Category.IT);
                        break;
                    case 2:
                        System.out.println("Kategoria pytania to : " + Category.SPORT);
                        break;
                    case 3:
                        System.out.println("Kategoria pytania to : " + Category.GEOGRAFIA);
                        break;
                    case 4:
                        System.out.println("Kategoria pytania to : " + Category.POLSKA);
                        break;
                }
                TimeUnit.SECONDS.sleep(3);
                Object choiceQuestion = ((LinkedHashMap<Integer, LinkedHashMap<Integer, String>>) questionsCategoryMap.get(selectedCategory)).get(selectedQuestion);

                System.out.println(i + ". wylosowane pytanie : " + choiceQuestion);
                TimeUnit.SECONDS.sleep(3);
                System.out.println("\nProponowane odpowiedzi: ");
                TimeUnit.SECONDS.sleep(1);

                Answers.answersAll(selectedCategory, selectedQuestion);
                i++;
            }
        }
    }
}

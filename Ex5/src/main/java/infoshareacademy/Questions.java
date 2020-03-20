package infoshareacademy;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Questions {

    private static List<Integer> checkingRepetitionOfQuestions = new ArrayList<>();

    public static void Questions() throws InterruptedException {

        Map<Integer, String> pytania_IT = new LinkedHashMap<>();
        pytania_IT.put(1, "Najlepszy jezyk programowania");
        pytania_IT.put(2, "Czlowiek z IT to");
        pytania_IT.put(3, "Polka Joanna Hoffman miała nie mały wpływ na firmę");

        Map<Integer, String> pytania_SPORT = new LinkedHashMap<>();
        pytania_SPORT.put(1, "Najbardziej popularny sport na świecie to piłka nożna a drugi");
        pytania_SPORT.put(2, "Rekord Świata 100m mężczyzn na stadionie wynosi");
        pytania_SPORT.put(3, "Obecny Mistrz Świata w piłce siatkowej mężczyzn");

        Map<Integer, String> pytania_GEOGRAFIA = new LinkedHashMap<>();
        pytania_GEOGRAFIA.put(1, "Najwyzszy szczyt na świecie");
        pytania_GEOGRAFIA.put(2, "\"Żelazna Dama\" została zbudowana na wystawę światową w 1889, w którym państwie");
        pytania_GEOGRAFIA.put(3, "Flagowy statek Krzysztofa Kolumba z podróży \"Odkrycia Ameryki\"");

        Map<Integer, String> pytania_POLSKA = new LinkedHashMap<>();
        pytania_POLSKA.put(1, "Co robi prawdziwy polak podczas urlopu");
        pytania_POLSKA.put(2, "Sport narodowy polaków");
        pytania_POLSKA.put(3, "Polski szyk mody zawiera");

        Map<Integer, Object> questionsCategoryMap = new LinkedHashMap<>();
        questionsCategoryMap.put(1, pytania_IT);
        questionsCategoryMap.put(2, pytania_SPORT);
        questionsCategoryMap.put(3, pytania_GEOGRAFIA);
        questionsCategoryMap.put(4, pytania_POLSKA);

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

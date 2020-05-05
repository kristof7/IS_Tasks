package questions;

import category.CategoryName;

import java.util.*;


public class QuestionsList {

    protected static final Map<Integer, Question> questionsList = new HashMap<>();
    protected static final List<Integer> questionsFromCategory = new ArrayList<>();

    protected void addQuestionsToList() {
        questionsList.put(1, new Question("Która pętla pozwala na przechodzenie po tablicy dowolnego typu? ", new String[] {"for", "while", "do..until"}, "ab", CategoryName.PROGRAMOWANIE));
        questionsList.put(2, new Question("Ile konstruktorów zadeklarowanych przez programistę może mieć klasa? ",new String[]{"zero", "jeden", "dowolną ilość"}, "c", CategoryName.PROGRAMOWANIE));
        questionsList.put(3, new Question("Czy interfejs może implementować inny interfejs? ", new String[]{"zawsze", "nie", "tak, ale muszą one być w tym samym pakiecie"}, "b", CategoryName.PROGRAMOWANIE));
        questionsList.put(4, new Question("Który typ można przekazać jako typ generyczny? ", new String[]{"Integer", "String", "Object"}, "abc", CategoryName.PROGRAMOWANIE));
        questionsList.put(5, new Question("Które z poniższych są poprawnymi implementacjami Listy? ", new String[]{"ArrayList", "LinkedList", "SimpleList"},"ab", CategoryName.PROGRAMOWANIE));
        questionsList.put(6, new Question("Do przetrzymywania pary klucz-wartość można użyć? ", new String[]{"Set", "Map", "Properties"},"bc", CategoryName.PROGRAMOWANIE));
        questionsList.put(7, new Question("Jakie są implementacje Mapy? ", new String[]{"ArrayMap", "TreeMap", "HashMap"},"bc", CategoryName.PROGRAMOWANIE));
        questionsList.put(8, new Question("Czy faza testów jest uruchamiana przed kompilacją? ", new String[]{"tak", "nie", "nie wiem"},"b", CategoryName.PROGRAMOWANIE));
        questionsList.put(9, new Question("Inwestycje zagraniczne z reguły są niższe w tych krajach, w których: ", new String[]{"Jest tania i wykwalifikowana siła robocza", "Kiedy wynagrodzenia obciążone nadmiernymi podatkami", "Jest rozbudowana sieć dróg i autostrad"},"a", CategoryName.EKONOMIA));
        questionsList.put(10, new Question("Jaki wpływ ma inflacja na poprawę warunków życia ludzi ", new String[]{"korzystny", "niekorzystny", "nie ma wpływu"},"b", CategoryName.EKONOMIA));
        questionsList.put(11, new Question("Fundamentalnym celem Narodowego Banku Polskiego jest ", new String[]{" Dbanie o rozwój rynku pracy", "Utrzymanie stabilnego poziomu cen w kraju", "Dbanie o konkurencyjność przedsiębiorstw"},"b", CategoryName.EKONOMIA));
        questionsList.put(12, new Question("Leasing to ", new String[]{"sprzedaż wierzytelności firmom windykacyjnym", "kredyt", "umowa wynajmu dóbr przedsiębiorcom"},"c", CategoryName.EKONOMIA));
        questionsList.put(13, new Question("Tempo, w jakim rozwija się gospodarka, najczęściej określa się poprzez tempo wzrostu ", new String[]{"PKB", "płac", "cen"},"a", CategoryName.EKONOMIA));
        questionsList.put(14, new Question("Rada Polityki Pieniężnej ustala poziom stopy procentowej ", new String[]{"od kredytów", "na rachunkach oszczędnnościowych", "referencyjnej"},"c", CategoryName.EKONOMIA));
        questionsList.put(15, new Question("Do głównych cech gospodarki wolnorynkowej z pewnością nie należy ", new String[]{"konkurecja", "swoboda działolności gospodarczej", "państwowa własność środków produkcji"},"c", CategoryName.EKONOMIA));
        questionsList.put(16, new Question("Głównym celem działalności przedsiębiorstw w gospodarce rynkowej jest ", new String[]{"osiąganie zysku", " zasilanie budżetu państwa", " zwiększanie zatrudnienia"},"a", CategoryName.EKONOMIA));
        questionsList.put(17, new Question("Stolicą Francji nie jest: ", new String[]{"Paryż", "Londyn", "Oslo"},"bc", CategoryName.WIEDZA_OGÓLNA));
        questionsList.put(18, new Question("2+2 równa się? ", new String[]{"1", "3", "4"},"c", CategoryName.WIEDZA_OGÓLNA));
        questionsList.put(19, new Question("Stolicą Czech jest: ", new String[]{"Praga", "Warszawa", "Berlin"},"a", CategoryName.WIEDZA_OGÓLNA));
        questionsList.put(20, new Question("Walutą obowiązującą we Francji jest: ", new String[]{"Dolar", "Euro", "Funt", "Frank"},"b", CategoryName.WIEDZA_OGÓLNA));
        questionsList.put(21, new Question("Największym przyjacielem człowieka jest: ", new String[]{"Pies", "Kot", "Samochód"},"abc", CategoryName.WIEDZA_OGÓLNA));

    }



    protected void getQuestionsFromCategory(CategoryName categoryName){
        for (Integer key : questionsList.keySet()) {
            if (questionsList.get(key).getCategoryName().equals(categoryName)) {
                questionsFromCategory.add(key);
            }
        }
    }

    protected Integer randomInt() {
        Integer randomInt = null;
        for (Integer i : questionsFromCategory) {
            randomInt = i;
            shuffleKeysFromCategory();
        }
        questionsFromCategory.remove(randomInt);
        return randomInt;
    }

    private void shuffleKeysFromCategory() {
        Collections.shuffle(questionsFromCategory);
    }

}


package infoshareacademy;

import java.util.*;

public class QuestionBank {

    protected final static Map<Integer, Question> questionsBank = new HashMap<>();
    protected final static List<Integer> questionsKeysFromPickedCategory = new ArrayList<>();

    protected void addQuestionsToBank() {

        questionsBank.put(1, new Question("Figura która jest zbudowana z trzech par prostokątów i przeciwległe podstawy są takie same to ?", new String[]{"Sześcian", "Sześciokąt", "Romb", "Prostopadłościan", "Równoległobok"}, "d", Categories.MISZMASZ));
        questionsBank.put(2, new Question("Flinta to inna nazwa ?", new String[]{"szabli", "łuku", "kuszy", "fuzji", "armaty"}, "d", Categories.HISTORIA_WOS));
        questionsBank.put(3, new Question("Karmazyn to kolor intensywnie ?", new String[]{"żółty", "różowy", "czerwony", "niebieski", "zielony"}, "c", Categories.MISZMASZ));
        questionsBank.put(4, new Question("Okno sklepowe w którym wystawia sie różne towary to ?", new String[]{"witraż", "witryna", "witriol", "wiwarium", "wizantium"}, "b", Categories.MISZMASZ));
        questionsBank.put(5, new Question("Ile gwiazdek jest na fladze Unii Europejskiej ?", new String[]{"10", "12", "15", "18", "21"}, "b", Categories.HISTORIA_WOS));
        questionsBank.put(6, new Question("Jakiego pierwiastka jest najwięcej w powietrzu ?", new String[]{"tlenu", "azotu", "wodoru", "siarki", "dwutlenku węgla"}, "b", Categories.BIOLOGIA_CHEMIA));
        questionsBank.put(7, new Question("Czym napędzane są promy kosmiczne ?", new String[]{"gazem", "benzyną", "ropą", "gazem ziemnym", "ciekłym azotem"}, "e", Categories.BIOLOGIA_CHEMIA));
        questionsBank.put(8, new Question("Które z państw ma najmniejszą powierzchnię ?", new String[]{"Ukraina", "Finlandia", "Polska", "Włochy", "Norwegia"}, "d", Categories.GEOGRAFIA_ASTRONOMIA));
        questionsBank.put(9, new Question("Po ukończeniu ilu lat można kandydować na prezydenta ?", new String[]{"18", "21", "25", "30", "35"}, "e", Categories.HISTORIA_WOS));
        questionsBank.put(10, new Question("Ile trwa pełny obrót ziemi wokół własnej osi ?", new String[]{"24 godz", "1 rok", "12 godz", "miesiąc", "tydzień"}, "a", Categories.GEOGRAFIA_ASTRONOMIA));
        questionsBank.put(11, new Question("Jaki narząd nie należy do budowy układu oddechowego człowieka ?", new String[]{"oskrzela", "jama nosowa", "tchawica", "pęcherzyki płucne", "krtań"}, "d", Categories.BIOLOGIA_CHEMIA));
        questionsBank.put(12, new Question("Jakie powietrze nadciąga do polski z północy ?", new String[]{"polarno-morskie", "polarno-kontynentalne", "zwrotnikowo-morskie", "arktyczno-kontynentalne", "arktyczno-morskie"}, "e", Categories.GEOGRAFIA_ASTRONOMIA));
        questionsBank.put(13, new Question("Żelazo to ?", new String[]{"ciecz", "gaz", "ciało stałe", "kwas", "żaden z tych"}, "c", Categories.BIOLOGIA_CHEMIA));
        questionsBank.put(14, new Question("Co znaczy po polsku Curriculum Vitae ?", new String[]{"następne wcielenie", "bieg życia", "pełnia księżyca", "dom mieszkalny", "szkoła przetrwania"}, "b", Categories.MISZMASZ));
        questionsBank.put(15, new Question("Jakiemu państwu narzucono traktat wersalski po zakończeniu I wojny światowej ?", new String[]{"Rosji", "Polsce", "Niemcom", "Stanom Zjednoczonym", "Turcji"}, "c", Categories.HISTORIA_WOS));
        questionsBank.put(16, new Question("W którym roku człowiek pierwszy raz wylądował na książycu ?", new String[]{"1961", "1969", "1970", "1972", "1974"}, "b", Categories.HISTORIA_WOS));
        questionsBank.put(17, new Question("Jaki symbol ma krzem ?", new String[]{"P", "Cu", "K", "Si", "Kr"}, "d", Categories.BIOLOGIA_CHEMIA));
        questionsBank.put(18, new Question("Jaka jest długość granicy polski w km ?", new String[]{"3 382 km", "3 434 km", "3 495 km", "3 582 km", "4 142 km"}, "d", Categories.GEOGRAFIA_ASTRONOMIA));
        questionsBank.put(19, new Question("Z iloma państwami graniczy teraz Polska ?", new String[]{"7", "8", "9", "10", "12"}, "a", Categories.GEOGRAFIA_ASTRONOMIA));
        questionsBank.put(20, new Question("Jakie państwa wchodziły na przełomie XIX i XX wieku w skład Trójporozumienia ?", new String[]{"USA , Wielka Brytania , Polska", "Francja , Niemcy , Rosja", "Belgia , Ukraina , Rosja", "Francja , Wielka Brytania , Rosja", "Francja , USA , Polska"}, "d", Categories.HISTORIA_WOS));
        questionsBank.put(21, new Question("Ile jest gwiazd w naszym układzie słonecznym ?", new String[]{"0", "1", "2", "5", "10"}, "b", Categories.GEOGRAFIA_ASTRONOMIA));
        questionsBank.put(22, new Question("Ile jest województw w polsce ?", new String[]{"12", "16", "18", "21", "22"}, "b", Categories.HISTORIA_WOS));
        questionsBank.put(23, new Question("Zimorodek to ?", new String[]{"ssak", "ryba", "gad", "ptak", "owad"}, "d", Categories.BIOLOGIA_CHEMIA));
        questionsBank.put(24, new Question("W którym roku wybuchła I wojna Swiatowa ?", new String[]{"1913", "1914", "1915", "1916", "1917"}, "b", Categories.HISTORIA_WOS));
        questionsBank.put(25, new Question("W których z wymienionych filmów część akcji dzieje się w kosmosie?", new String[]{"Shrek", "Pierwszy Człowiek", "Klan", "Interstellar", "Apollo 13"}, "bde", Categories.MISZMASZ));
        questionsBank.put(26, new Question("Które z tych państw już nie istnieją ?", new String[]{"Luksemburg", "Persja", "Zair", "Polska", "Birma"}, "bce", Categories.HISTORIA_WOS));
        questionsBank.put(27, new Question("Które z tych zwierząt są pitofagami? ", new String[]{"Chrząszcz majowy", "Pies domowy", "Koń", "Kot", "Słoń Indyjski"}, "ace", Categories.BIOLOGIA_CHEMIA));
        questionsBank.put(28, new Question("Które z tych państw leżą w Afryce?", new String[]{"Seszele", "Nigeria", "Brazylia", "Włochy", "Mongolia"}, "ab", Categories.GEOGRAFIA_ASTRONOMIA));
    }

    protected void getQuestionsKeysFromPickedCategory(Categories category) {
        for (Integer key : questionsBank.keySet()) {
            if (questionsBank.get(key).getCategory().equals(category)) {
                questionsKeysFromPickedCategory.add(key);
            }
        }
    }

    protected Integer generateRandomIntegerFromKeyList() {
        Integer randomIntegerFromKeyList = null;
        for (Integer i : questionsKeysFromPickedCategory) {
            randomIntegerFromKeyList = i;
            shuffleKeysFromPickedCategory();
        }
        questionsKeysFromPickedCategory.remove(randomIntegerFromKeyList);
        return randomIntegerFromKeyList;
    }

    private void shuffleKeysFromPickedCategory() {
        Collections.shuffle(questionsKeysFromPickedCategory);
    }

}

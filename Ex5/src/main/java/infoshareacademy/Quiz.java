package infoshareacademy;

import java.util.*;

public class Quiz {

    private Map<Integer, String> allQuestionsMap = new HashMap<>();
    private List<Question> sportQuestionsList = new ArrayList<>();
    private List<Question> capitalCityQuestionsList = new ArrayList<>();
    private List<Question> historyQuestionsList = new ArrayList<>();

    Question question1 = new Question(1, Category.SPORT, "\nCristiano Ronaldo is a player of?\na) Real " +
            "Madrid, b) FC Barcelona, c) Juventus Turin");
    Question question2 = new Question(2, Category.SPORT, "\nWho is 2019 Formula 1 world champion?\na) " +
            "Lewis Hamilton, b) Fernando Alonso, c) Sebastian Vettel");
    Question question3 = new Question(3, Category.SPORT, "\nWhich team won polish football league in 2019?" +
            "\na) Piast Gliwice, b) Lechia Gdansk, c) Legia Warsaw");
    Question question4 = new Question(4, Category.SPORT, "\nLeo Messi is a player of?\na) FC Barcelona, " +
            "b) Atletico Madrid, c) Real Madrid");
    Question question5 = new Question(5, Category.SPORT, "\nWho is a ski jumper?\na) Kamil Stoch, " +
            "b) Robert Lewandowski, c) Robert Kubica");
    Question question6 = new Question(6, Category.SPORT, "\nWho is a footballer?\na) Kamil Grosicki, " +
            "b) Mike Tyson, c) Michael Jordan");
    Question question7 = new Question(7, Category.SPORT, "\nWho is the oqner of the world record in 100" +
            " meters run? \na) Usain Bolt, b) Anthony Joshua, c) Grzegorz Krychowiak");
    Question question8 = new Question(8, Category.SPORT, "\nThe Summer Olimpic Games in 1992 were in..." +
            "\na) Barcelona, b) Atlanta, c) Sydney");
    Question question9 = new Question(9, Category.SPORT, "\nThe NBA 2019 champion was...\na) " +
            "Toronto Raptors, b) Golden State Warriors, c) Los Angeles Lakers");
    Question question10 = new Question(10, Category.SPORT, "\nThe NHL 2019 champion was...\na) " +
            "St. Louis Blues, b) Boston Bruins, c) Pittsburg Penguins");
    Question question11 = new Question(11, Category.CAPITAL_CITY, "\nWhat city is the capital of Poland?" +
            "\na) Warsaw, b) Gdansk, c) Poznan");
    Question question12 = new Question(12, Category.CAPITAL_CITY, "\nWhat city is the capital of Russia?" +
            "\na) Moscow, b) Kazan, c) Perm");
    Question question13 = new Question(13, Category.CAPITAL_CITY, "\nWhat city is the capital of " +
            "United States?\na) Washinghton, b) New York, c) Chicago");
    Question question14 = new Question(14, Category.CAPITAL_CITY, "\nWhat city is the capital of England?" +
            "\na) London, b) Liverpool, c) Manchester");
    Question question15 = new Question(15, Category.CAPITAL_CITY, "\nWhat city is the capital of Belgium?" +
            "\na) Brussels, b) Antwerp, c) Brugge");
    Question question16 = new Question(16, Category.CAPITAL_CITY, "\nWhat city is the capital of Georgia?" +
            "\na) Tbilisi, b) Erewan, c) Kiev");
    Question question17 = new Question(17, Category.CAPITAL_CITY, "\nWhat city is the capital of Slovakia?" +
            "\na) Bratislava, b) Kosice, Prague");
    Question question18 = new Question(18, Category.CAPITAL_CITY, "\nWhat city is the capital of Germany?" +
            "\na) Berlin, b) Hamburg, c) Munich");
    Question question19 = new Question(19, Category.CAPITAL_CITY, "\nWhat city is the capital of France?" +
            "\na) Paris, b) Nice, c) Marseille");
    Question question20 = new Question(20, Category.CAPITAL_CITY, "\nWhat city is the capital of Spain?" +
            "\na) Madrid, b) Barcelona, c) Sevilla");
    Question question21 = new Question(21, Category.HISTORY, "\nThe terrorist attack on World Trade Center" +
            "was in...\na) 2001, b) 2002, c) 2011");
    Question question22 = new Question(22, Category.HISTORY, "\nThe World War I started in... " +
            "a) 1914, b) 1918, c) 1939");
    Question question23 = new Question(23, Category.HISTORY, "\nThe World War II finished in... " +
            "a) 1945, b) 1918, c) 2001");
    Question question24 = new Question(24, Category.HISTORY, "\nThe Battle of Grunwald was in..." +
            "\na) 1410, b) 1415, c) 1510");
    Question question25 = new Question(25, Category.HISTORY, "\nThe Baptism of Poland was in..." +
            "\na) 966, b) 1000, c) 1025");
    Question question26 = new Question(26, Category.HISTORY, "\nThe Discovery of America was in..." +
            "\na) 1492, b) 1525, c) 1592");
    Question question27 = new Question(27, Category.HISTORY, "\nThe November Uprising was in..." +
            "\na) 1830, b) 1840, c) 1846");
    Question question28 = new Question(28, Category.HISTORY, "\nThe Crusaders were brought to Poland by " +
            "Konrad Mazowiecki in...\na) 1226, b) 1227, c) 1410");
    Question question29 = new Question(29, Category.HISTORY, "\n Adolf Hitler was \na) German, b) Polish, " +
            "c) Russian");
    Question question30 = new Question(30, Category.HISTORY, "\n Napoleon Bonaparte was \na) French, " +
            "b) German, c) Italian");

    public void putAllQuestionsIntoMap() {

        Question[] questions = {question1, question2, question3, question4, question5, question6, question7, question8,
        question9, question10, question11, question12, question13, question14, question15, question16, question17,
        question18, question19, question20, question21, question22, question23, question24, question25, question26,
        question27, question28, question29, question30};

        for (Question question: questions) {
            allQuestionsMap.put(question.getId(), question.getQuestion());
        }
    }

    public void getRandomQuestionsFromListOfMapValues() {

        List<String> allQuestionsMapValuesList = new ArrayList<>(allQuestionsMap.values());

        int randomIndex = new Random().nextInt(allQuestionsMapValuesList.size());
        String randomQuestion = allQuestionsMapValuesList.get(randomIndex);
        System.out.println(randomQuestion);

    }

    public void addSportQuestionsToList() {

        Question[] sportQuestions = {question1, question2, question3, question4, question5, question6, question7,
        question8, question9, question10};
        sportQuestionsList.addAll(Arrays.asList(sportQuestions));

    }

    public void getRandomSportQuestions() {
        Collections.shuffle(sportQuestionsList);
        System.out.println("Category " + sportQuestionsList.get(0));
    }

    public void addCapitalCityQuestions() {

        Question[] capitalCitiesQuestions = {question11, question12, question13, question14, question15, question16,
        question17, question18, question19, question20};
        capitalCityQuestionsList.addAll(Arrays.asList(capitalCitiesQuestions));

    }

    public void getRandomCapitalCityQuestions() {
        Collections.shuffle(capitalCityQuestionsList);
        System.out.println("Category " + capitalCityQuestionsList.get(0));
    }

    public void addHistoryQuestion() {

        Question[] historyQuestions = {question21, question22, question23, question24, question25, question26,
        question27, question28, question29, question30};
        historyQuestionsList.addAll(Arrays.asList(historyQuestions));
    }

    public void getRandomHistoryQuestions() {
        Collections.shuffle(historyQuestionsList);
        System.out.println("Category " + historyQuestionsList.get(0));
    }
}

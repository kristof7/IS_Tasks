package main.java.infoshareacademy;

import java.util.*;

public class QuizCreator {
    private int[] usedQuestionNumbers = new int[3];

    public void creatingQuestionsAndAnswers(String csvFile) {
        ReaderCSV readerCSV = new ReaderCSV();
        int numberOfQuestions = readerCSV.readCSV(csvFile).size();
        Questions questions = new Questions();
        Answers answers = new Answers();
        for (int i = 0; i < numberOfQuestions; i++) {
            questions.addQuestion((readerCSV.readCSV(csvFile).get(i)));
            answers.addAnswer(readerCSV.readCSV(csvFile).get(i));
        }
        usedQuestions(questions);
        for (int i = 0; i <3 ; i++) {
            Menu.writeQuestion(questions, usedQuestionNumbers[i]);
            Menu.writeAnswers(shuffleAnswers(creatingAnswers(answers, usedQuestionNumbers[i])), usedQuestionNumbers[i]);
            Menu.checkAnswer(answers, (shuffleAnswers(creatingAnswers(answers, usedQuestionNumbers[i]))), usedQuestionNumbers[i]);
        }
        Menu.showPoints();
    }

    public void usedQuestions(Questions questions) {
        int range = questions.getQuestions().size();
        Random random = new Random();
        HashSet<Integer> threeRandomNumberInRangeSet = new HashSet<>();
        while(threeRandomNumberInRangeSet.size() < 3) {
            int number = random.nextInt(range);
            threeRandomNumberInRangeSet.add(number);
        }
        int i = 0;
        for (Integer integer : threeRandomNumberInRangeSet) usedQuestionNumbers[i++] = integer;
    }

    public HashSet<String> creatingAnswers(Answers answers, int number) {
        HashSet<String> answersSet = new HashSet();
        answersSet.add(answers.getAnswers().get(number).getCorrectAnswer());
        for (int i = 0; i < answers.getAnswers().get(number).getFalseAnswers().length; i++) {
            answersSet.add(answers.getAnswers().get(number).getFalseAnswers()[i]);
        }
        return answersSet;
    }

    public Map<Character, String> shuffleAnswers(HashSet<String> allAnswers) {
        char elementOfList = 'a';
        Map<Character, String> answersMap = new HashMap<>();
        for (String answer:
             allAnswers) {
            answersMap.put(elementOfList, answer);
            elementOfList++;
        }
        return answersMap;
    }
}

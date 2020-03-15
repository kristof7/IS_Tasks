package infoshareacademy.answers;

import java.util.HashMap;
import java.util.Map;

public class Answers {

    private Map<String, Answer> answersForQuestion = new HashMap<>();
    private Map<String, Answer> correctAnswersForQuestion = new HashMap<>();
    private String[] answerOptions = {"A", "B", "C", "D", "E"};

    public Map<String, Answer> getAnswersForQuestion() {
        return answersForQuestion;
    }

    public void setCorrectAnswersForQuestion(Answer... answers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].isStatus()) {
                this.correctAnswersForQuestion.put(this.answerOptions[i], answers[i]);
            }
        }
    }

    public Map<String, Answer> getCorrectAnswersForQuestion() {
        return correctAnswersForQuestion;
    }
}

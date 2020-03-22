package main.java.infoshareacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answers {
    private List<Answer> answersList = new ArrayList<>();

    public List<Answer> getAnswers() {
        return this.answersList;
    }

    public void addAnswer(String[] rows) {
        String[] falseAnswers = Arrays.copyOfRange(rows, 2, rows.length);
        answersList.add(new Answer(
                //Integer.getInteger(rows[0]),
                rows[2],
                falseAnswers
        ));
    }
}

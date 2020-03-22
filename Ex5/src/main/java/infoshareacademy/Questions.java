package main.java.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    private List<Question> questionsList = new ArrayList<>();

    public List<Question> getQuestions() {
        return this.questionsList;
    }

    public void addQuestion(String[] rows) {
        questionsList.add(new Question(
                //Integer.parseInt(rows[0]),
                rows[1]
        ));
    }
}

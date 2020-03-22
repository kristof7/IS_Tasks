package main.java.infoshareacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questions {
    private List<Question> questionsList = new ArrayList<>();

    public List<Question> getQuestions() {
        return this.questionsList;
    }

    //public void addQuestion(Question... questions) { this.questionsList.add(Arrays.asList(questions)); }

//    public void addQuestion(Question question) {
//        this.questionsList.add(Arrays.add(question));
//    }

    public void addQuestion(String[] rows) {
        questionsList.add(new Question(
                1,
                //Integer.getInteger(rows[0]),
                rows[1]
        ));
    }

//    public void createQuestion(String[] rows) {
//        this.question = new Question(
//                Integer.getInteger(rows[0]),
//                rows[1]
//        );
//    }
}

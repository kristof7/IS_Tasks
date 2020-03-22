package main.java.infoshareacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Answers {
    private List<Answer> answersList = new ArrayList<>();

    public List<Answer> getAnswers() {
        return this.answersList;
    }

    //public void addAnswer(Answer... answers) {
     //   this.answersList.addAll(Arrays.asList(answers));
    //}

//    public void addAnswer(String[] rows) {
//        answersLis.add(new Question(
//                Integer.getInteger(rows[0]),
//                rows[1]
//        ));
//    }

    public void addAnswer(String[] rows) {
        String[] falseAnswers = Arrays.copyOfRange(rows, 2, rows.length);
        answersList.add(new Answer(
                1,
                //Integer.getInteger(rows[0]),
                rows[2],
                falseAnswers,
                UUID.randomUUID()
        ));
    }
}

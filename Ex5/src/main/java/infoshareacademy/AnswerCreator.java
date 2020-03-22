package main.java.infoshareacademy;

import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;
import java.util.UUID;

public class AnswerCreator {
    private Answer answer;

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public void createAnswer(String[] rows) {
        String[] falseAnswers = Arrays.copyOfRange(rows, 2, rows.length);
        this.answer = new Answer(
                Integer.getInteger(rows[0]),
                rows[2],
                falseAnswers,
                UUID.randomUUID()
        );
    }
}

package infoshareacademy.gamers;

import infoshareacademy.questions.Question;

import java.util.ArrayList;
import java.util.List;

public class Gamer {

    private int notes;
    private List<Question> withWrongAnswers = new ArrayList<>();

    public List<Question> getWithWrongAnswers() {
        return withWrongAnswers;
    }

    public void addQuestionsWithWrongAnswers(Question question) {
        this.withWrongAnswers.add(question);
    }

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }
}

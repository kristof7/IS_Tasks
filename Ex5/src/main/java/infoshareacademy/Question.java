package infoshareacademy;

import java.util.LinkedHashSet;
import java.util.Set;

public class Question {

    private String content;
    private Set<String> answers = new LinkedHashSet<>();
    private String correctAnswer;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<String> getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}

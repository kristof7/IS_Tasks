package infoshareacademy.quiz;

import java.util.List;

public class Question {

    private String questionText;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private List<String> trueAnswer;
    private Category category;


    public Question() {
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public List<String> getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(List<String> trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return questionText + "\n" +
                answer1 + "\n" +
                answer2 + "\n" +
                answer3 + "\n" +
                answer4 + "\n";
    }
}

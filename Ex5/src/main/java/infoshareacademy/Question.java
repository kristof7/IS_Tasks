package infoshareacademy;

public class Question {

    private String questionText;
    private String[] answers;
    private String correct;
    private Categories category;

    public Question(String questionText, String[] answers, String correct, Categories category) {
        this.questionText = questionText;
        this.answers = answers;
        this.correct = correct;
        this.category = category;
    }

    public Question() {
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrect() {
        return correct;
    }

    public Categories getCategory() {
        return category;
    }
}
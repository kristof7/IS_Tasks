package infoshareacademy;

public class Question {

    private String questionBody;
    private String correctAnswer;
    private String category;

    public Question(Enum Category, String questionBody, String correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.questionBody = questionBody;
        this.category = Category.toString();
    }

    public String getCategory() {
        return category;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getQuestionBody() {
        return questionBody;
    }

}
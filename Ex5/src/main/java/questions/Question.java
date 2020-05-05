package questions;

import category.CategoryName;

public class Question {

    private final String question;
    private final String [] answers;
    private final String correctAnswer;
    private final CategoryName categoryName;

    public Question(String question, String[] answers, String correctAnswer, CategoryName categoryName) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.categoryName = categoryName;
    }

    public CategoryName getCategoryName() {
        return categoryName;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

}

package infoshareacademy;

public class Question {
    Category category;
    String questionText;
    String answerAText;
    String answerBText;
    String answerCText;
    String correctAnswer;

    public Question (Category category, String questionText, String answerAText, String answerBText, String answerCText, String correctAnswer) {
        this.category = category;
        this.questionText = questionText;
        this.answerAText = answerAText;
        this.answerBText = answerBText;
        this.answerCText = answerCText;
        this.correctAnswer = correctAnswer;
    }

    public void printQuestion() {
        System.out.println("Kategoria: " + category.getCategoryDescription());
        System.out.println(questionText);
        System.out.println("A. " + answerAText);
        System.out.println("B. " + answerBText);
        System.out.println("C. " + answerCText);
    }

    public boolean isCorrectAnswer (String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}

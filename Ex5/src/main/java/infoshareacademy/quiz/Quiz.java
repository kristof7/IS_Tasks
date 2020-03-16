package infoshareacademy.quiz;

import infoshareacademy.categories.CategoriesPrinter;
import infoshareacademy.gamers.Gamer;
import infoshareacademy.fileOperations.JsonReader;
import infoshareacademy.questions.QuestionsPrinter;
import infoshareacademy.userInputDownloader.UserInput;
import infoshareacademy.categories.Categories;
import infoshareacademy.categories.Category;
import infoshareacademy.questions.Question;

public class Quiz {

    private Gamer gamer = new Gamer();
    private Category category;
    private Categories categories = JsonReader.create(new Categories(), "questions.json");

    public void play() {
        CategoriesPrinter.printCategories(categories);
        this.category = this.categories.chooseOneCategory();
        this.category.randomQuestions();
        setGamerAnswersForQuestion();
        ScoresPrinter.print(this.gamer.getNotes());
        QuestionsPrinter.printMistakeQuestionsWithCorrectAnswers(this.gamer);
        QuizService.playAgain();
    }

    private void setGamerAnswersForQuestion() {
        int notes = 0;
        for (Question question : this.category.getChoosenQuestions()) {
            QuestionsPrinter.printQuestion(question);
            int count = getNumberOfCorrectAnswersForQuestion(question);
            if (count == question.getAnswers().getCorrectAnswersForQuestion().size()) {
                notes++;
                continue;
            }
            this.gamer.addQuestionsWithWrongAnswers(question);
        }
        this.gamer.setNotes(notes);
    }

    private int getNumberOfCorrectAnswersForQuestion(Question question) {
        System.out.println("Please enter correct answers, every answer divide by /");
        String[] choices = UserInput.uploadString().split("/");
        int count = 0;
        for (String choice : choices) {
            if (question.getAnswers().getCorrectAnswersForQuestion().containsKey(choice)) {
                count++;
            }
        }

        return count;
    }
}

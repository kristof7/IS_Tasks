package infoshareacademy.quiz;

import infoshareacademy.gamers.Gamer;
import infoshareacademy.fileOperations.JsonReader;
import infoshareacademy.userInputDownloader.UserInput;
import infoshareacademy.categories.Categories;
import infoshareacademy.categories.Category;
import infoshareacademy.questions.Question;

public class Quiz {

    private Gamer gamer = new Gamer();
    private Category category;
    private Categories categories = JsonReader.create(new Categories(), "questions.json");


    public void play() {
        this.categories.printCategories();
        this.category = this.categories.chooseOneCategory();
        System.out.println("\n");
        this.category.randomQuestions();
        setGamerAnswersForQuestion();
        printGameScore();
        printGamerWrongQuestionWithCorrectAnswers();
        QuizService.playAgain();
    }

    private void setGamerAnswersForQuestion() {
        int notes = 0;
        for (Question question : this.category.getChoosenQuestions()) {
            question.printQuestion();
            int count = getNumberOfGoodAnswers(question);
            if (count == question.getAnswers().getCorrectAnswersForQuestion().size()) {
                notes++;
                continue;
            }
            this.gamer.addQuestionsWithWrongAnswers(question);
        }
        this.gamer.setNotes(notes);
    }

    private int getNumberOfGoodAnswers(Question question) {
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

    private void printGameScore() {
        if (this.gamer.getNotes() > 0) {
            System.out.println("****************************************");
            System.out.println("Congrats you have earn: " + gamer.getNotes());
            System.out.println("****************************************");
            return;
        }
        System.out.println("****************************************");
        System.out.println("Sorry you have no correct answer");
        System.out.println("****************************************");
    }

    private void printGamerWrongQuestionWithCorrectAnswers() {
        System.out.println("****************************************");
        System.out.println("Wrong answers for Question");
        System.out.println("****************************************");

        for (Question question : this.gamer.getWithWrongAnswers()) {
            System.out.println(question.getContent());
            System.out.println("Correct answers:");
            question.getAnswers().getCorrectAnswersForQuestion().forEach((key, value) -> System.out.println(key + " : " + value));

        }
    }
}

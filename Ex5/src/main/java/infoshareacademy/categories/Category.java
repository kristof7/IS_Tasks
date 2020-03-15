package infoshareacademy.categories;

import infoshareacademy.questions.Question;
import infoshareacademy.questions.Questions;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Category {

     private CategoryName categoryNames;
     private Questions questions;
     public static final int NUMBER_OF_RANDOM_QUESTIONS = 3;
     private Set<Question> choosenQuestions = new HashSet<>();

    public Set<Question> getChoosenQuestions() {
        return choosenQuestions;
    }

    public Set<Question> randomQuestions() {
        while (choosenQuestions.size() < NUMBER_OF_RANDOM_QUESTIONS) {
            int rand = ThreadLocalRandom.current().nextInt(0, this.questions.getQuestionList().size());
            choosenQuestions.add(this.questions.getQuestionList().get(rand));
        }
        return choosenQuestions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public CategoryName getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(CategoryName categoryNames) {
        this.categoryNames = categoryNames;
    }
}

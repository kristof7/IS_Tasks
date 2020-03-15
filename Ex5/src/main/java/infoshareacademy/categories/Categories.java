package infoshareacademy.categories;

import infoshareacademy.userInputDownloader.UserInput;

import java.util.ArrayList;
import java.util.List;

public class Categories {

    private List<Category> categoriesList = new ArrayList<>();

    public Category chooseOneCategory() {
        System.out.println("Enter number between " + 1 + " - " + this.categoriesList.size());
        int userChoice = UserInput.uploadCorrectUserInput(this.categoriesList.size());

        return getConcreteCategory(userChoice);
    }

    public Category getConcreteCategory(int index) {
        Category category = new Category();
        for (int i = 0; i < this.categoriesList.size(); i++) {
            if (i == index - 1) {
                System.out.println(this.categoriesList.get(i).getCategoryNames());
                category =  this.categoriesList.get(i);
            }
        }
        return category;
    }

    public void printCategories() {
        System.out.println("Please choose category");
        for (int i = 0; i < this.categoriesList.size(); i++) {
            System.out.println(i + 1 + ". " + this.categoriesList.get(i).getCategoryNames());
        }
    }

    @Override
    public String toString() {
        return "Categories{" +
                "categoriesList=" + categoriesList +
                '}';
    }
}

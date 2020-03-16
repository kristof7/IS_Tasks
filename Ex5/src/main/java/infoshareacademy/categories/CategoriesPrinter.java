package infoshareacademy.categories;

public class CategoriesPrinter {

    public static void printCategories(Categories categories) {
        System.out.println("Please choose category");
        for (int i = 0; i < categories.getCategoriesList().size(); i++) {
            System.out.println(i + 1 + ". " + categories.getCategoriesList().get(i).getCategoryNames());
        }
    }
}

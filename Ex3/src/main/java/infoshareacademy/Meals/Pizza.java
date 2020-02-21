package infoshareacademy.Meals;

public class Pizza extends Meal {
    PizzaSize pizzaSize;
    String pizzaName;

    public Pizza(PizzaSize pizzaSize, String pizzaName, double mealPrice) {
        this.pizzaSize = pizzaSize;
        this.pizzaName = pizzaName;
        this.mealPrice = mealPrice;
        this.mealName = "PIZZA";
    }

    @Override
    public void printMealDetails() {
        System.out.println(mealName + " - " + pizzaSize + ", " + pizzaName + ", price: " + mealPrice);
    }

}

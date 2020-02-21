package infoshareacademy.Meals;

public class Burger extends Meal {
    BurgerType burgerType;

    public Burger(BurgerType burgerType, double mealPrice) {
        this.burgerType = burgerType;
        this.mealPrice = mealPrice;
        this.mealName = "BURGER";
    }

    @Override
    public void printMealDetails() {
        System.out.println(mealName + " - " + burgerType + ", price: " + mealPrice);
    }
}

package infoshareacademy.foodDetails;

public abstract class Food  {

    protected FoodType foodType;
    protected PizzaSize pizzaSize;

    protected Food(FoodType foodType, PizzaSize pizzaSize) {
        this.foodType = foodType;
        this.pizzaSize = pizzaSize;
    }

}

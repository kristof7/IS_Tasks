package infoshareacademy.menu;

public class Pizza extends Meal {
    private PizzaType pizzaType;
    private PizzaSize pizzaSize;

    public Pizza(float timeOfPreparing, float price, PizzaType pizzaType, PizzaSize pizzaSize) {
        super(timeOfPreparing, price);
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
    }

    public float getPrice() {
        return price;
    }

    public float getMass() {
        return pizzaSize.getMass();
    }

    @Override
    public String toString() {
        return pizzaSize.toString() + " " + pizzaType.toString();
    }
}

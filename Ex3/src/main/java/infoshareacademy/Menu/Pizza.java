package infoshareacademy.Menu;

public class Pizza extends Product {
    private PizzaType pizzaType;
    private PizzaSize pizzaSize;

    public Pizza(PizzaType pizzaType, PizzaSize pizzaSize) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
    }
}

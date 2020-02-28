package infoshareacademy.Menu;

public class Pizza extends Product {
    private PizzaType pizzaType;
    private PizzaSize pizzaSize;

    public Pizza(PizzaType pizzaType, PizzaSize pizzaSize) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    @Override
    public String toJson() {
        return null;
    }
}

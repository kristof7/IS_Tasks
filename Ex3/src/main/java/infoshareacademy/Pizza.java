package infoshareacademy;

public class Pizza extends Food {

    private PizzaSize size;

    private PizzaType type;

    public Pizza(int amount, PizzaSize size, PizzaType type) {
        super(amount, OrderType.PIZZA);
        this.size = size;
        this.type = type;
    }

    @Override
    public double calculatePrice() {
        return Calculator.round(size.getMultiply() * type.getPrice() * getAmount(), 1);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", type=" + type +
                ",pizzas amount=" + getAmount() +
                ", price=" + calculatePrice() +
                '}';
    }
}

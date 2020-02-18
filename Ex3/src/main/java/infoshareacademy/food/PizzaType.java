package infoshareacademy.food;

public enum PizzaType {
    PEPPERONI(22),

    CAPRICOSA(23.50),

    HAWAII(25.60),

    DIABLO(27.80),

    PROSCIUTTO(26.10);

    private double price;

    PizzaType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

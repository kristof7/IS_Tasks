package infoshareacademy.food;

public enum PizzaSize {
    SMALL(1.0),

    MEDIUM(1.1),

    LARGE(1.2);

    private double multiply;

    PizzaSize(double multiply) {
        this.multiply = multiply;
    }

    public double getMultiply() {
        return multiply;
    }
}

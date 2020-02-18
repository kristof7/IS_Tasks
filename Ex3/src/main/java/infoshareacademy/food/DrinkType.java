package infoshareacademy.food;

public enum DrinkType {
    WATER(4.5),

    COLA(6.90),

    ORANGE_JUICE(5.5),

    BEER(10.90);

    private double price;

    DrinkType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

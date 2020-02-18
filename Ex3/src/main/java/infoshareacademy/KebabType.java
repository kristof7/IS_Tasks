package infoshareacademy;

public enum KebabType {

    HAMBURGER(15.50),

    KEBAB(19.90),

    HOT_DOG(14.90);

    private double price;

    KebabType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

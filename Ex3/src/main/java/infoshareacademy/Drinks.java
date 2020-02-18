package infoshareacademy;

public class Drinks extends Food {

    DrinkType drinkType;

    public Drinks(int amount, DrinkType drinkType) {
        super(amount, OrderType.BEER);
        this.drinkType = drinkType;
    }

    @Override
    public double calculatePrice() {
        return drinkType.getPrice() * this.getAmount();
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkType=" + drinkType +
                ", drinks amount=" + getAmount() +
                ", price=" + calculatePrice() +
                '}';
    }
}

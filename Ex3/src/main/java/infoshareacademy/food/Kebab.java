package infoshareacademy.food;

import infoshareacademy.orders.OrderType;

public class Kebab extends Food {
    private KebabType type;

    public Kebab(int amount, KebabType type) {
        super(amount, OrderType.KEBAB);
        this.type = type;
    }

    @Override
    public double calculatePrice() {
        return type.getPrice() * getAmount();
    }

    @Override
    public String toString() {
        return "Kebab{" +
                "type=" + type +
                ",kebab amount=" + getAmount() +
                ", price=" + calculatePrice() +
                ",order type: " + getOrderType()+
                '}';
    }
}

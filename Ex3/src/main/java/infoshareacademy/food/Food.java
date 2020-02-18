package infoshareacademy.food;

import infoshareacademy.orders.OrderType;

public abstract class Food {
    private OrderType orderType;

    private int amount;

    public Food(int amount, OrderType orderType) {
        this.amount = amount;
        this.orderType = orderType;
    }

    public abstract double calculatePrice();

    public OrderType getOrderType() {
        return orderType;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Food{" +
                "orderType=" + orderType +
                '}';
    }
}

package infoshareacademy;

public abstract class Food {

    public abstract double calculatePrice();

    private OrderType orderType;

    private int amount;

    public Food(int amount, OrderType orderType) {
        this.amount = amount;
        this.orderType = orderType;
    }

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

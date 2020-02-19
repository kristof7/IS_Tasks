package infoshareacademy.food;

import infoshareacademy.calculator.Calculator;
import infoshareacademy.orders.OrderType;

public class Drinks extends Food {
    DrinkType drinkType;

    public Drinks(int amount, DrinkType drinkType) {
        super(amount, OrderType.DRINKS);
        this.drinkType = drinkType;
    }

    @Override
    public double calculatePrice() {
        return Calculator.round(drinkType.getPrice() * this.getAmount(),1);
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkType=" + drinkType +
                ", drinks amount=" + getAmount() +
                ", price=" + calculatePrice() +
                ",order type: " + getOrderType()+
                '}';
    }
}

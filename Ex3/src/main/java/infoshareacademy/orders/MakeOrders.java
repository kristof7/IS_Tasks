package infoshareacademy.orders;

import infoshareacademy.pizza.Pizza;
import infoshareacademy.pizza.PizzaSize;
import infoshareacademy.pizza.PizzaType;

public class MakeOrders implements OrderMustHave {


    @Override
    public void whatToEat() {
        Pizza pizza = new Pizza(PizzaSize.BIG, PizzaType.MARGHERITA,1);

    }

    @Override
    public void whatToDrink() {

    }
}

package infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class Order extends Customer {

    List orderList = new ArrayList();

    @Override
    public void setOrder(TypeOfFood typeOfFood, Integer amountOfFoods ) {
        orderList.add(typeOfFood+ " ilość: "+amountOfFoods);
    }

    @Override
    public void setOrder(TypeOfFood typeOfFood, PizzaType pizzaType, PizzaSize pizzaSize, Integer amountOfFoods ) {
        orderList.add(typeOfFood+" "+pizzaType+" "+pizzaSize+" ilość: "+amountOfFoods);
    }

    @Override
    public void getOrder() {
        System.out.println(orderList);
        System.out.println();
    }
}
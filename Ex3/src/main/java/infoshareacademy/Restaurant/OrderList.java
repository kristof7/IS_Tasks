package infoshareacademy.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class OrderList {

    List<Order> listOfOrders = new ArrayList<>();

    public void addOrder (Order order){
        listOfOrders.add(order);
    }

}

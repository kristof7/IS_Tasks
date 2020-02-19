package infoshareacademy.orders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Orders {
    private List<Order> ordersList = new ArrayList<>();

    public Orders(Order... orders) {
        ordersList = Arrays.asList(orders);
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }

    public void add(Order...orders){
        for (Order order: orders) {
            this.ordersList.add(order);
        }
    }

    public void printOrders() {
        for (Order order : this.ordersList) {
            System.out.println(order);
        }
    }

}

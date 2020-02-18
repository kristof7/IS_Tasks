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
}

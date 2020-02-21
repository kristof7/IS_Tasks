package infoshareacademy;

import java.util.List;

public class Order {

    private Client client;
    private List<Object> meal;

    public Order(Client client, List<Object> meal) {
        this.client = client;
        this.meal = meal;
    }

    public String toOrder(int orderNumber) {
        return orderNumber + " order: " + client + ".";
    }
}

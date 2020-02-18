package infoshareacademy;

import java.util.ArrayList;
import java.util.Map;

public class Order {

    private Client client;

    private Foods foods;

    private OrderType orderType;

    public Order(Client client, Foods foods) {
        this.client = client;
        this.foods = foods;
    }

    public void specifyOrderType() {
        Map<OrderType, ArrayList<Food>> foodsMap = foods.getFoodsMap();

        if (foodsMap.containsKey(OrderType.PIZZA) && foodsMap.containsKey(OrderType.KEBAB) && foodsMap.containsKey(OrderType.BEER))
            this.orderType = OrderType.PIZZA_KEBAB_BEER;
        if (foodsMap.containsKey(OrderType.PIZZA)) this.orderType = OrderType.PIZZA;
        if (foodsMap.containsKey(OrderType.KEBAB)) this.orderType = OrderType.KEBAB;
        if (foodsMap.containsKey(OrderType.BEER)) this.orderType = OrderType.BEER;
        if (foodsMap.containsKey(OrderType.PIZZA) && foodsMap.containsKey(OrderType.KEBAB))
            this.orderType = OrderType.PIZZA_KEBAB;
        if (foodsMap.containsKey(OrderType.KEBAB) && foodsMap.containsKey(OrderType.BEER))
            this.orderType = OrderType.KEBAB_BEER;
        if (foodsMap.containsKey(OrderType.PIZZA) && foodsMap.containsKey(OrderType.BEER))
            this.orderType = OrderType.PIZZA_BEER;

    }

    public Client getClient() {
        return client;
    }

    public Foods getFoods() {
        return foods;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", foods=" + foods +
                ", orderType=" + orderType +
                '}';
    }
}

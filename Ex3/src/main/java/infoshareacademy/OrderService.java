package infoshareacademy;

public class OrderService {

    Order order;

    public void createOrder(Foods foods, Client client) {
        this.order = new Order(client, foods);
        order.specifyOrderType();
    }

    public double calculateTotalCost(Foods foods) {
        double totalCost = 0.0;
        for (Food food : foods.getAllFoods()) {
            totalCost += food.calculatePrice();
        }

        return Calculator.round(totalCost, 1);
    }

    public void printOrder() {
        System.out.println(this.order);
    }


}

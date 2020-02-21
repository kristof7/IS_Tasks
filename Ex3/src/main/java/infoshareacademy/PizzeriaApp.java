package infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class PizzeriaApp {
    public static void main(String[] args) {

        Client client1 = new Client("Adam", "Pogodna 13", "tel. 987 654 321");
        Client client2 = new Client("Anna", "ul. Długa 18/3", "tel. 654 321 987");
        Client client3 = new Client("Paweł", "ul. Grunwaldzka 472", "tel. 321 654 987");

        Order order1 = new Order();
        order1.setClient(client1);
        String orderOne = "ORDER 1: " + order1.getClient().getClientDetails() + ", " + order1.getPizza().addMeal
        (Meal.Size.LARGE, Meal.Type.PEPPERONI) + ", " + order1.getBeverage().addBeverage("JUICE", "TWO");


        Order order2 = new Order();
        order2.setClient(client2);
        String orderTwo = "ORDER 2: " + order2.getClient().getClientDetails() + ", " + order2.getPizza().addMeal
        (Meal.Size.SMALL, Meal.Type.HAWAJSKA) + ", " + order2.getPizza().addMeal(Meal.Size.MEDIUM, Meal.Type.CAPRICIOSA) +
        ", " + order2.getBeverage().addBeverage("COKE", "ONE");


        Order order3 = new Order();
        order3.setClient(client3);
        String orderThree = "ORDER 3: " + order3.getClient().getClientDetails() + ", " + order3.getHamburger().addHamburger
        ("CLASSIC HAMBURGER") + ", " + order3.getBeverage().addBeverage("BEER", "ONE");

        List<String> orderList = new ArrayList<>();
        orderList.add(orderOne);
        orderList.add(orderTwo);
        orderList.add(orderThree);

        System.out.println(orderList.get(0));
        System.out.println(orderList.get(1));
        System.out.println(orderList.get(2));

    }
}
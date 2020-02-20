package infoshareacademy;

import infoshareacademy.aboutClient.Adress;
import infoshareacademy.aboutClient.Client;
import infoshareacademy.orders.Order;
import infoshareacademy.products.*;

public class PizzeriaApp {
    public static void main(String[] args) {

        Client client1 = new Client("Adam", "Pogodna 13", "Gdansk", "500-500-500");
        Pizza pizza1 = new Pizza(1, TypeOfProduct.PIZZA, SizeOfPizza.LARGE, TypeOfPizza.PEPPERONI);
        Drinks drinks1 = new Drinks(2, TypeOfProduct.DRINKS, TypeOfDrinks.APPLE_JUICE);

        Order order1 = new Order(client1, pizza1, drinks1);

        order1.printOrder();

        System.out.println("\n \n \n");

        Client client2 = new Client("Anna", "Długa 18/3", "Gdansk", "758-555-888");
        Pizza pizza2 = new Pizza(1, TypeOfProduct.PIZZA, SizeOfPizza.SMALL, TypeOfPizza.HAWAII);
        Pizza pizza3 = new Pizza(1, TypeOfProduct.PIZZA, SizeOfPizza.MEDIUM, TypeOfPizza.CAPRICCIOSA);
        Drinks drinks2 = new Drinks(2, TypeOfProduct.DRINKS, TypeOfDrinks.COLA);

        Order order2 = new Order(client2, pizza2, pizza3, drinks2);

        order2.printOrder();

        System.out.println("\n \n \n");

        Client client3 = new Client("Paweł", "Grunwaldzka 472b", "Gdansk", "858-525-636");
        Burger burger1 = new Burger(1, TypeOfProduct.BURGER, TypeOfBurger.HAMBURGER);
        Drinks drinks3 = new Drinks(1, TypeOfProduct.DRINKS, TypeOfDrinks.BEER);

        Order order3 = new Order(client3, burger1, drinks3);

        order3.printOrder();








    }
}
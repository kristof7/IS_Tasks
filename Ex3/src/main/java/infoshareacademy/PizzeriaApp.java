package infoshareacademy;

import infoshareacademy.clientsData.Address;
import infoshareacademy.clientsData.Client;
import infoshareacademy.food.*;
import infoshareacademy.orders.OrderService;

public class PizzeriaApp {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        Foods foods = new Foods(new Pizza(1, PizzaSize.LARGE, PizzaType.PEPPERONI),
                new Drinks(2, DrinkType.ORANGE_JUICE));
        orderService.createOrder(foods,
                new Client("Adam", new Address("Pogodna", "Gdańsk"), "7406938694"));
        orderService.printOrder();
        System.out.println("Total cost " + orderService.calculateTotalCost(foods)+ "\n\n");

        OrderService orderService1 = new OrderService();
        Foods foods1 = new Foods(new Pizza(1, PizzaSize.SMALL, PizzaType.HAWAII), new Pizza(1, PizzaSize.MEDIUM, PizzaType.CAPRICOSA),
                new Drinks(1, DrinkType.COLA));
        orderService1.createOrder(foods1,
                new Client("Anna", new Address("Długa 18", "Gdańsk"), "74069390994"));
        orderService1.printOrder();
        System.out.println("Total cost " + orderService1.calculateTotalCost(foods1) + "\n\n");

        OrderService orderService2 = new OrderService();
        Foods foods2 = new Foods(new Kebab(1, KebabType.HAMBURGER),
                new Drinks(1, DrinkType.BEER));
        orderService2.createOrder(foods2,
                new Client("Paweł", new Address("Grunwaldzka", "Gdańsk"), "2339938694"));
        orderService2.printOrder();
        System.out.println("Total cost " + orderService2.calculateTotalCost(foods2) + "\n\n");
    }
}
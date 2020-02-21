package infoshareacademy;

import infoshareacademy.service.Client;
import infoshareacademy.service.Order;
import infoshareacademy.menu.*;
import infoshareacademy.service.Service;

public class PizzeriaApp {
    public static void main(String[] args) {
        System.out.println("Pizzeria App :-)");
        /*
    Dzwoni klient: Adam z ulicy Pogodnej 13 i zamawia dużą pizzę Pepperoni oraz 2 opakowania soku.
    Dzwoni kolejny klient: Anna z ulicy Długiej 18/3 i zamawia małą pizzę Hawajską, średnią Capricciosę oraz colę.
    Dzwoni kolejny klient: Paweł z ulicy Grunwaldzkiej 472b i zamawia hamburgera oraz piwo.
    */
        //Order nr 1:
        //Create clients nr 1:
        Client client1 = new Client(1, "Adam", "Pogodna 13", "111111111");
        //Create order nr 1:
        Order order1 = new Order(1, client1);
        //Create big peperoni pizza:
        Pizza bigPepperoni = new Pizza(65, 15.99f, PizzaType.pepperoni, PizzaSize.LARGE);
        //Create juice box:
        Drink juice = new Drink(1, 600, DrinkName.JUICE);
        //Adding pizza and drin to order:
        order1.getPizza().add(bigPepperoni);
        order1.getDrink().add(juice);
        //Order nr 2:
        //Create clients nr 2:
        Client client2 = new Client(2, "Anna", "Długa 18/3", "222222222");
        //Create order nr 2:
        Order order2 = new Order(2, client2);
        //Create smallHawaii pizza:
        Pizza smallHawaii = new Pizza(12, 10.2f, PizzaType.hawaii, PizzaSize.SMALL);
        //Create mediumCapricciosa pizza:
        Pizza mediumCapricciosa = new Pizza(12, 6.76f, PizzaType.capricciosa, PizzaSize.MEDIUM);
        //Create cola drink:
        Drink cola = new Drink(1, 500, DrinkName.COLA);
        //Adding pizza and drink to order:
        order2.getPizza().add(smallHawaii);
        order2.getPizza().add(mediumCapricciosa);
        order2.getDrink().add(cola);

        //Order nr 3:
        //Create clients nr 3:
        Client client3 = new Client(3, "Paweł", "Grunwaldzka 472b", "333333333");
        //Create order nr 2:
        Order order3 = new Order(3, client3);
        //Create burger:
        Burger burger = new Burger(5, 56);
        //Create beer drink:
        Drink beer = new Drink(1, 500, DrinkName.BEER);
        //Adding pizza and drink to order:
        order3.getBurger().add(burger);
        order3.getDrink().add(beer);

        //
        System.out.println(order3.getOrderID());
        Service service = new Service();
        service.run(order1, order2, order3);

//        OrderCreator.createOrder(1,"Adam","Pogodna 13", "111111111", 1, 45, null, PizzaType.PEPERRONI, PizzaSize.LARGE, Drink.JUICE );
//        OrderCreator.createOrder(1,"Anna","Pługa 18/3", "222222222", 1, 45, null, PizzaType.HAWAII, PizzaSize.SMALL, Drink.COLA );
//        OrderCreator.createOrder(1,"Adam","Pogodna 13", "333333333", 1, 45, 4.5, PizzaType.PEPERRONI, PizzaSize.LARGE, Drink.BEER );

        System.out.println("Koniec!");
    }
}
package infoshareacademy;

import infoshareacademy.Menu.*;
import infoshareacademy.Restaurant.*;

public class PizzeriaApp {
    public static void main(String[] args) {
        Client firstClient = new Client("Adam", "Pogodna 13", "123");
        Order firstOrder = new Order(firstClient);
        firstOrder.addProduct(new Pizza(PizzaType.PEPPERONI, PizzaSize.BIG));
        firstOrder.addProduct(new Drink(DrinkType.JUICE));
        firstOrder.addProduct(new Drink(DrinkType.JUICE));

        Client secondClient = new Client("Anna", "Dluga 18/3", "456");
        Order secondOrder = new Order(secondClient);
        secondOrder.addProduct(new Pizza(PizzaType.HAWAJSKA, PizzaSize.SMALL));
        secondOrder.addProduct(new Pizza(PizzaType.CPRICCIOSA, PizzaSize.MEDIUM));
        secondOrder.addProduct(new Drink(DrinkType.COLA));

        Client thirdClient = new Client("Pawel", "Grunwaldzka 472b", "789");
        Order thirdOrder = new Order(thirdClient);
        thirdOrder.addProduct(new Sandwich(SandwichType.HAMBURGER));
        thirdOrder.addProduct(new Drink(DrinkType.BEER));
    }
}

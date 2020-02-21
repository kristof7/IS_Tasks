package infoshareacademy;

import infoshareacademy.Drinks.*;
import infoshareacademy.Meals.*;

public class PizzeriaApp {
    public static void main(String[] args) {
        System.out.println("Pizzeria App :-)\n");
        Order order1 = new Order("123456789", "Anna", "Swietojanska 1");
        order1.addMeal(new Pizza(PizzaSize.SMALL, "HAWAI", 20));
        order1.addMeal(new Burger(BurgerType.CLASSIC, 21));
        order1.addDrink(new Drink(DrinkType.COKE, 5));
        order1.printOrderDetails();

        System.out.println("\n-------------------------------\n");

        Order order2 = new Order ("123123123", "Mark", "Grunwaldzka 5");
        order2.addMeal(new Pizza(PizzaSize.LARGE, "CAPRICIOSA", 35.50));
        order2.addMeal(new Pizza(PizzaSize.LARGE, "CAPRICIOSA", 35.50));
        order2.addMeal(new Pizza(PizzaSize.LARGE, "CAPRICIOSA", 35.50));
        order2.addMeal(new Pizza(PizzaSize.LARGE, "CAPRICIOSA", 35.50));
        order2.printOrderDetails();

        System.out.println("\n-------------------------------\n");

        Order order3 = new Order ("147258369", "Adam", "Pogodna 13");
        order3.addMeal(new Pizza(PizzaSize.LARGE, "PEPERONI", 34));
        order3.addDrink(new Drink(DrinkType.APPLEJUICE, 4));
        order3.addDrink(new Drink(DrinkType.APPLEJUICE, 4));
        order3.printOrderDetails();

        System.out.println("\n-------------------------------\n");

        Order order4 = new Order ("111222333", "Anna", "Dluga 18/3");
        order4.addMeal(new Pizza(PizzaSize.SMALL, "HAWAI", 20));
        order4.addMeal(new Pizza(PizzaSize.MEDIIUM, "CAPRICIOSA", 25));
        order4.addDrink(new Drink(DrinkType.COKE, 5));
        order4.printOrderDetails();

        System.out.println("\n-------------------------------\n");

        Order order5 = new Order("581234567", "Pawel", "Grunwaldzka 472b");
        order5.addMeal(new Burger(BurgerType.CLASSIC, 21));
        order5.addDrink(new Drink(DrinkType.BEER, 7));
        order5.printOrderDetails();

    }
}
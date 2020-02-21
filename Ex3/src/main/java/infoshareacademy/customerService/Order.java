package infoshareacademy.customerService;

import infoshareacademy.foodDetails.Drinks;
import infoshareacademy.foodDetails.Food;
import infoshareacademy.foodDetails.FoodType;
import infoshareacademy.foodDetails.PizzaSize;

public class Order extends Food {

    private Customer customer;
    private Food food;
    private Drinks drink;

    private Order(FoodType foodType, PizzaSize pizzaSize) {
        super(foodType, pizzaSize);
    }


    private static void announcement(){
        System.out.println("Zamówienie zrealizowane");
        System.out.println("#################################");
    }


    private static void printCustomerData(Customer customer) {
        System.out.println("#################################");
        System.out.println("Przyjęto następujące zamówienie do realizacji:");
        System.out.println("Klient: " + customer.getName());
        System.out.println("Adres: " + customer.getAdress());
        System.out.println("Telefon: " + customer.getPhone());
    }


    public static void makeOrder(Customer customer, FoodType foodType, PizzaSize pizzaSize, Drinks drink1, Drinks drink2) {
        printCustomerData(customer);
        System.out.println("Zamówienie składa się z: ");
        System.out.println(pizzaSize + " " + foodType);
        System.out.println(drink1 + ", " + drink2);
        announcement();
    }


    public static void makeOrder(Customer customer, FoodType foodType1, PizzaSize pizzaSize1, FoodType foodType2, PizzaSize pizzaSize2, Drinks drink) {
        printCustomerData(customer);
        System.out.println("Zamówienie składa się z: ");
        System.out.println(pizzaSize1 + " " + foodType1);
        System.out.println(pizzaSize2 + " " + foodType2);
        System.out.println(drink);
        announcement();
    }


    public static void makeOrder(Customer customer, FoodType foodType, Drinks drink) {
        printCustomerData(customer);
        System.out.println("Zamówienie składa się z: ");
        System.out.println(foodType);
        System.out.println(drink);
        announcement();
    }
}

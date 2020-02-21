package infoshareacademy;

import static infoshareacademy.PizzaKind.*;

public class PizzeriaApp {
    public static void main(String[] args) {

    PizzaKind[] kinds = PizzaKind.values();

    Customer customer1 = new Customer("Adam", "Pogodna 13","+48 123456789");
    Pizza pizza1 = new Pizza(PEPPERONI,1,"duza");
    Drink drink1 = new Drink("sok pomaranczowy",2);

    Order order1 = new Order(customer1,pizza1, drink1);

    Customer customer2 = new Customer("Anna", "Dluga 13/8", "+48 987654321");
    Pizza pizza2 = new Pizza(HAWAI, 1, "mala");
    Pizza pizza3 = new Pizza(CAPPRICIOSA, 1, "srednia");
    Drink drink2 = new Drink("cola",1);

    Order order2 = new Order(customer2,pizza2,pizza3,drink2);

    Customer customer3 = new Customer("Pawel", "Grunwaldzka 472b", "+48 192837465");
    Hamburger hamburger1 = new Hamburger(1);
    Drink drink3 = new Drink("piwo", 1);

    Order order3 = new Order(customer3, hamburger1,drink3);
    }
}
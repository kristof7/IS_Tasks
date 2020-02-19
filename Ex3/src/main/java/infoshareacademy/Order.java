package infoshareacademy;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Order extends Customer {

    public Order(String name, String address, int telephoneNumber) {
        super(name, address, telephoneNumber);
    }

    public static void getOrder(){

        Customer c1 = new Customer("Adam", "Pogodna 13", 555666777) {
            @Override
            protected boolean discount() {
                return false;
            }

        };

        Customer c2 = new Customer("Anna", "Długa 18", 444555666) {
            @Override
            protected boolean discount() {
                return true;
            }

        };

        Customer c3 = new Customer("Paweł", "Grunwaldza 472a", 333444555) {
            @Override
            protected boolean discount() {
                return false;
            }

        };

        List<String> pizza = new ArrayList<>();
        pizza.add("mała");
        pizza.add("średnia");
        pizza.add("duża");

        String hamburger = "hamburger";

        List<String> drinks = new ArrayList<>();
        drinks.add("cola");
        drinks.add("sok");
        drinks.add("piwo");

        out.println("\n\n------------------PIERWSZE ZAMÓWIENIE-----------------\n\n");

        out.println("KLIENT: " + c1.getName() + " " +  c1.getAddress() + "\n");
        PizzaType orderPizzaC1 = PizzaType.PEPPERONI;
        out.println("ZAMÓWIENIE: " + pizza.get(2) + " " + orderPizzaC1 + " \t| dwa razy " + drinks.get(1) + "\n");

        out.println("\n\n-------------------DRUGIE ZAMÓWIENIE------------------\n\n");

        out.println("KLIENT: " + c2.getName() + " " +  c2.getAddress() + "\n");
        PizzaType smallOrderPizzaC2 = PizzaType.HAVANA;
        PizzaType mediumOrderPizzaC2 = PizzaType.CAPRICIOSA;
        out.println("ZAMÓWIENIE: " + pizza.get(0) + " " + smallOrderPizzaC2 + " \t| " +  pizza.get(1) + " " +
                mediumOrderPizzaC2 + " \t| " + drinks.get(0) + "\n");

        out.println("\n\n------------------TRZECIE ZAMÓWIENIE -----------------\n\n");

        out.println("KLIENT: " + c3.getName() + " " +  c3.getAddress() + "\n");
        out.println("ZAMÓWIENIE: " + hamburger + " \t| " + drinks.get(2) + "\n");

    }

    @Override
    protected boolean discount() {
        return false;
    }
}

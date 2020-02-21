package infoshareacademy;

public class PizzeriaApp {
    public static void main(String[] args) {
        Order customer1 = new Order();
        customer1.setCustomerData("Adam", "Pogodna 13", "000111222");
        customer1.setOrder(TypeOfFood.PIZZA, PizzaType.PEPPERONI, PizzaSize.BIG, 1);
        customer1.setOrder(TypeOfFood.JUICE, 2);

        Order customer2 = new Order();
        customer2.setCustomerData("Anna", "Dluga 18/3", "111222333");
        customer2.setOrder(TypeOfFood.PIZZA, PizzaType.HAWAJSKA, PizzaSize.SMALL, 1);
        customer2.setOrder(TypeOfFood.PIZZA, PizzaType.CAPRICIOSA, PizzaSize.MEDIUM, 1);
        customer2.setOrder(TypeOfFood.COLA, 1);

        Order customer3 = new Order();
        customer3.setCustomerData("Pawel", "Grunwaldzka 472b", "222333444");
        customer3.setOrder(TypeOfFood.HAMBURGER, 1);
        customer3.setOrder(TypeOfFood.BEER, 1);

        customer1.getCustomerData();
        customer1.getOrder();
        customer2.getCustomerData();
        customer2.getOrder();
        customer3.getCustomerData();
        customer3.getOrder();
    }
}
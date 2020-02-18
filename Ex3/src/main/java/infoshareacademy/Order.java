package infoshareacademy;

public class Order {
    Client client1 = new Client("Adam", "Pogodna 13", "tel. 987 654 321");
    Client client2 = new Client("Anna", "ul. Długa 18/3", "tel. 654 321 987");
    Client client3 = new Client("Paweł", "ul. Grunwaldzka 472", "tel. 321 654 987");
    Pizza pizza = new Pizza();
    Drink drink = new Drink();
    Hamburger hamburger = new Hamburger();

    public String get1ClientOrder() {
        return "ORDER 1: " + client1.getClientDetails().toUpperCase() + ", " + pizza.getType().toString() + " "
                + pizza.getSize().toString() + ", " + drink.getNumberOfItems() + " x " + drink.getDrink();
    }

    public String get2ClientOrder() {
        return "ORDER 2: " + client2.getClientDetails().toUpperCase() + ", " + pizza.getType().toString() + " "
                + pizza.getSize().toString() + ", " + drink.getDrink() + ", ";
    }

    public String get2ClientAdditionalPizza() {
        return pizza.getType().toString() + " " + pizza.getSize().toString();
    }

    public String get3ClientOrder() {
        return "ORDER 3: " + client3.getClientDetails().toUpperCase() + ", " + hamburger.getHamburger() + ", "
                + drink.getDrink();
    }
}

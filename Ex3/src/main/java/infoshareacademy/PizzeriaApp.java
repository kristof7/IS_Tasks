package infoshareacademy;

public class PizzeriaApp {
    public static void main(String[] args) {

        Client client1 = new Client("Adam", "Pogodna 13", "tel. 987 654 321");
        Client client2 = new Client("Anna", "ul. Długa 18/3", "tel. 654 321 987");
        Client client3 = new Client("Paweł", "ul. Grunwaldzka 472", "tel. 321 654 987");

        Order order1 = new Order();
        System.out.println("ORDER 1:");
        order1.setClient(client1);
        System.out.print(order1.getClient().getClientDetails() + ", ");
        System.out.print(order1.getPizza().addMeal(Meal.Size.LARGE, Meal.Type.PEPPERONI) + ", ");
        System.out.println(order1.getBeverage().addBeverage("JUICE", "TWO\n"));

        Order order2 = new Order();
        System.out.println("ORDER 2:");
        order2.setClient(client2);
        System.out.print(order2.getClient().getClientDetails() + ", ");
        System.out.print(order2.getPizza().addMeal(Meal.Size.SMALL, Meal.Type.HAWAJSKA)+ ", ");
        System.out.print(order2.getPizza().addMeal(Meal.Size.MEDIUM, Meal.Type.CAPRICIOSA)+ ", ");
        System.out.println(order2.getBeverage().addBeverage("COKE", "ONE\n"));

        Order order3 = new Order();
        System.out.println("ORDER 3:");
        order3.setClient(client3);
        System.out.print(order3.getClient().getClientDetails() + ", ");
        System.out.print(order3.getHamburger().addHamburger("CLASSIC HAMBURGER" + ", "));
        System.out.println(order3.getBeverage().addBeverage("BEER", "ONE"));

    }
}
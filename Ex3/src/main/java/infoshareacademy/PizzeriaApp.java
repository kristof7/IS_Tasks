package infoshareacademy;

public class PizzeriaApp {
    public static void main(String[] args) {

        Order order1 = new Order();
        order1.pizza.setType(Menu.Type.PEPPERONI);
        order1.pizza.setSize(Menu.Size.LARGE);
        order1.drink.setDrink(Menu.Drink.JUICE);
        order1.drink.setNumberOfItems(Menu.NumberOfItems.TWO);
        System.out.println(order1.get1ClientOrder());

        Order order2 = new Order();
        order2.pizza.setType(Menu.Type.HAWAJSKA);
        order2.pizza.setSize(Menu.Size.SMALL);
        order2.drink.setDrink(Menu.Drink.COKE);
        System.out.print(order2.get2ClientOrder());
        order2.pizza.setType(Menu.Type.CAPRICIOSA);
        order2.pizza.setSize(Menu.Size.MEDIUM);
        System.out.println(order2.get2ClientAdditionalPizza());

        Order order3 = new Order();
        order3.hamburger.setHamburger("HAMBURGER");
        order3.drink.setDrink(Menu.Drink.BEER);
        System.out.println(order3.get3ClientOrder());

    }
}
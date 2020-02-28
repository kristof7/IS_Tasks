package infoshareacademy.orders;

import infoshareacademy.drinks.Drinks;
import infoshareacademy.drinks.TypeOfDrinks;
import infoshareacademy.pizza.Pizza;
import infoshareacademy.pizza.PizzaSize;
import infoshareacademy.pizza.PizzaType;

public class FirstOrder implements OrderMustHave {



    @Override
    public void whatToEat() {

        Pizza pizza = new Pizza(PizzaSize.BIG, PizzaType.PEPPERONI,1);

        System.out.println(pizza.getHowMany() + " " + pizza.getWhatPizzaSize() + " " + pizza.getWhatPizzaType());

    }

    @Override
    public void whatToDrink() {

        Drinks drinks = new Drinks(TypeOfDrinks.JUICE,2);

        System.out.println(drinks.getHowMany() + " " + drinks.getWhatTypeOfDrinks());
        System.out.println("Free cola? " + drinks.colaGratis("juice"));

    }

}

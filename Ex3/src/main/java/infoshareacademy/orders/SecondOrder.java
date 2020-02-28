package infoshareacademy.orders;

import infoshareacademy.drinks.Drinks;
import infoshareacademy.drinks.TypeOfDrinks;
import infoshareacademy.pizza.Pizza;
import infoshareacademy.pizza.PizzaSize;
import infoshareacademy.pizza.PizzaType;

public class SecondOrder implements OrderMustHave {

    @Override
    public void whatToEat() {
        Pizza pizza = new Pizza(PizzaSize.SMALL, PizzaType.HAVANA,1);
        Pizza pizza1 = new Pizza(PizzaSize.MEDIUM, PizzaType.CAPRICIOSA,1);

        System.out.println(pizza.getHowMany() + " " + pizza.getWhatPizzaSize() + " " + pizza.getWhatPizzaType());
        System.out.println(pizza1.getHowMany() + " " + pizza1.getWhatPizzaSize() + " " + pizza1.getWhatPizzaType());

    }

    @Override
    public void whatToDrink() {
        Drinks drinks = new Drinks(TypeOfDrinks.COLA,1);

        System.out.println(drinks.getHowMany() + " " + drinks.getWhatTypeOfDrinks());
        System.out.println("Free cola? " + drinks.colaGratis("cola"));

    }

}

package infoshareacademy.orders;

import infoshareacademy.drinks.Drinks;
import infoshareacademy.drinks.TypeOfDrinks;
import infoshareacademy.hamburger.Hamburger;

public class ThirdOrder implements OrderMustHave {

    @Override
    public void whatToEat() {

        Hamburger hamburger = new Hamburger(1,"HAMBURGER");

        System.out.println(hamburger.getHowMany() + " " + hamburger.getHamburger());

    }

    @Override
    public void whatToDrink() {

        Drinks drinks = new Drinks(TypeOfDrinks.BEER,1);

        System.out.println(drinks.getHowMany() + " " + drinks.getWhatTypeOfDrinks());
        System.out.println("Free cola? " + drinks.colaGratis("beer"));

    }

}

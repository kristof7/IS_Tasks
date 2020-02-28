package infoshareacademy.drinks;

public class Drinks extends Discount {

    TypeOfDrinks WhatTypeOfDrinks;
    int howMany;

    public TypeOfDrinks getWhatTypeOfDrinks() {
        return WhatTypeOfDrinks;
    }

    public int getHowMany() {
        return howMany;
    }

    public Drinks(TypeOfDrinks whatTypeOfDrinks, int howMany) {
        WhatTypeOfDrinks = whatTypeOfDrinks;
        this.howMany = howMany;
    }

    @Override
    public boolean colaGratis(String drink) {
        return super.colaGratis(drink);
    }

}

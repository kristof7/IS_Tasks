package infoshareacademy.Drinks;

public class Drink {
    public DrinkType drinkType;
    public double drinkPrice;

    public Drink(DrinkType drinkType, double price) {
        this.drinkType = drinkType;
        this.drinkPrice = price;
    }

    public void printDrinkDetails () {
        System.out.println(drinkType + ", price: " + drinkPrice);
    }
}

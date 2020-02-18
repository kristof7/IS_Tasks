package infoshareacademy;

public class Drink extends Menu {
    private Drink drink;
    private NumberOfItems numberOfItems;

    public NumberOfItems getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(NumberOfItems numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}

package infoshareacademy.pizza;

public class Pizza {

    PizzaSize whatPizzaSize;
    PizzaType whatPizzaType;
    int howMany;

    public Pizza(PizzaSize whatPizzaSize, PizzaType whatPizzaType, int howMany) {
        this.whatPizzaSize = whatPizzaSize;
        this.whatPizzaType = whatPizzaType;
        this.howMany = howMany;
    }

    public PizzaSize getWhatPizzaSize() {
        return whatPizzaSize;
    }

    public void setWhatPizzaSize(PizzaSize whatPizzaSize) {
        this.whatPizzaSize = whatPizzaSize;
    }

    public PizzaType getWhatPizzaType() {
        return whatPizzaType;
    }

    public void setWhatPizzaType(PizzaType whatPizzaType) {
        this.whatPizzaType = whatPizzaType;
    }

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }
}

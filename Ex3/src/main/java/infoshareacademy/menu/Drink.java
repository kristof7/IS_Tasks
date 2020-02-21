package infoshareacademy.menu;

public class Drink extends Meal {
    private DrinkName drinkName;

    public Drink(float timeOfPreparing, float mass, DrinkName drinkName) {
        super(timeOfPreparing, mass);
        this.drinkName = drinkName;
    }

    public float getPrice() {
        return drinkName.getPrice();
    }

    public float getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return drinkName.toString();
    }
}

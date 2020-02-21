package infoshareacademy.menu;

public class Burger extends Meal {
    public Burger(float timeOfPreparing, float mass) {
        super(timeOfPreparing, mass);
    }

    public float getPrice() {
        return price;
    }

    public float getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "burger";
    }
}

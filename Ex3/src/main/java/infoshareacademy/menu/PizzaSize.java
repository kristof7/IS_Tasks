package infoshareacademy.menu;

public enum PizzaSize {
    SMALL("small", 200),
    MEDIUM("medium", 400),
    LARGE("large", 600);

    private String name;
    private float mass;

    PizzaSize(String name, float mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getPizzaSize() {
        return name;
    }

    public float getMass() { return mass; }


    @Override
    public String toString() {
        return name;
    }
}

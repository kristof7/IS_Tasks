package infoshareacademy.menu;

public abstract class Meal {
    float timeOfPreparing;
    float price;
    float mass;

    public Meal(float timeOfPreparing,
                float price
                ) {
        this.timeOfPreparing = timeOfPreparing;
        this.mass = price;
    }

//    public Meal(byte quantity, float timeOfPreparing) {
//        this.quantity = quantity;
//        this.timeOfPreparing = timeOfPreparing;
//    }

//    float calculatePrice() {
//        price = timeOfPreparing * mass;
//        return price;
//    }


}

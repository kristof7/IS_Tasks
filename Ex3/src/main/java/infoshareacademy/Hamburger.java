package infoshareacademy;

public class Hamburger extends OrderItem implements Burger{

    Hamburger(Integer quantity){
        this.quantity = quantity;
    }

    @Override
    protected void displayItem() {
        System.out.println("zamawia: "+name+", sztuk: "+quantity);
    }
}

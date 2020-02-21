package infoshareacademy;

public class Hamburger extends OrderItem{
    private final String name = "Hamburger";

    Hamburger(Integer quantity){
        this.quantity = quantity;
    }

    @Override
    protected void displayItem() {
        System.out.println("zamawia: "+name+", sztuk: "+quantity);
    }
}

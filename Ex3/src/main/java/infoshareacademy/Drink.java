package infoshareacademy;

public class Drink extends OrderItem{
    private String name;

    Drink(String name, Integer quantity){
        this.name = name;
        this.quantity = quantity;

    }

    @Override
    protected void displayItem() {
        System.out.println("oraz "+name+", sztuk: "+quantity);
    }

}

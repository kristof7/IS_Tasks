package infoshareacademy;

public class Pizza extends OrderItem{
    private PizzaKind name;
    private String size;

    Pizza(PizzaKind name,Integer quantity, String size){
        this.name = name;
        this.quantity = quantity;
        this.size = size;
    }

    @Override
    protected void displayItem() {
        System.out.println("zamawia: "+name.getPizzaName()+", sztuk: "+quantity+" w rozmiarze: "+size);
    }
}

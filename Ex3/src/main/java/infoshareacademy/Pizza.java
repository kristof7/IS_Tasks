package infoshareacademy;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return name == pizza.name &&
                Objects.equals(size, pizza.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}

package infoshareacademy.products;

public class Burger extends Product{
    TypeOfBurger typeOfBurger;

    public Burger(Integer quantity, TypeOfProduct typeOfProduct, TypeOfBurger typeOfBurger) {
        super(quantity, typeOfProduct);
        this.typeOfBurger = typeOfBurger;
    }

    public TypeOfBurger getTypeOfBurger() {
        return typeOfBurger;
    }

    @Override
    public TypeOfProduct getTypeOfProduct() {
        return TypeOfProduct.BURGER;
    }

    public void setTypeOfBurger(TypeOfBurger typeOfBurger) {
        this.typeOfBurger = typeOfBurger;
    }

    @Override
    public void printProductDetail() {
        System.out.println(getTypeOfProduct() + ": " + typeOfBurger + ", quantity: " + getQuantity());
    }

}

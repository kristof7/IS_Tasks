package infoshareacademy.products;

public class Pizza extends Product {
    SizeOfPizza sizeOfPizza;
    TypeOfPizza typeOfPizza;

    public Pizza(Integer quantity, TypeOfProduct typeOfProduct, SizeOfPizza sizeOfPizza, TypeOfPizza typeOfPizza) {
        super(quantity, typeOfProduct);
        this.sizeOfPizza = sizeOfPizza;
        this.typeOfPizza = typeOfPizza;
    }

    public SizeOfPizza getSizeOfPizza() {
        return sizeOfPizza;
    }

    public TypeOfPizza getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setSizeOfPizza(SizeOfPizza sizeOfPizza) {
        this.sizeOfPizza = sizeOfPizza;
    }

    public void setTypeOfPizza(TypeOfPizza typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    @Override
    public TypeOfProduct getTypeOfProduct() {
        return TypeOfProduct.PIZZA;
    }

    @Override
    public void printProductDetail() {
        System.out.println(getTypeOfProduct() + ": " + typeOfPizza + ", " + sizeOfPizza + ", quantity: " + getQuantity());
    }

}

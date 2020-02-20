package infoshareacademy.products;

public class Drinks extends Product {
    TypeOfDrinks typeOfDrinks;

    public Drinks(Integer quantity, TypeOfProduct typeOfProduct, TypeOfDrinks typeOfDrinks) {
        super(quantity, typeOfProduct);
        this.typeOfDrinks = typeOfDrinks;
    }

    public TypeOfDrinks getTypeOfDrinks() {
        return typeOfDrinks;
    }

    @Override
    public TypeOfProduct getTypeOfProduct() {
        return TypeOfProduct.DRINKS;
    }

    public void setTypeOfDrinks(TypeOfDrinks typeOfDrinks) {
        this.typeOfDrinks = typeOfDrinks;
    }

    @Override
    public void printProductDetail() {
        System.out.println(getTypeOfProduct() + ": " + typeOfDrinks + ", quantity: " + getQuantity());
    }
}

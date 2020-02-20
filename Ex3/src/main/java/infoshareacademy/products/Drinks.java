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

    public void printDrinksOrder () {
        System.out.println("Drink : " + getTypeOfDrinks().toString().toLowerCase() + ", quantity : " + getQuantity() + ".");
    }
}

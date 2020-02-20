package infoshareacademy.products;

import infoshareacademy.orders.Order;

public abstract class Product {

    private Integer quantity;
    private TypeOfProduct typeOfProduct;

    public Product(Integer quantity, TypeOfProduct typeOfProduct) {
        this.quantity = quantity;
        this.typeOfProduct = typeOfProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public TypeOfProduct getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setTypeOfProduct(TypeOfProduct typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public abstract void printProductDetail();


}




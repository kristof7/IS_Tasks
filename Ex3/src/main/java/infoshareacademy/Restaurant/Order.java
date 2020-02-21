package infoshareacademy.Restaurant;

import infoshareacademy.Menu.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    private List<Product> listOfProducts = new ArrayList<>();

    public Order(Client client) {
        this.client = client;
    }

    public void addProduct(Product product){
        listOfProducts.add(product);
    }
}

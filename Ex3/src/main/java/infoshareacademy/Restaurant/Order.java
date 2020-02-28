package infoshareacademy.Restaurant;

import infoshareacademy.Menu.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> listOfProducts = new ArrayList<>();
    private Client client;
    public Order() {
    }
    public Order(Client client){
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void addProduct(Product product){
        listOfProducts.add(product);
    }
}

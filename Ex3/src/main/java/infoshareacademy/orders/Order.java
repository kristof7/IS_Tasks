package infoshareacademy.orders;

import infoshareacademy.aboutClient.Client;
import infoshareacademy.products.Product;

public class Order {
    private Client client;
    private Product[] products;


    public Order(Client client, Product... products) {
        this.client = client;
        this.products = products;
    }


    public Client getClient() {
        return client;
    }

    public Product[] getProduct() {
        return products;
    }

    public void printOrder() {
        System.out.println("Order from : ");
        client.printClientDetail();
        System.out.println("Products :");
        for(Product product : products) {
            product.printProductDetail();
        }
    }
}

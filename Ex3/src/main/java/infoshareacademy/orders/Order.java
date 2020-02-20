package infoshareacademy.orders;

import infoshareacademy.aboutClient.Client;
import infoshareacademy.products.Product;

public class Order {
    private Client client;
    private Product[] product;


    public Order(Client client, Product... product) {
        this.client = client;
        this.product = product;
    }


    public Client getClient() {
        return client;
    }

    public Product[] getProduct() {
        return product;
    }

    public void printOrder() {
        System.out.println("Order from : ");
        client.createClient();
        System.out.println("Orders :");
    }
}

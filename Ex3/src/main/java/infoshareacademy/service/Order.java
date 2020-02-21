package infoshareacademy.service;

import infoshareacademy.menu.Burger;
import infoshareacademy.menu.Drink;
import infoshareacademy.menu.Pizza;

import java.util.ArrayList;

public class Order implements OrderInt {
    int orderID;
    private Client client;
    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private ArrayList<Burger> burgers = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();

    public Order(int orderID, Client client) {
        this.orderID = orderID;
        this.client = client;
    }

    public ArrayList<Pizza> getPizza() {
        return pizzas;
    }

    public ArrayList<Burger> getBurger() {
        return burgers;
    }

    public ArrayList<Drink> getDrink() {
        return this.drinks;
    }

    public int getOrderID() {
        return orderID;
    }

    @Override
    public float getOrderPrice(Order... orders) {
        float priceOfOrder = 0.0f;
        for (Pizza pizza : pizzas) {
            priceOfOrder += pizza.getPrice();
        }
        for (Burger burger : burgers) {
            priceOfOrder += burger.getPrice();
        }
        for (Drink drink : drinks) {
            priceOfOrder += drink.getPrice();
        }
        return priceOfOrder;
    }

//    @Override
//    public float getOrderPrice() {
//        return 0f;
//    }

    @Override
    public float getOrderMass(Order... orders) {
        float massOfOrder = 0.0f;
        for (Pizza pizza : pizzas) {
            massOfOrder += pizza.getMass();
        }
        for (Burger burger : burgers) {
            massOfOrder += burger.getMass();
        }
        for (Drink drink : drinks) {
            massOfOrder += drink.getMass();
        }
        return massOfOrder;
    }

    @Override
    public String toString() {
        return "Zamówienie nr " + orderID +
                " dla: " + client.toString() +
                " to " + pizzas.toString() +
                " " + burgers.toString() +
                " oraz " + drinks.toString()
                ;
    }
}

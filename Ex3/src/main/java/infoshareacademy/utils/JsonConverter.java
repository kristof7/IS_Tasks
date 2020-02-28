package infoshareacademy.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import infoshareacademy.Menu.Product;
import infoshareacademy.PizzeriaApp;
import infoshareacademy.Restaurant.Client;
import infoshareacademy.Restaurant.Order;
import infoshareacademy.Restaurant.OrderList;

import java.io.*;
import java.util.*;

public abstract class JsonConverter {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String ORDER_JSON_FILE = "Ex3/src/resources/Order.json";

    public static void saveOrderToJsonFile(OrderList orderList) {
        try (Writer writer = new FileWriter(ORDER_JSON_FILE)) {
            GSON.toJson(orderList, writer);
            System.out.println("Order saved to json file:  " + ORDER_JSON_FILE);
        } catch (IOException e) {
            System.out.println("Exception during saving json file: " + e.getMessage());
        }
    }

    public static OrderList readOrderJsonFile() {
        try (Reader reader = new FileReader(ORDER_JSON_FILE)) {
            System.out.println("Reading Order from json file: " + ORDER_JSON_FILE);
            OrderList orderList = GSON.fromJson(reader, OrderList.class);
            System.out.println("Orders successfully uploaded. Number of orders: ");
            return orderList;
        } catch (IOException e) {
            System.out.println("Users json file not found or broken: " + e.getMessage());
        }
        return new OrderList();
    }
}

package infoshareacademy.orders;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import infoshareacademy.customer.Customer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintOrders {

    Customer firstcustomer = new Customer("Adam", "Pogodna 13", 222333444);
    Customer secondCustomer = new Customer("Anna", "Długa 18/3", 333444555);
    Customer thirdCustomer = new Customer("Paweł", "Grunwaldzka 472b", 666555444);

    FirstOrder firstOrder = new FirstOrder();
    SecondOrder secondOrder = new SecondOrder();
    ThirdOrder thirdOrder = new ThirdOrder();

    public void welcome() {
        System.out.println("============WELCOME IN PIZZA APP==================\n");
    }

    public void printFirstOrders() {

        System.out.println("===========ORDER=================");
        System.out.println(firstcustomer.getName() + " " + firstcustomer.getAdresse() + "\n");
        firstOrder.whatToEat();
        firstOrder.whatToDrink();

    }

    public void printSecondOrder() {

        System.out.println("\n\n===========ORDER=================");
        System.out.println(secondCustomer.getName() + " " + secondCustomer.getAdresse() + "\n");
        secondOrder.whatToEat();
        secondOrder.whatToDrink();
    }

    public void printThirdOrder() {

        System.out.println("\n\n===========ORDER=================");
        System.out.println(thirdCustomer.getName() + " " + thirdCustomer.getAdresse() + "\n");
        thirdOrder.whatToEat();
        thirdOrder.whatToDrink();
    }




}

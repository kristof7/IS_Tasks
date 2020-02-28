package infoshareacademy;
import infoshareacademy.orders.PrintOrders;

import java.io.IOException;

public class PizzeriaApp {


    public static void main(String[] args) throws IOException {


        PrintOrders printOrders = new PrintOrders();
        printOrders.welcome();
        printOrders.printFirstOrders();
        printOrders.printSecondOrder();
        printOrders.printThirdOrder();

    }
}

















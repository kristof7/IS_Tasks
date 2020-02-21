package infoshareacademy.service;

import java.util.Scanner;

public class Service {
    public void run(Order... orders) {
        int num1 = 0;
        do {
            System.out.println("\n");
            System.out.println("Pracowniku pizzerii, w czym mogę Ci pomóc?");
            System.out.println("1 - Pokaż listę aktualnych zamówień");
            System.out.println("2 - Cenę aktualnych zamówienia");
            System.out.println("3 - Masę konkretnego zamówienia");
            System.out.println("0 - Koniec na dziś");
            boolean loop = true;
            while (loop) {
                try {
                    num1 = readNumber();
                    loop = false;
                } catch (Exception e) {
                    System.out.println("Wpisałeś niepoprawnie");
                }
            }

            switch (num1) {
                case 1:
                    listOfOrders(orders);
                    break;
                case 2:
                    priceOfOrder(orders);
                    break;
                case 3:
                    massOfOrder(orders);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Nie poprawna liczba!");
                    break;
            }
        } while (num1 != 0);
    }

    private void priceOfOrder(Order... orders) {
        System.out.println("Ceny zamówień:");
        for (Order order : orders) {
            System.out.println(order.getOrderPrice(orders));
        }
    }

    private void massOfOrder(Order... orders) {
        System.out.println("Masa zamówień:");
        for (Order order : orders) {
            System.out.println(order.getOrderMass(orders));
        }
    }

    public void listOfOrders(Order... orders) {
        //System.out.println(order.t);
        for (Order order : orders) {
            System.out.println(order);
        }
        //System.out.println(Arrays.toString(orders));
    }


    private Integer readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}


package infoshareacademy;

import java.util.Scanner;

public class PizzeriaApp {

    public static void main(String[] args) {
        char znak;
        System.out.println("Manu");
        System.out.println("- pizza(mała, średnia, duża)");
        System.out.println("- napoje(cola, sok, piwo)");
        System.out.println();
        System.out.println("Typ Pizzy : Peperoni, Capriciosa, Havajska,, itp.");
        System.out.println(" Aby wyswietkić aktualne zmówienia wciśnij 2");
        Customer cast1 = new Customer("Adam", "Gdańsk", "ul.Kolejowa",12);
        Customer cast2 = new Customer("Ania", "Gdańsk", "ul.Długa", (char)6/2);
        Customer cast3 = new Customer("Paweł", "Gdańsk", "ulGrunwaldzka",254);


        Scanner scanner1 = new Scanner(System.in);
        Drinks d1 = Drinks.BEER;
        Drinks d2 = Drinks.COLA;

        Pizza Peperoni = new Pizza("peperoni");
        znak = scanner1.next().charAt(0);
        switch (znak) {
            case '2': {
                cast1.createCustomer();
                System.out.println("zamówienie");
                Pizza.getInstance();

                cast2.createCustomer();
                System.out.println("zamówienie");
                Pizza.getInstance1();
                cast3.createCustomer();
                System.out.println("zamówienie");
                Pizza.getInstance2();
                break;
            }
        }
    }
}

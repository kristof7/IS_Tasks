package infoshareacademy.customerService;

import infoshareacademy.foodDetails.Drinks;
import infoshareacademy.foodDetails.FoodType;
import infoshareacademy.foodDetails.PizzaSize;

public class PizzeriaApp {
    public static void main(String[] args) {


        Order.makeOrder(new Customer("Adam","Pogodna 13","123456789"),
                FoodType.PEPPERONI, PizzaSize.DUŻA, Drinks.SOK,Drinks.SOK);

        Order.makeOrder(new Customer("Anna","Długa 18/3","321654987"),
                FoodType.HAWAII,PizzaSize.MAŁA,FoodType.CAPRICCIOSA,PizzaSize.ŚREDNIA,Drinks.COLA);

        Order.makeOrder(new Customer("Paweł","Grunwaldzka 472b", "741852963"),
                FoodType.HAMBURGER,Drinks.PIWO);



    }
}
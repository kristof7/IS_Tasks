package infoshareacademy;


import static infoshareacademy.Drink.Drinks.*;
import static infoshareacademy.Hamburger.Burgers.hamburgery;
import static infoshareacademy.PizzaChoose.Pizza3.*;

public class Main {

        public static void main(String[] args) {




        System.out.println("Zamówienia");
        System.out.println("***********************************************");
        Summary.printOrderOnScreen("Adam", "ulicy Pogodnej 13", 598001516);
        Summary.printOrderP("Peperoni",1,large);
        Summary.printOrderD(juice,2);
        System.out.println("*************************************************");
        Summary.printOrderOnScreen("Anna", "ulicy Długiej 18/3", 578004598);
        Summary.printOrderP("Hawajska",1,small);
        Summary.printOrderP("Capricosa",1,medium);
        Summary.printOrderD(pepsi,1);
        System.out.println("***********************************************");
        Summary.printOrderOnScreen("Paweł", "ulicy Grunwaldzkiej 472b", 54968723);
        Summary.printOrderD(beer,1);
        Summary.printOrderH(hamburgery,1);
    }}

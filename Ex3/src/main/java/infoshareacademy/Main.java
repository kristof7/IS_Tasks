package kasia39;


import java.util.Objects;

import static kasia34.Drink.Drinks.*;
import static kasia34.Hamburger.Burgers.hamburgery;
import static kasia34.PizzaChoose.Pizza3.*;

public class Main {


    public static void main(String[] args) {

        OrderClient nowy1 = new OrderClient();
        nowy1.setClient2("Adam", "ulicy Pogodnej 13", 598001516);
        nowy1.printOrderP("peperoni", 1, large);
        nowy1.printOrderD(juice, 2);

        OrderClient nowy2 = new OrderClient();
        nowy2.setClient2("Anna", "ulicy Dlugiej 18/3", 5700000);
        nowy2.printOrderP("Hawajska", 1, small);
        nowy2.printOrderP("Capricosa", 1, medium);
        nowy2.printOrderD(pepsi, 1);
        OrderClient nowy3 = new OrderClient();
        nowy3.setClient2("Pawel", "ulicy Grunwaldzkiej 472b", 5400000);
        nowy3.printOrderH(hamburgery, 1);
        nowy3.printOrderD(beer, 1);
        if(Objects.equals(nowy1,nowy2)){
            System.out.println("Osoby o tych samych danych" );

        }
         else System.out.println("osoby o innych danych");

         }


        }




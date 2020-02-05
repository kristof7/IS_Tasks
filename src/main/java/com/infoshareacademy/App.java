package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("JJDZ8 - homeworks!");
        char znak;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbą");
        Integer i = scan1.nextInt();
        System.out.println("podaj drugą liczbę liczbą");
        Integer k = scan1.nextInt();
        System.out.println("podaj działanie jakie chcesz wykonać");
        System.out.println("dodawanie znak +");
        System.out.println("odejmowanie znak -");
        System.out.println("dzielenie znak /");
        System.out.println("mnozenie znak *");

        znak = scan1.next().charAt(0);
        switch (znak) {

            case '+': {
                System.out.println("wynik : " + (i + k));
                break;
            }
            case '-': {
                System.out.println("wynik : " + (i - k));
                break;
            }
            case '*': {
                System.out.println("wynik : " + (i * k));
                break;
            }
            case '/': { if (k == 0|| i == 0)
                System.out.println("nie dzielimy przez zero");
            else
                System.out.println("wynik : " + (i / k));
                break;

                }
            }

        }
    }


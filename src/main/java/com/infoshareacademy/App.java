package com.infoshareacademy;

import java.util.Scanner;

public class App {

    static Double cyfra1;
    static Double cyfra2;
    static Character dzialanie;
    static Double wynik;
    static boolean wartosc1=true;
    static boolean wartosc2=true;
    static boolean wartosc3=true;

    public static void main(String[] args) {



        System.out.println("Podaj pierwsza liczbe:");
        while(wartosc1) {
            try {
                Scanner scanner = new Scanner(System.in);
                cyfra1 = scanner.nextDouble();
                wartosc1 = false;
            } catch (Exception e) {
                System.out.println("Podana wartosc nie jest liczba, sprobuj ponownie");
            }
        }

        System.out.println("Podaj druga liczbe:");
        while(wartosc2) {
            try {
                Scanner scanner = new Scanner(System.in);
                cyfra2 = scanner.nextDouble();
                wartosc2 = false;
            } catch (Exception e) {
                System.out.println("Podana wartosc nie jest liczba, sprobuj ponownie");
            }
        }

        System.out.println("Podaj symbol działania (+,-,*,/):");
        while(wartosc3) {
            Scanner scanner = new Scanner(System.in);
            dzialanie = scanner.next().charAt(0);
            if (dzialanie == '+' || dzialanie == '-' || dzialanie == '/' || dzialanie == '*') {
                wartosc3 = false;
            }else {
                System.out.println("Podana wartosc nie jest jednym z symboli dzialania, sprobuj ponownie");
            }
        }

        if (dzialanie=='+'){
            dzialanie=1;
        }else if (dzialanie=='-'){
            dzialanie=2;
        }else if (dzialanie=='*'){
            dzialanie=3;
        }else{
            dzialanie=4;
        }

        switch(dzialanie) {
            case 1:  wynik= cyfra1 + cyfra2;
                System.out.println("wynik dzialania: "+wynik);
                break;
            case 2:  wynik= cyfra1 - cyfra2;
                System.out.println("wynik dzialania: "+wynik);
                break;
            case 3:  wynik=  cyfra1 * cyfra2;
                System.out.println("wynik dzialania: "+wynik);
                break;
            case 4:
                if(cyfra2==0){
                    System.out.println("nie mozna dzielic przez 0");
                } else {
                    wynik =  cyfra1 / cyfra2;
                    System.out.println("wynik dzialania: " + wynik);
                }
                break;
        }
    }
}
package com.infoshareacademy;

import java.util.Scanner;

public class Tekst {
    public void wpiszNapis(){
        Scanner podanyNapis = new Scanner(System.in);
        System.out.println("Podaj napis...");
        String tekst = podanyNapis.nextLine();
        System.out.println("Napis to : " + tekst + " - " + tekst.charAt(0));
    }
}
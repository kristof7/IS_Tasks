package kasia23;


import java.util.Scanner;

public class CharAtExample {


        public static char pierwszaLitera(String tekst){



        char ch1 = tekst.charAt(0);
        return ch1;}
        public static void main(String args[]) {
            Scanner scan= new Scanner(System.in);
            String tekst=scan.nextLine();;
            System.out.println(tekst+"-"+pierwszaLitera(tekst));
        }}



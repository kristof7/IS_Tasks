package ZadanieB;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

         double result = 0;
         int i=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double firstNumb= scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double secoundNumb= scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj znak");
        String sign= scanner.nextLine();

        switch (sign){
            case "*":
                result=firstNumb*secoundNumb;
                break;
            case "/":
                result=firstNumb/secoundNumb;
                break;
            case "+":
                result=firstNumb+secoundNumb;
                break;
            case "-":
                result=firstNumb-secoundNumb;
                break;
            default:
                System.out.println("podałeś zły znak");
                i++;
        }

        if (i==0) {
            System.out.println("Wynik dzialania " + firstNumb + " " + sign + " " + secoundNumb + " = " + result);
        }





    }
}

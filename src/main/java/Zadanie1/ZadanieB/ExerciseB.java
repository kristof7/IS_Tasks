package Zadanie1.ZadanieB;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExerciseB {
    public void gameB() throws Exception {

//--------------ZADANIE B--------------------------
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("This program calculate mathematical operations such as addition, subtraction, multiplication and division.");
        System.out.println("The program will ask you to input three values such as first number, operator and second number.");
        String[] opers = {"+", "-", "*", "/"};
        String oper = "";
        double numberA = 0;
        double numberB = 0;
        boolean goodOper = false;
        boolean retry = false;

        do {
            try {
                System.out.println("Input first number:");
                scanner = new Scanner(System.in);
                scanner.useLocale(Locale.US);
                numberA = scanner.nextDouble();
                retry = true;
            } catch (Exception e) {
                System.out.println("It's not valid value, please try again.. ");
                retry = false;
            }
        } while (retry == false);

        do {
            System.out.println("Input operator, you can only choose between ( +, -, *, / ):");
            scanner = new Scanner(System.in);
            oper = scanner.nextLine();
            if (oper.matches(Arrays.toString(opers))) {
                goodOper = true;
            } else {
                goodOper = false;
                System.out.println("It's not valid operator, please try again.. ");
            }
        } while (!goodOper);

        do {
            try {
                System.out.println("Input second number:");
                scanner = new Scanner(System.in);
                scanner.useLocale(Locale.US);
                numberB = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("It's not valid value, please try again.. ");
                retry = false;
            }
        } while (retry == false);


        Double resultSum = sum(numberA, numberB);
        Double resultSub = sub(numberA, numberB);
        Double resultProd = prod(numberA, numberB);
        Double resultQuot = quot(numberA, numberB);

        if (oper.equals("+")) {
            System.out.println("The addition of: " + numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultSum)));
        } else if (oper.equals("-")) {
            System.out.println("The subbtraction of: " + numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultSub)));
        } else if (oper.equals("*")) {
            System.out.println("The multiplication of: " + numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultProd)));
        } else if (oper.equals("/")) {
            System.out.println("The division of: " + numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultQuot)));
        } else {
            System.out.println("Something went wrong...");
        }


    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double prod(double a, double b) {
        return a * b;
    }

    public static double quot(double a, double b) {
        return a / b;
    }
}

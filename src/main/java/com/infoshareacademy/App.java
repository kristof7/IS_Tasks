package com.infoshareacademy;

import Zadanie1.ZadanieB.ExerciseB;
import Zadanie1.ZadanieC.Card;
import Zadanie1.ZadanieC.Ranks;
import Zadanie1.ZadanieC.Suits;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

//--------------ZADANIE B--------------------------
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("This program calculate mathematical operations such as addition, subtraction, multiplication and division.");
        System.out.println("The program will ask you to input three values such as first number, operator and second number.");
        int i = 0;
        do {
            try {
                System.out.println("Input first number:");
                scanner = new Scanner(System.in);
                double numberA = scanner.nextDouble();

                System.out.println("Input operator, you can choose between + , - , * , / only:");
                scanner = new Scanner(System.in);
                char oper = scanner.next().charAt(0);

                if (oper == '+' || oper == '-' || oper == '*' || oper == '/') {
                } else {
                    System.out.println("Wrong operator inputed!, remember to use only ( + , - , * , / ) operators");
                    break;
                }

                System.out.println("Input second number:");
                scanner = new Scanner(System.in);
                double numberB = scanner.nextDouble();

                Double resultSum = ExerciseB.sum(numberA, numberB);
                Double resultSub = ExerciseB.sub(numberA, numberB);
                Double resultProd = ExerciseB.prod(numberA, numberB);
                Double resultQuot = ExerciseB.quot(numberA, numberB);

                if (oper == '+') {
                    System.out.println("The addition of: " + numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultSum)));
                } else if (oper == '-') {
                    System.out.println("The subbtraction of: " + numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultSub)));
                } else if (oper == '*') {
                    System.out.println("The multiplication of: " + numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultProd)));
                } else if (oper == '/') {
                    System.out.println("The division of: " + numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultQuot)));
                } else {
                    System.out.println("Wrong operator inputed!, remember to use only ( + , - , * , / ) operators");
                }

            } catch (Exception e) {
                System.out.println("It's not valid value, please try again.. ");
            }
        } while (i <= 0);
        i++;

    }
}


package com.infoshareacademy;

import Zadanie1.ZadanieA.ExerciseA;
import Zadanie1.ZadanieB.ExerciseB;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//--------------ZADANIE B--------------------------
        Scanner scanner = new Scanner(System.in);
        //----This method sets the Locale to be used by this Scanner object overriding the default locale
        scanner.useLocale(Locale.US);
        //----Some description of how program works-----
        System.out.println("This program calculate mathematical operations such as addition, subtraction, multiplication and division.");
        System.out.println("The program will ask you to input three values such as first number, operator and second number.");
        System.out.println("Please input first number:");
        //----here the user types number A-----
        double numberA = scanner.nextDouble();
        System.out.println("Please input operator, you can choose between +,-,*,/ only:");
        //----here the user types operator-----
        char oper = scanner.next().charAt(0);
        if (oper == '+' || oper == '-' || oper == '*' || oper == '/') {
        } else {
            System.out.println("Wrong operator inputed!, remember to use only ( + , - , * , / ) operators");
        }
        //---if valid operators have been entered, program continue...-----
        System.out.println("Please input second number:");
        //----here the user types number B-----
        double numberB = scanner.nextDouble();

        Double resultSum = ExerciseB.sum(numberA, numberB);
        Double resultSub = ExerciseB.sub(numberA, numberB);
        Double resultProd = ExerciseB.prod(numberA, numberB);
        Double resultQuot = ExerciseB.quot(numberA, numberB);

        //Program round numbers to two decimal places
        if (oper == '+') {
            System.out.println(numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultSum)));
        } else if (oper == '-') {
            System.out.println(numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultSub)));
        } else if (oper == '*') {
            System.out.println(numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultProd)));
        } else if (oper == '/') {
            System.out.println(numberA + " " + oper + " " + numberB + " = " + (String.format("%.2f", resultQuot)));
        } else {
            System.out.println("Wrong operator inputed!, remember to use only ( + , - , * , / ) operators");
        }
    }
}

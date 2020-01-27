package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        Card card = new Card();

        System.out.println("Enter Cards suits DIAMONDS/CLUBS/HEARTS/SPADES");
        Scanner scanner = new Scanner(System.in);
        String suits = scanner.nextLine();
        card.setSUITSFromUserInput(suits);


        System.out.println("Enter Cards suits JACK/ACE/KING/QUEEN");
        Scanner scanner1 = new Scanner(System.in);
        String ranks = scanner.nextLine();
        card.setRANKSFromUserInput(ranks);

        System.out.println(card.description());

       /* //ExerciseB
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Please enter first number:");
        calculator.num1 = scanner.nextDouble();

        System.out.println("Please enter second number:");
        calculator.num2 = scanner.nextDouble();

        System.out.println("What action do you perform: +,-,/,*?");
        Scanner scanner1 = new Scanner(System.in);
        calculator.sign = scanner1.nextLine();


        double result = calculator.calculate(calculator.num1,calculator.num2,calculator.sign);
        System.out.println(calculator.num1 + calculator.sign + calculator.num2 + "="+ result);*/


        /*  System.out.println("Exercise A");

        ExerciseA exerciseA = new ExerciseA();

        System.out.println("Enter String type parameter: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        char firstLetter = exerciseA.charAtFirstPosition(userInput);
        System.out.println(firstLetter);*/
    }
}

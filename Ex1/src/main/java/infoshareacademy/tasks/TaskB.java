package infoshareacademy.tasks;

import java.util.Scanner;

public class TaskB {
    private static final String ADD = "+";
    private static final String SUBTRACT = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    public static void run() {
        try {
            System.out.println("Please give a first number: ");
            Double firstNumber = scanNumber();
            System.out.println("Now please give a second number: ");
            Double secondNumber = scanNumber();
            System.out.println("Lastly advise of a math operator (+, -, *, /): ");
            String mathOperator = scanMathOperator();
            Double result = getResult(firstNumber, secondNumber, mathOperator);
            System.out.println("Your equation is: " + firstNumber + " " + mathOperator + " " + secondNumber + " = " + result);
        } catch (Exception e) {
            System.out.println("Not correct input.");
        }
    }

    public static Double getResult(Double firstNumber, Double secondNumber, String mathOperator) {
        Double result = null;
        boolean x = isCorrectInput(mathOperator);
        while (x) {
            switch (mathOperator) {
                case ADD:
                    result = firstNumber + secondNumber;
                    x=!x;
                    break;
                case SUBTRACT:
                    result = firstNumber - secondNumber;
                    x=!x;
                    break;
                case MULTIPLY:
                    result = firstNumber * secondNumber;
                    x=!x;
                    break;
                case DIVIDE:
                    result = firstNumber / secondNumber;
                    x=!x;
                    break;
            }
        }
        return result;
    }

    public static Double scanNumber() throws IllegalArgumentException {
        Scanner scan = new Scanner(System.in);
        boolean isDouble = true;
        Double chosenNumber = null;
        while (isDouble) {
            try {
                chosenNumber = scan.nextDouble();
            } catch (IllegalArgumentException e) {
                System.out.println("Not accurate argument: please choose a double value");
            }
            isDouble = chosenNumber instanceof Double ? false : true;
        }
        return chosenNumber;
    }

    public static String scanMathOperator() throws IllegalArgumentException {
        Scanner scan = new Scanner(System.in);
        boolean isString = true;
        String chosenOperator = null;
        while (isString) {
            try {
                chosenOperator = scan.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Not accurate argument: please choose from the following Strings {+, -, *, /}.");
            }
            isString = chosenOperator instanceof String ? false : true;
        }
        return chosenOperator;
    }

    public static boolean isCorrectInput(String mathOperator) {
        return ADD.equals(mathOperator)
                || SUBTRACT.equals(mathOperator)
                || MULTIPLY.equals(mathOperator)
                || DIVIDE.equals(mathOperator);
    }
}
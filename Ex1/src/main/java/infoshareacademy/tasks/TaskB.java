package infoshareacademy.tasks;

import java.util.Scanner;

public class TaskB {

    private static final String ADD = "+";
    private static final String SUB = "-";
    private static final String MULTIPLY = "*";
    private static final String DIV = "/";

    public static void run() {
        try {
            System.out.println("Podaj pierwszą liczbę: ");
            Double num1 = readNumber();

            System.out.println("Poda drugą liczbę: ");
            Double num2 = readNumber();

            System.out.println("Podaj symbol działania (+,-,*,/): ");
            String sign = readSign();

            Double result = TaskB.calculate(num1, num2, sign);

            System.out.println("Wynik działania "
                    + num1 + " "
                    + sign + " "
                    + num2 + " = "
                    + result);
        } catch (Exception e) {
            System.out.println("Podano niepoprawne dane.. :(");
        }
    }

    private static Double readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static String readSign() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static Double calculate(Double num1, Double num2, String sign) {
        if (isCorrectSign(sign)) {
            switch (sign) {
                case ADD :
                    return num1 + num2;
                case SUB :
                    return num1 - num2;
                case MULTIPLY :
                    return num1 * num2;
                case DIV :
                    return num1 / num2;
            }
        }
        return -1d;
    }

    private static boolean isCorrectSign(String sign) {
        return ADD.equals(sign) || SUB.equals(sign) || MULTIPLY.equals(sign) || DIV.equals(sign);
    }
}

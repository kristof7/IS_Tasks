package com.infoshareacademy.zadanie1.ZadanieB;

import com.infoshareacademy.App;

import java.util.InputMismatchException;

public class ZadanieB {

    public static void calculateTwoNumbersFromScanner(long number1, long number2, String symbol)
            throws InputMismatchException, Exception {

        long result;
        float resultDivided;

        switch (symbol) {
            case "+": {
                result = (long) number1 + (long) number2;
                System.out.println("Wynik działania " + number1 + " " + symbol + " " + number2 +
                        " = " + (long) result);
                App.isFinished = true;
                break;
            }
            case "-": {
                result = (long) number1 - (long) number2;
                System.out.println("Wynik działania " + number1 + " " + symbol + " " + number2 +
                        " = " + (long) result);
                App.isFinished = true;
                break;
            }
            case "*": {
                result = (long) number1 * (long) number2;
                System.out.println("Wynik działania " + number1 + " " + symbol + " " + number2 +
                        " = " + (long) result);
                App.isFinished = true;
                break;
            }
            case "/": {
                if (number2 == 0) {
                    System.out.println("Dzielenie przez 0!");
                    break;
                } else {
                    resultDivided = (float) number1 / number2;
                    System.out.println("Wynik działania " + number1 + " " + symbol + " " + number2 +
                            " = " + (float) resultDivided);
                    App.isFinished = true;
                    break;
                }
            }
            default: {
                System.out.println("Wprowadzony symbol jest niepoprawny, wybierz spośród widocznych w nawiasie (+,-,*,/)");
                break;
            }
        }
    }

}


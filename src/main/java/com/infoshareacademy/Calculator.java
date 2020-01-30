package com.infoshareacademy;

public class Calculator {


    public double calculate(double num1, double num2, String sign) {
        switch (sign) {
            case "+": {
                return num1 + num2;
            }
            case "-": {
                return num1 - num2;
            }
            case "*": {
                return num1 * num2;
            }
            case "/": {
                return num1 / num2;
            }
        }
        return 0.0;

    }


}
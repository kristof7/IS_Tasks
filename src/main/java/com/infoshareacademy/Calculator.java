package com.infoshareacademy;

public class Calculator {
    double num1;
    double num2;
    String  sign;

    public double calculate(double num1, double num2, String sign) {
        switch (this.sign) {
            case "+": {
                return this.num1 + this.num2;
            }
            case "-": {
                return this.num1 - this.num2;
            }
            case "*": {
                return this.num1 * this.num2;
            }
            case "/": {
                return this.num1 / this.num2;
            }
        }
        return 0.0;

    }


}
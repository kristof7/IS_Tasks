package main.java.com.infoshareacademy;

import java.util.Scanner;

public class Calculator {
    private Double a;
    private Double b;
    private Double result;

    public void setA(Double a) {
        this.a = a;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getResult() {
        return result;
    }

    private Double add(Double a, Double b) {
        return a+b;
    }

    private Double subtract(Double a, Double b) {
        return a-b;
    }

    private Double multiple(Double a, Double b) {
        return a*b;
    }
    private Double divide(Double a, Double b) {
        return a/b;
    }

    public void interaction() {
        firstNumber();

        secondNumber();

        char sign = getSign();

        logic(sign);
    }

    private void logic(char sign) {
        switch (sign) {
            case '+':
                setResult(add(getA(), getB()));
                break;
            case '-':
                setResult(subtract(getA(), getB()));
                break;
            case '*':
                setResult(multiple(getA(), getB()));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Nie można dzielić przez 0!");
                } else if (b != 0) {
                    setResult(divide(getA(), getB()));
                }
                break;
        }
        System.out.println("Wynik działania " + getA() + " " + sign + " " + getB() + " = " + getResult());
    }

    private char getSign() {
        char sign = '\u0000';
        System.out.println("Podaj symbol działania (+,-,*,/):");
        while (!(sign == '+' || sign == '-' || sign == '*' || sign == '/')) {
            Scanner scanner = new Scanner(System.in);
            String signScan = scanner.nextLine();
            sign = signScan.charAt(0);
            if (sign == '+' || sign == '-' || sign == '*' || sign == '/') {
                break;
            } else {
                System.out.println("Nie wpisałeś poprawnego znaku działania");
            }
        }
        return sign;
    }

    private void secondNumber() {
        Double secondNumber = null;
        System.out.println("Podaj drugą liczbę:");
        while (secondNumber == null) {
            Scanner scanner = new Scanner(System.in);
            try {
                Double secondScan = scanner.nextDouble();
                secondNumber = secondScan;
            } catch (Exception eTwo) {
                System.out.println("Nie wpisałeś poprawnej drugiej liczby");
            }
        }
        setB(secondNumber);
    }

    private void firstNumber() {
        Double firstNumber = null;
        System.out.println("Podaj pierwszą liczbę:");
        while (firstNumber == null) {
        Scanner scanner = new Scanner(System.in);
            try {
                Double firstScan = scanner.nextDouble();
                firstNumber = firstScan;
            } catch (Exception eOne) {
                System.out.println("Nie wpisałeś poprawnej pierwszej liczby");
            }
        }
        setA(firstNumber);
    }
}

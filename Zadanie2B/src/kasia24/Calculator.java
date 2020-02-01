package kasia24;


import java.util.Scanner;


	import java.util.Scanner;

        public class Calculator {

            public static void main(String[] args) {

                Scanner reader = new Scanner(System.in);
                System.out.print("Wprowadz dwie liczby ");


                double pierwszy = reader.nextDouble();
                double drugi = reader.nextDouble();

                System.out.print("Podaj operator (+, -, *, /): ");
                char operator = reader.next().charAt(0);

                double result;

                switch(operator)
                {
                    case '+':
                        result = pierwszy + drugi;
                        break;

                    case '-':
                        result = pierwszy - drugi;
                        break;

                    case '*':
                        result = pierwszy * drugi;
                        break;

                    case '/':
                        result = pierwszy / drugi;
                        break;


                    default:
                        System.out.printf("Operator jest niepoprawny");
                        return;
                }

                System.out.printf("%.1f %c %.1f = %.1f", pierwszy, operator, drugi, result);
            }
        }


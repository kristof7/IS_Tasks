package src.main.java.infoshareacademy;

import java.util.ArrayList;

public class TaskB {

    public static void taskB() {

        int countNegativeNumbers = 0;
        int countZeroNumbers = 0;
        int countPositiveNumbers = 0;
        int div = 0;
        int sum = 0;


        int[] input = new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5, 0};

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                countNegativeNumbers++;
                div += input[i];
            } else if (input[i] == 0) {
                countZeroNumbers++;
            } else if (input[i] > 0) {
                countPositiveNumbers++;
                sum += input[i];
            }
        }

        int[] output = new int[5];
        output[0] = countNegativeNumbers;
        output[1] = countPositiveNumbers;
        output[2] = countZeroNumbers;
        output[3] = div;
        output[4] = sum;

        System.out.println("Negative number count: "+output[0]);
        System.out.println("positive number count: "+output[1]);
        System.out.println("Zero number count: "+output[2]);
        System.out.println("Sum of all negative numbers: "+output[3]);
        System.out.println("Sum of all positive numbers: "+output[4]);
    }
}

package src.main.java.infoshareacademy;

public class TaskA {

    public static void taskA() {

        int countNegativeNumbers = 0;
        int sum = 0;
        int[] input = new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5};

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                countNegativeNumbers++;
            } else if (input[i] > 0) {
                sum += input[i];
            }
        }

        int[] output = new int[2];
        output[0] = countNegativeNumbers;
        output[1] = sum;

        System.out.println("Negative number count: "+output[0]);
        System.out.println("Sum of all negative numbers: "+output[1]);
    }
}

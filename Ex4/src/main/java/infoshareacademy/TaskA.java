package infoshareacademy;

import java.util.Arrays;
import java.util.Map;

public class TaskA {

    public int[] operationOnElemets(int[] input) {

        if (input == null || input.length == 0) return new int[0];

        var sum = 0;
        var count = 0;

        for (var element : input) {
            if (element > 0) sum += element;
            else if (element < 0) count++;
        }

        return new int[]{count, sum};
    }


    public void printResult() {
        int[] result = operationOnElemets(new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5});
        if (result.length == 2) {
            System.out.println("Liczb ujemnych: " + result[0]);
            System.out.println("Suma dodatnich: " + result[1]);
        }
        System.out.println(Arrays.toString(result) + "\n\n");
    }
}



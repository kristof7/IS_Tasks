package infoshareacademy;

import java.util.Arrays;

public class TaskA {
    static int[] input = {-3, -2, -1, 0, 1, 2, 3, 4, 5};
    static int[] input2 = null;

    public static int sumPositives(int[] arr) throws NullPointerException {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) sum += i;
        }
        return sum;
    }

    public static int countNegatives(int[] arr) throws NullPointerException {
        int count = 0;
        for (int i : arr) {
            if (i < 0) count++;
        }
        return count;
    }

    public static int[] createTable(int[] arr) {
        int[] solution;
        try {
            solution = new int[]{countNegatives(arr), sumPositives(arr)};
            System.out.println(Arrays.toString(solution));
        } catch (NullPointerException e) {
            System.out.println(Arrays.toString(new int[]{}));
            return new int[]{};
        }
        return solution;
    }
}

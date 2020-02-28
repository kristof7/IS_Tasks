package infoshareacademy;

public class TaskA {

    public int[] positiveAndNegative(int[] input) {

        try {
            if (input.length == 0) return new int[]{};
            int positiveTotal = 0;
            int negativeCount = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) positiveTotal += input[i];
                if (input[i] < 0) negativeCount++;
            }
            return new int[]{negativeCount, positiveTotal};
        } catch (NullPointerException e) {
            return new int[] {};
        }
    }
}

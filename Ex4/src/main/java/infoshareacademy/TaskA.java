package infoshareacademy;

public class TaskA {

    public int[] calculate(int[] arr) {
        int negativeCount = 0;
        int positiveSum = 0;

        try {

            for (int i : arr) {
                if (i < 0) {
                    negativeCount++;
                }
            }


            for (int i : arr) {
                if (i > 0) {
                    positiveSum = positiveSum + i;
                }
            }

        }catch (NullPointerException e) {
            return new int[]{};
        }

        return new int[]{negativeCount, positiveSum};


    }
}
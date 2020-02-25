package infoshareacademy;

public class TaskA {

    public int[] arrayOperation(int... numbers) {
        int count = 0;
        int sumResult = 0;
        for (int number : numbers) {
            if (number < 0) count++;
            if (number > 0) sumResult += number;
        }
        return new int[]{count, sumResult};
    }
}

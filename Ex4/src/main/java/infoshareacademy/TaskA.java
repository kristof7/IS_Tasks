package infoshareacademy;

public class TaskA {

    private int negatives = 0;
    private int sumOfPositives = 0;
    private int[] input = {};
    private int[] result = {};

    public TaskA(int... input) {
        this.input = input;
    }

    public int[] taskA() {

        if (input.length>0) {
            for (int inputItem : input) {
                if (inputItem < 0) {
                    negatives++;
                } else if (inputItem > 0) {
                    sumOfPositives = sumOfPositives + inputItem;
                }
            }
            result = new int[]{negatives,sumOfPositives};

        } else result = new int[]{};

        return result;
    }
}

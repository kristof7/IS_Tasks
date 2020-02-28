package infoshareacademy;

import java.util.Arrays;

import static java.lang.System.*;

public class TaskA {
    private int[] input;
    private int[] result;
    private boolean isInputEmpty;

    public void setInput(int[] input) { this.input = input; }

    public void startTaskA(int[] inputTaskA) {
        out.println("\n");
        out.println("Task A:");
        setInput(inputTaskA);
        checkInput();
        printResult();
    }

    private void checkInput() {
        if (input.length == 0) {
            result = new int[]{};
            isInputEmpty = true;
        } else {
            result = new int[]{0, 0};
            isInputEmpty = false;
        }
    }

    private int countNegativeValues() {
        int counter = 0;
        for (int value : input) {
            if (value < 0) {
                counter += 1;
            }
        }
        return counter;
    }

    private int sumPositiveValues() {
        int counter = 0;
        for (int value : input) {
            if (value > 0) {
                counter += value;
            }
        }
        return counter;
    }

    private void printResult() {
        if (!isInputEmpty) {
            result[0] = countNegativeValues();
            result[1] = sumPositiveValues();
        }
        out.println(Arrays.toString(result));
    }
}

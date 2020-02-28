package infoshareacademy;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.*;

public class TaskB {
    private int[] input;
    private Map<String, Integer> results = new HashMap();

    public void setInput(int[] input) { this.input = input; }

    public void startTaskB(int[] inputTaskB) {
        out.println("\n");
        out.println("Task B:");
        setInput(inputTaskB);
        countNegativeValues();
        countPositiveValues();
        countZeros();
        sumNegativeValues();
        sumPositiveValues();
        printResult();
    }

    private void countNegativeValues() {
        int counter = 0;
        for (int value : input) {
            if (value < 0) {
                counter += 1;
            }
        }
        results.put("number of negative numbers", counter);
    }

    private void countPositiveValues() {
        int counter = 0;
        for (int value : input) {
            if (value > 0) {
                counter += 1;
            }
        }
        results.put("number of positive numbers", counter);
    }

    public void countZeros() {
        int counter = 0;
        for (int value : input) {
            if (value < 0) {
                counter += 1;
            }
        }
        results.put("number of zeros", counter);
    }

    private void sumNegativeValues() {
        int counter = 0;
        for (int value : input) {
            if (value < 0) {
                counter += value;
            }
        }
        results.put("sum of negative numbers", counter);
    }

    private void sumPositiveValues() {
        int counter = 0;
        for (int value : input) {
            if (value > 0) {
                counter += value;
            }
        }
        results.put("sum of positive numbers", counter);
    }

    private void printResult() {
        for(Map.Entry<String, Integer> result : results.entrySet()){
            out.println(result.getKey() + "=" + result.getValue());
        }
    }
}

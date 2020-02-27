package infoshareacademy;

import java.util.HashMap;

public class TaskB {


    private int numberOfZeroes = 0;
    private int numberOfPositives = 0;
    private int numberOfNegatives = 0;
    private int sumOfNegatives = 0;
    private int sumOfPositives = 0;
    private int[] input = {};
    private HashMap<String,Integer> result = new HashMap<>();

    public TaskB(int... input) {
        this.input = input;
    }

    public HashMap<String, Integer> TaskB(){
        if (input.length>0) {
            for (int inputItem : input) {
                if (inputItem < 0) {
                    numberOfNegatives++;
                    sumOfNegatives = sumOfNegatives + inputItem;
                } else if (inputItem > 0) {
                    sumOfPositives = sumOfPositives + inputItem;
                    numberOfPositives++;
                } else numberOfZeroes++;
            }
        }
            result.put("number of negative numbers",numberOfNegatives);
            result.put("number of positive numbers",numberOfPositives);
            result.put("number of zeroes",numberOfZeroes);
            result.put("sum of negative numbers",sumOfNegatives);
            result.put("sum of positive numbers",sumOfPositives);

        return result;
    }
}

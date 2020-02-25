package infoshareacademy;

import java.util.*;

public class TaskB {

    public Object operationOnElemets(int[] input) {

        if (input == null || input.length == 0) return new int[0];

        var sumPositive = 0;
        var sumNegative = 0;
        var countNegative = 0;
        var countPositive = 0;
        var countZero = 0;


        for (var element : input) {
            if (element > 0) sumPositive += element;
            else if (element < 0) sumNegative += element;
            if (element < 0) countNegative++;
            else if (element > 0) countPositive++;
            else countZero++;
        }


        int[] myResult;
        Map<String,Integer> myMap = new LinkedHashMap<>();
        myMap.put("Sum of positives numbers: ", sumPositive);
        myMap.put("Sum of negatives numbers: ", sumNegative);
        myMap.put("Number of positives numbers: ", countPositive);
        myMap.put("Number of negatives numbers: ", countNegative);
        myMap.put("Number of zeros: ", countZero);

        System.out.println(myMap.entrySet() + "\n\n");
        return myMap;
        //myResult = new int[]{sumPositive, sumNegative, countNegative, countPositive,countZero};
    }


    public void printResult() {
    operationOnElemets(new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5});
        System.out.println();
        //System.out.println(Arrays.toString(result));
    }
}

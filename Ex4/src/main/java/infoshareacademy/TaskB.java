package infoshareacademy;

import java.util.HashMap;
import java.util.Map;

public class TaskB {

    private int negQuantity = 0;
    private int posQuantity = 0;
    private int zeroQuantity = 0;
    private int negSum = 0;
    private int posSum = 0;
    private Map<String, Integer> myMap = new HashMap<>();


    public Map<String, Integer> exerciseB(int[] input) {
        if (input.length > 0) {
            for (int number : input) {
                if (number < 0) negQuantity++;
                if (number < 0) negSum += number;
                if (number == 0) zeroQuantity++;
                if (number > 0) posQuantity++;
                if (number > 0) posSum += number;

            }
        }
        myMap.put("number of negative numbers", negQuantity);
        myMap.put("number of positive numbers", posQuantity);
        myMap.put("number of zeros", zeroQuantity);
        myMap.put("sum of negative numbers", negSum);
        myMap.put("sum of positive numbers", posSum);
        System.out.println(myMap.entrySet());

        return myMap;
    }
}





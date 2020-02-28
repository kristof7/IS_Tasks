package infoshareacademy;

import java.util.LinkedHashMap;
import java.util.Map;

public class TaskB {
    // umieść tutaj rozwiązanie Zadania B
    public Map<String,Integer> negativesPositivesAndZeroes (int[] input) {
        int negativesCount = 0;
        int positivesCount = 0;
        int zeroesCount = 0;
        int negativesTotal = 0;
        int positivesTotal = 0;
        Map<String, Integer> output =  new LinkedHashMap<>();

        for (int i = 0; i < input.length ; i++) {
            if (input[i] == 0 ) zeroesCount++;
            if (input[i] > 0) {
                positivesCount++;
                positivesTotal+= input[i];
        }
            if (input[i] < 0) {
                negativesCount++;
                negativesTotal+=input[i];
            }

    }
        output.put("number of negative numbers", negativesCount);
        output.put("number of positive numbers", positivesCount);
        output.put("number of zeroes", zeroesCount);
        output.put("sum of negative numbers", negativesTotal);
        output.put("sum of positive numbers", positivesTotal);
        return output;
    }
}

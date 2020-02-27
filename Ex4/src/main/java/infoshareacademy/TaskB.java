package infoshareacademy;

import java.util.HashMap;
import java.util.Map;

public class TaskB {
    public Map<String, Integer> buildMAp(int[] arr) {
        int negativeCount = 0;
        int positiveSum = 0;
        int negativeSum = 0;
        int zeros = 0;
        int positiveCount = 0;

        for (int i : arr) {
            if (i < 0) {
                negativeCount++;
            }
        }

        for (int i : arr) {
            if (i < 0) {
                negativeSum = negativeSum + i;
            }
        }

        for (int i : arr) {
            if (i == 0) {
                zeros++;
            }
        }
        for (int i : arr) {
            if (i > 0) {
                positiveCount++;
            }
        }

        for (int i : arr) {
            if (i > 0) {
                positiveSum = positiveSum + i;
            }
        }
        Map<String,Integer> maps = new HashMap<>();
        maps.put("number of negative numbers", negativeCount);
        maps.put("number of positive numbers", positiveCount);
        maps.put("number of zeros", zeros);
        maps.put("sum of negative numbers", negativeSum);
        maps.put("sum of positive numbers", positiveSum);

        System.out.println(maps.entrySet());
        return maps;
    }
}
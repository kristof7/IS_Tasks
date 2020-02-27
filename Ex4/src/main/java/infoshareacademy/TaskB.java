package infoshareacademy;

import java.util.HashMap;
import java.util.Map;

public class TaskB {

    public static int countPositives(int[] arr) throws NullPointerException{
        int count = 0;
        for (int i : arr) {
            if (i > 0) count++;
        }
        return count;
    }

    public static int sumNegatives(int[] arr) throws NullPointerException {
        int sum = 0;
        for (int i : arr) {
            if (i < 0) sum += i;
        }
        return sum;
    }

    public static int zeroCounter(int[] arr) throws NullPointerException {
        int sum = 0;
        for (int i : arr) {
            if (i == 0) sum++;
        }
        return sum;
    }

    public static Map<String,Integer> createMap(int[] arr){
        Map<String, Integer> map = new HashMap<>();
        try {
            map.put("number of negative numbers", TaskA.countNegatives(arr));
            map.put("number of positive numbers", countPositives(arr));
            map.put("number of zeros", zeroCounter(arr));
            map.put("sum of negative numbers", sumNegatives(arr));
            map.put("sum of positive numbers", TaskA.sumPositives(arr));
        }catch (NullPointerException e){
            return new HashMap<>();
        }
        System.out.println(map.entrySet());
        return map;
    }
}

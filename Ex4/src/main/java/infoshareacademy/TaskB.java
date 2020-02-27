package infoshareacademy;

import java.util.HashMap;
import java.util.Map;

public class TaskB {
    public static void main(String[] args) {
        count(new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5});
    }

    public static void count(int[] input) {
        int sum1 = 0;
        int sum2 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i : input) {
            if (i < 0) {
                sum1 += i;
                count1++;
            } else if (i > 0) {
                sum2 += i;
                count2++;
            } else {
                count3++;
            }
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("number of negative numbers", count1);
        map.put("number of positive numbers", count2);
        map.put("number of zeros", count3);
        map.put("sum of negative numbers", sum1);
        map.put("sum of positive numbers", sum2);

        for (String m : map.keySet()) {
            System.out.println(m + " = " + map.get(m));

        }
    }
}

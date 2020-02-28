package infoshareacademy;

import java.util.HashMap;
import java.util.Map;

public class TaskB<tab> {


    void printResult2() {
        int[] result2 = initMap(new int[]{-3, -2, -1, 0, 1, 2, 3, 4,5});

//        {
//            if (result2.length == 5) {
//                System.out.println(result2[0] + "," + result2[1] + "," + result2[2] + "," +
//                        result2[3] + "," + result2[4]);
//            }
//        }

        Map<String, Integer> asd = new HashMap<>();

            asd.put("number of negative numbers", result2[0]);
            asd.put("number of positive numbers", result2[4]);
            asd.put("number of zeros", result2[3]);
            asd.put("sum of negative numbers", result2[2]);
            asd.put("sum of positive numbers", result2[1]);
        System.out.println(asd);
        }
        private static int[] initMap(int[] input) {
            if (input == null || input.length == 0) return new int[0];
            int sum = 0;
            int count = 0;
            int zero = 0;
            int sumCount = 0;
            int sumOfPositive = 0;

                for (int source : input) {
                if (source > 0) {
                sum += source;
                sumOfPositive++;
            } else if (source < 0) {
                count++;
                sumCount += source;
            }
            if (source == 0) {
                zero++;
            }
        }
        return new int []{count, sum, sumCount, zero, sumOfPositive};
    }


}
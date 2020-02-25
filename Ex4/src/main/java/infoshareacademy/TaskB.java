package infoshareacademy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskB {

    public Map<String, Integer> returnMap(Integer... numbers) {
        Map<String, Integer> sortedNumbers = new HashMap<>();
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        int positiveAdditionResult = 0;
        int negativeAdditionResult = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                if (negativeCounter == 0) {
                    negativeAdditionResult = numbers[i];
                } else {
                    negativeAdditionResult += numbers[i];
                }
                sortedNumbers.put("sum of negative numbers ", negativeAdditionResult);
                negativeCounter++;
                sortedNumbers.put("number of negative numbers ", negativeCounter);
            }

            if (numbers[i] == 0) {
                zeroCounter++;
                sortedNumbers.put("number of zeros ", zeroCounter);
            }
            if (numbers[i] > 0) {
                positiveAdditionResult += numbers[i];
                sortedNumbers.put("sum of positive numbers ", positiveAdditionResult);
                positiveCounter++;
                sortedNumbers.put("number of positive numbers ", positiveCounter);
            }
        }

        return sortedNumbers;
    }

    public void printMap(Map<String, Integer> map) {
        System.out.println(Arrays.asList(map));
    }

}

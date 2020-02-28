package infoshareacademy;

import java.util.HashMap;
import java.util.Map;

public class TaskB {

//Dla tablicy wejściowej input zawierającej liczby typu int zwrócić mapę zawierającą:
//    ilość elementów ujemnych
//    ilość elementów dodatnich
//    ilość zer
//    sumę elementów ujemnych
//    sumę elementów dodatnich
//    Przykład:
//    Wejście: input int[] {-3, -2, -1, 0, 1, 2, 3, 4, 5}
//    Program powinien zwrócić: {number of negative numbers=3, number of positive numbers=5, number of zeros=1, sum of negative numbers=-6, sum of positive numbers=15}

    public static Map<String, Integer> myMapMethod (Integer [] input) {
        Integer counterNegative = 0;
        Integer counterPositive = 0;
        Integer counterZeros = 0;
        Integer sumOfNegative = 0;
        Integer sumOfPositive = 0;

        Map<String, Integer> myMap = new HashMap<>();

        String negativeNumbString = "number of negavitve numbers";
        String positiveNumbString = "number of positive numbers";
        String zerosNumbString = "number of zeros";
        String negativeSum = "sum of negative numbers";
        String positiveSum = "sum of positive numbers";

        for(int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                counterNegative = counterNegative + 1;
                sumOfNegative = sumOfNegative + input[i];
            } else if (input[i] > 0) {
                counterPositive= counterPositive + 1;
                sumOfPositive = sumOfPositive + input[i];
            } else if (input[i] == 0 ){
                counterZeros = counterZeros + 1;
            }
        }

        myMap.put(negativeNumbString, counterNegative);
        myMap.put(positiveNumbString, counterPositive);
        myMap.put(zerosNumbString, counterZeros);
        myMap.put(negativeSum, sumOfNegative);
        myMap.put(positiveSum, sumOfPositive);

        return myMap;
    }
}

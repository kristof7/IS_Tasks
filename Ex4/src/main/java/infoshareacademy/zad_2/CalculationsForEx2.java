package infoshareacademy.zad_2;

import java.util.Map;
import java.util.TreeMap;

public class CalculationsForEx2 {

    public static void result(int[] input) {

        int numberOfNegatives = 0;
        int numberOfPositives = 0;
        int sumOfPositives = 0;
        int sumOfNegatives = 0;
        int numberOfZeros = 0;

        for (int value : input) {
            if (value < 0) {
                numberOfNegatives++;
                sumOfNegatives += value;
            }
            if (value > 0) {
                sumOfPositives += value;
                numberOfPositives++;
            }
            if (value == 0) numberOfZeros ++;
        }

        Map<String, Integer> mapa = new TreeMap<String, Integer>();
        mapa.put("number of negative numbers = ", numberOfNegatives);
        mapa.put("number of positive numbers =", numberOfPositives);
        mapa.put("number of zeros = ",numberOfZeros );
        mapa.put("sum of negative numbers = ", sumOfNegatives);
        mapa.put("sum of positive numbers = ", sumOfPositives);

        for(Map.Entry<String, Integer> map111 : mapa.entrySet()){
            System.out.println(map111.getKey() + " : " + map111.getValue());
        }


    }
}

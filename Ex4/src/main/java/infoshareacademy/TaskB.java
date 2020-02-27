package infoshareacademy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskB {

    private Map<String, Integer> myMap = new HashMap<>();

    public void main() {

        System.out.println("=============Homework====B=============");

        int counterZero = 0;
        int counterNeg = 0;
        int counterPos = 0;
        int sumNeg = 0;
        int SumPos = 0;
        int[] input = {-3, -2, -1, 0, 1, 2, 3, 4, 5};
        for(int i = 0; i < input.length; i++){
            if(input[i] < 0){
                counterNeg +=1;
                sumNeg -= input[i];
            }else if(input[i] > 0){
                counterPos +=1;
                SumPos += input[i];
            }
            else{
                counterZero +=1;
            }
        }
        int[] input_result = {counterNeg,SumPos};
        System.out.println(Arrays.toString(input));

        myMap.put("number of negative numbers=", counterNeg);
        myMap.put("number of positive numbers=", counterPos);
        myMap.put("number of zeros=", counterZero);
        myMap.put("sum of negative numbers=-", sumNeg);
        myMap.put("sum of positive numbers=", SumPos);

        for(Map.Entry<String, Integer> content : myMap.entrySet()){
            System.out.println(content.getKey() + content.getValue());
        }
    }
}

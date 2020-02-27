package infoshareacademy;

import java.util.Arrays;

public class TaskA {

    public static void option1() {
        int counterNeg = 0;
        int sumPos = 0;
        System.out.println("=============Homework====A=1=full===========");
        int[] input = {-3, -2, -1, 0, 1, 2, 3, 4, 5};
        try{
            for (int i = 0; i < input.length; i++) {
                if (input[i] < 0) {
                    counterNeg += 1;
                } else if (input[i] > 0) {
                    sumPos += input[i];
                }
            }
        }catch(NullPointerException e){
        }
        int[] input_result = {counterNeg, sumPos};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(input_result));
    }

    public static void option2() {
        int counterNeg = 0;
        int sumPos = 0;
        System.out.println("=============Homework====A=2=empty===========");
        int[] input = {};
        try{
            for (int i = 0; i < input.length; i++) {
                if (input[i] < 0) {
                    counterNeg += 1;
                } else if (input[i] > 0) {
                    sumPos += input[i];
                }
            }
        }catch(NullPointerException e){
        }
        int[] input_result = {counterNeg, sumPos};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(input_result));
    }

    public static void option3() {
        int counterNeg = 0;
        int sumPos = 0;
        System.out.println("=============Homework====A=3=null===========");
        int[] input = null;
        try{
            for (int i = 0; i < input.length; i++) {
                if (input[i] < 0) {
                    counterNeg += 1;
                } else if (input[i] > 0) {
                    sumPos += input[i];
                }
            }
        }catch(NullPointerException e){
        }
        int[] input_result = {counterNeg, sumPos};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(input_result));
    }
}

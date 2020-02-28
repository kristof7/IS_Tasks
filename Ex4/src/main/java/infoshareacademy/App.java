package infoshareacademy;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Zadanie A
        int[] input = {-3, -2, -1, 0, 1, 2, 3, 4, 5, 0, -5, 12, -6, 2, 0, -2, 30};
        TaskA taskA = new TaskA();
        int[] output = taskA.positiveAndNegative(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
        // Zadanie B
        TaskB taskB = new TaskB();
        Map<String, Integer> myMap;
        myMap = taskB.negativesPositivesAndZeroes(input);
        System.out.println(myMap);
        // Zadanie C
        TaskC taskC = new TaskC();
        String name1 = "Angela";
        String name2 = "Xi";
        String name3 = "Vladimir";
        String name4 = "Donald";
        System.out.println(name1 + " - " +taskC.checkIfLettersRepeat(name1));
        System.out.println(name2 + " - " +taskC.checkIfLettersRepeat(name2));
        System.out.println(name3 + " - " +taskC.checkIfLettersRepeat(name3));
        System.out.println(name4 + " - " +taskC.checkIfLettersRepeat(name4));

        // Zadanie D
        TaskD taskD = new TaskD();
        taskD.howMuchTimeIsLeft();

        // Zadanie E
        TaskE taskE = new TaskE();
        Map<String, Byte> register = new HashMap<>();
        taskE.checkRegister("Eryk",taskE.completeRegister(register));
        

    }
}
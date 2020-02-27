package infoshareacademy;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Zadanie A
        TaskA taskA = new TaskA();
        int[] table = {-3, -2, -1, 0, 1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(taskA.calculate(table)));


        // Zadanie B
        TaskB taskB = new TaskB();
        taskB.buildMAp(table);

        // Zadanie C
        TaskC taskC = new TaskC();
        taskC.chekUniqueLetters("Ola");
        taskC.chekUniqueLetters("Ala");

        // Zadanie D
//nie wiem jak się za to zabrać :(

        // Zadanie E
//nie wiem jak się za to zabrać :(

    }
}
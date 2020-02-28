package infoshareacademy;

import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) {
        // Zadanie A
        TaskA taskA = new TaskA();
        System.out.println("Exercise A: ");
        System.out.println("int[]{" + taskA.printNegQuantity() + ", " + taskA.printPosSum() + "}");

        System.out.println();
        // Zadanie B
        TaskB taskB = new TaskB();
        int[] result = {-3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println("Exercise B: ");
        taskB.exerciseB(result);

        System.out.println();
        // Zadanie C
        System.out.println("Exercise C: ");
        TaskC taskC = new TaskC();
        TaskC taskC2 = new TaskC();
        System.out.println("Adam " + taskC.exerciseC("Adam"));
        System.out.println("Ela " + taskC2.exerciseC("Ela"));

        System.out.println();
        // Zadanie D
        System.out.println("Exercise D: ");
        TaskD taskD = new TaskD();
        taskD.exerciseD();

        System.out.println();
        // Zadanie E
        System.out.println("Exercise E: ");
        TaskE taskE = new TaskE();
        TaskE taskE2 = new TaskE();
        TaskE taskE3 = new TaskE();
        taskE.exerciseE("Karol");
        taskE2.exerciseE("Tomasz");
        taskE3.exerciseE("Artur");
    }
}
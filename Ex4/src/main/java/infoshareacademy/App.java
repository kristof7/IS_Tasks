package infoshareacademy;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // Zadanie A
        System.out.println();
        System.out.println("Zadanie A");
        System.out.println();

        TaskA exA1 = new TaskA(-3,-2,-1,0,1,2,3,4,5);
        TaskA exA2 = new TaskA(0,0,0,0);
        TaskA exA3 = new TaskA();
        TaskA exA4 = new TaskA(1,2,3,4,5);
        TaskA exA5 = new TaskA(-3,-2,-1);

        System.out.println(Arrays.toString(exA1.taskA()));
        System.out.println(Arrays.toString(exA2.taskA()));
        System.out.println(Arrays.toString(exA3.taskA()));
        System.out.println(Arrays.toString(exA4.taskA()));
        System.out.println(Arrays.toString(exA5.taskA()));

        System.out.println();
        // Zadanie B
        System.out.println("Zadanie B");
        System.out.println();

        TaskB exB1 = new TaskB(-3,-2,-1,0,1,2,3,4,5);
        TaskB exB2 = new TaskB(0,0,0,0);
        TaskB exB3 = new TaskB();
        TaskB exB4 = new TaskB(1,2,3,4,5);
        TaskB exB5 = new TaskB(-3,-2,-1);

        System.out.println(Arrays.asList(exB1.TaskB()));
        System.out.println(Arrays.asList(exB2.TaskB()));
        System.out.println(Arrays.asList(exB3.TaskB()));
        System.out.println(Arrays.asList(exB4.TaskB()));
        System.out.println(Arrays.asList(exB5.TaskB()));


        System.out.println();
        // Zadanie C
        System.out.println("Zadanie C");
        System.out.println();

        System.out.println(TaskC.taskC("agata"));
        System.out.println(TaskC.taskC("Pawel"));
        System.out.println(TaskC.taskC("tomek"));
        System.out.println(TaskC.taskC("rEmek"));

        System.out.println();
        // Zadanie D
        System.out.println("Zadanie D");
        System.out.println();

        TaskD taskD = new TaskD();
        taskD.taskDMethod();

        System.out.println();
        // Zadanie E
        System.out.println("Zadanie E");
        System.out.println();


        TaskE taskE = new TaskE();
        taskE.taskE("Agata");
        taskE.taskE("Karol");
        taskE.taskE("Dominika");
    }
}
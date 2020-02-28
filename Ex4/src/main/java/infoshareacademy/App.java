package infoshareacademy;

public class App {
    public static void main(String[] args) {
        // Zadanie A
        int[] inputTaskA = {-3, -2, -1, 0, 1, 2, 3, 4, 5};
        TaskA taskA = new TaskA();
        taskA.startTaskA(inputTaskA);

        // Zadanie B
        int[] inputTaskB = {-3, -2, -1, 0, 1, 2, 3, 4, 5};
        TaskB taskB = new TaskB();
        taskB.startTaskB(inputTaskB);

        // Zadanie C
        String inputTaskC = "Dawid";
        TaskC taskC = new TaskC();
        taskC.startTaskC(inputTaskC);

        // Zadanie D
        TaskD taskD = new TaskD();
        taskD.startTaskD();

        // Zadanie E
        String inputTaskE = "Karol";
        TaskE taskE = new TaskE();
        taskE.startTaskE(inputTaskE);

    }
}
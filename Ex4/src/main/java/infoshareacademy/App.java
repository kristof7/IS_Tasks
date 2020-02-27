package infoshareacademy;

import static infoshareacademy.TaskA.input2;
import static infoshareacademy.TaskA.input;

public class App {
    public static void main(String[] args) {

        // Zadanie A
        System.out.println("___________TASK A ___________");
        TaskA.createTable(input);
        TaskA.createTable(input2);

        // Zadanie B
        System.out.println("___________TASK B ___________");
        TaskB.createMap(input);
        TaskB.createMap(input2);

        // Zadanie C
        System.out.println("___________TASK C ___________");
        TaskC.printSolution("Adam");
        TaskC.printSolution("Jan");

        // Zadanie D
        System.out.println("___________TASK D ___________");
        TaskD.printRemainCourseEndTime();

        // Zadanie E
        System.out.println("___________TASK E ___________");
        TaskE.printGrade("Karol");
        TaskE.printGrade("Tomasz");
        TaskE.printGrade("Artur");
    }
}
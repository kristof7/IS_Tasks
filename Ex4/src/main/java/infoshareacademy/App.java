package infoshareacademy;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class App {
    public static void main(String[] args) throws ParseException {


        // Zadanie A
      TaskA resultA = new TaskA();
      resultA.printResult();

        // Zadanie B

      TaskB resultB = new TaskB();
      resultB.operationOnElemets(new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5});


        // Zadanie C

      TaskC trueOrFalse1 = new TaskC("Ania");
      TaskC trueOrFalse2 = new TaskC("");
      TaskC trueOrFalse3 = new TaskC("Tomek");

        System.out.println(trueOrFalse1.name + " " + trueOrFalse1.check());
        System.out.println(trueOrFalse2.name + " " + trueOrFalse2.check());
        System.out.println(trueOrFalse3.name + " " + trueOrFalse3.check()+ "\n\n");

        // Zadanie D

      TaskD taskD = new TaskD();
      taskD.time();

        // Zadanie E
      TaskE resultE = new TaskE("Tomek");
      TaskE resultE1 = new TaskE("Karol");

      resultE.getTheResult();
      resultE1.getTheResult();

    }
}
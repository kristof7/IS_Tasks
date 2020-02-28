package infoshareacademy;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
// Task A
        TaskA printResult = new TaskA();
        TaskA.printResult();
// Task B
        TaskB printresult2 = new TaskB();
        printresult2.printResult2();
//Task C
        TaskC printresult3 = new TaskC();
        printresult3.result("Adam");
        printresult3.result("Kamil");
    }
}
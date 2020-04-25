import infoshareacademy.tasks.TaskA;
import infoshareacademy.tasks.TaskC;

public class App {
    public static void main(String[] args) {
        new TaskA().run();
        TaskC.getDescription();
    }
}
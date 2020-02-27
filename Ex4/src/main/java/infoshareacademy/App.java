package infoshareacademy;

public class App {
    public static void main(String[] args) {

        TaskA.option1();
        TaskA.option2();
        TaskA.option3();

        TaskB ex_b = new TaskB();
        ex_b.main();

        TaskC ex_c1 = new TaskC();
        ex_c1.hashSet("Ania");
        TaskC ex_c2 = new TaskC();
        ex_c2.hashSet("Ela");
        TaskC ex_c3 = new TaskC();
        ex_c3.hashSet("Adam");

        TaskD.main();

        TaskE ex_e = new TaskE();
        ex_e.main("Marek");
        ex_e.main("Wojtek");
        ex_e.main("Karol");
        ex_e.main("Kamila");

    }
}
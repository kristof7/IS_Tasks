package src.main.java.infoshareacademy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class TaskE {

    public static Map<String, Integer> students = new HashMap<>(5);

    public static void TaskE() {

        Student student1 = new Student("John", 3);
        Student student2 = new Student("Hans", 5);
        Student student3 = new Student();
        student3.setScore(0);
        Student student4 = new Student();
        student4.setName("Steve");

        students.put(student1.getName(), student1.getScore());
        students.put(student2.getName(), student2.getScore());
        students.put(student3.getName(), student3.getScore());
        students.put(student4.getName(), student4.getScore());

        System.out.println("Name Mike: " + returnScore("Mike"));
        System.out.println("Name Steve: " + returnScore("Steve"));
        System.out.println("Name Hans: " + returnScore("Hans"));
        System.out.println("Name John: " + returnScore("John"));
        System.out.println("Name Steve: " + returnScore("Steve"));

        Set<String> keys = students.keySet();
        for (String key : keys) {
            System.out.println(key + " " + students.get(key));

        }

    }

    public static Optional<Integer> returnScore(String name) {

        return Optional.ofNullable(students.get(name));
    }
}


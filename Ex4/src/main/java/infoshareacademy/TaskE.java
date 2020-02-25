package infoshareacademy;

import infoshareacademy.classToTaskE.Homework;
import infoshareacademy.classToTaskE.Student;

import java.util.Map;
import java.util.Optional;

public class TaskE {

    public void showStudentsGrade(String name, Map<Student, Homework> homeworksMap) {
        Student student = new Student(name);
        for (Map.Entry entry : homeworksMap.entrySet()) {
            Optional<Object> optional = Optional.ofNullable(entry.getValue());
            boolean isPresent = optional.isPresent();
            if (entry.getKey().equals(student)) {
                if (isPresent) {
                    System.out.println(entry.getKey() + "oddał pracę domową, ocena = " + entry.getValue());
                    return;
                } else {
                    System.out.println(entry.getKey() + " nie oddał jeszcze pracy domowej ocena = " + entry.getValue());
                    return;
                }
            }
        }
        System.out.println("There is no student with name: " + name);
    }
}

package infoshareacademy.classToTaskE;

import java.util.HashMap;
import java.util.Map;

public class StudentsDiary {

    private Map<Student, Homework> homeworkGrades = new HashMap<>();

    public void completeHomeworkGrades(Student student, Homework homework) {
        this.homeworkGrades.put(student, homework);
    }

    public void printHomework(){
        for (Map.Entry entry: this.homeworkGrades.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }

    public Map<Student, Homework> getHomeworkGrades() {
        return homeworkGrades;
    }
}

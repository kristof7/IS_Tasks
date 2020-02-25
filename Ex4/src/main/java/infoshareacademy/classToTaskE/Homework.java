package infoshareacademy.classToTaskE;

public class Homework {

    private int grade;

    public Homework(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "grade=" + grade +
                '}';
    }
}

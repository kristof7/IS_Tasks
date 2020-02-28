package src.main.java.infoshareacademy;

public class Student {
    private String name;
    private int score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public Student() {

    }

    public Student(String name) {
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

}

package kasia42;

public class Student {


    private int grade;
    private String name;


    //public Employee(int grade) {
       // this.grade = grade;
    //}


    public Student(String name, int grade) {


        this.name = name;

        this.grade = grade;


    }
    public  int getGrade() {

        return this.grade;

    }

    public String getName() {

        return this.name;

    }


}


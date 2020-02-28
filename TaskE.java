package kasia42;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskE{
    public static Optional<Student> findStudent(List<Student> students, String name)
    {
        for(Student e:students)
        {
            if(e.getName().equalsIgnoreCase(name))
            {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }
    public static List<Student> createStudentList()
    {
        List<Student> arrayList=new ArrayList<>();

        Student e1=new Student("John",5);
        Student e2=new Student("Martin",6);
        Student e3=new Student("Mary",2);
        Student e4=new Student("Stephan",4);
        Student e5=new Student("Gary",3);

        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        arrayList.add(e5);

        return arrayList;
    }
    static void method2(String name){
        List<Student> studentList2 = createStudentList();

        Optional<Student> studentOp = findStudent(studentList2,name);
        if(studentOp.isPresent())
        {
            Student stud = studentOp.get();
            System.out.println("Imie studenta: "+stud.getName());
            System.out.println("Ocena studenta"+stud.getGrade());
        }
        else
        {
            System.out.println("Nie ma studenta o imieniu"+name);
        }
    }
    public static void main(String[] args){
TaskE.method2("Gary");
        TaskE.method2("John");
        TaskE.method2("Ola");
        TaskE.method2("Pawel");
        TaskE.method2("Mary");
        TaskE.method2("Martin");
}}











package infoshareacademy;

import java.util.Optional;

public class TaskE {
    public static void main(String[] args) {
        homework("Karol");
    }

    public static void homework(String name) {

        Optional<Integer> grade1 = Optional.of(5);
        Optional<Integer> grade2 = Optional.ofNullable(null);

        String differentName = "Artur";
        boolean didHomework = grade1.isPresent();
        boolean didNotHomework = !(grade2.isPresent());
        boolean differentStudentName = !(differentName.equals(name));

        if(didHomework)
            System.out.println(name + " za zadanie domowe Ex4 uzyskał " + grade1.get().intValue() + " punktów.");
        if(didNotHomework)
            System.out.println(name + " nie wykonał jeszcze zadania domowego.");
        if(differentStudentName)
            System.out.println("Nie znaleziono kursanta o imieniu Artur.");

    }
}

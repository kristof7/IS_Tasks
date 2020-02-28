package infoshareacademy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static java.lang.System.out;

public class TaskE {
    private Map<String, Byte> namesGrades = new HashMap<>();
    private String inputName;

    public void setInputName(String inputName) { this.inputName = inputName; }

    public void fillMap() {
        namesGrades.put("Michał", null);
        namesGrades.put("Andrzej", (byte) 2);
        namesGrades.put("Stanisław", (byte) 4);
        namesGrades.put("Karol", (byte) 5);
        namesGrades.put("Wiesław", (byte) 1);
        namesGrades.put("Lucjan", (byte) 0);
    }

    public void startTaskE(String inputTaskE) {
        fillMap();
        setInputName(inputTaskE);
        out.println("\n");
        out.println("Task E:");
        checkIfStudentExist();
    }

    private void checkIfStudentExist() {
        if (namesGrades.containsKey(inputName)) {
            returnGradeInfo();
        } else {
            out.println("Nie znaleziono kursanta o imieniu " + inputName);
        }
    }

    public void returnGradeInfo() {
        Optional<Byte> studentGrade = Optional.ofNullable(namesGrades.get(inputName));

        if (studentGrade.isPresent()) {
            out.println(inputName + " za zadanie domowe Ex4 uzyskał " +
                    studentGrade.get() + " pkt.");
        } else {
            out.println(inputName + " nie wykonał jeszcze zadania domowego.");
        }
    }
}

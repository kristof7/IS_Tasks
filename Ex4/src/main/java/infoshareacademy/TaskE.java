package infoshareacademy;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TaskE {
    public static void main(String[] args) {

        homework("Karol");
    }

    public static void homework(String studentName) {

        Optional<String> didHomework = Optional.of("pięć");
        Optional<String> didNotHomework = Optional.ofNullable(null);
        Optional<String> differentStudentName = Optional.empty();

        Map<Optional, String> map = new HashMap<>();
        map.put(didHomework, studentName);
        map.put(didNotHomework, studentName);
        map.put(differentStudentName, "domyślna ocena");

        didHomework.ifPresent(s -> System.out.println(studentName + " za zadanie domowe Ex4 uzyskał " + s + " pkt."));
        if (didNotHomework.isPresent()) {
            System.out.println(studentName + " za zadanie domowe Ex4 uzyskał określoną ilość pkt.");
        } else {
            System.out.println(studentName + " nie wykonał jeszcze zadania domowego");
        }
        if (("Artur".equals(studentName))) {
            System.out.println("Znaleziono kursanta o imieniu Artur.");
        } else {
            System.out.println("Nie znaleziono kursanta o imieniu Artur.");
        }
    }
}


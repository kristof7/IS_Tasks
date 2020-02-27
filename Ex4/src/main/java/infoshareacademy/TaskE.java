package infoshareacademy;

import java.util.*;

public class TaskE {

    public static void printGrade(String name) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Karol", 5);
        map.put("Tomasz", null);
        Optional<Integer> grade = Optional.ofNullable(map.get(name));
        if (grade.isPresent()) System.out.println(name + " za zadanie domowe Ex4 uzyskał " + map.get(name) + " pkt.");
        if (grade.isEmpty() && map.containsKey(name)) System.out.println(name + " nie wykonał jeszcze zadania domowego.");
        if (!map.containsKey(name)) System.out.println("Nie znaleziono kursanta o imieniu " + name);
    }
}

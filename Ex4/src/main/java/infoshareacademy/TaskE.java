package infoshareacademy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TaskE {

    public void taskE(String key){

        Map<String, Optional<Integer>> marks = new HashMap<>();

        marks.put("Karol", Optional.of(5));
        marks.put("Damian", Optional.of(3));
        marks.put("Pawel", Optional.of(2));
        marks.put("Agata",Optional.empty());
        marks.put("Iza", Optional.of(4));
        marks.put("Szymon", Optional.of(2));
        marks.put("Marcin",Optional.empty());



        if(marks.containsKey(key)) {
            Optional<Integer> studentMark = marks.get(key);
            if (studentMark.isPresent()) {
                System.out.println(key + " za zadanie domowe Ex4 uzyskal " + studentMark.get() + " pkt.");
            } else System.out.println(key + " nie wykonał/a jeszcze zadania domowego");
        } else System.out.println("Nie ma osoby o takim imieniu");
    }
}

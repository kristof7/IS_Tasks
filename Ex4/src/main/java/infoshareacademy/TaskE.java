package infoshareacademy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TaskE {

    private Map<String, Integer> myMap = new HashMap<>();

    public void main(String name) {

        System.out.println("=============Homework====E=============");

        myMap.put("Karol", 4);
        myMap.put("Marek", null);
        myMap.put("Kamila", 5);

        for (Map.Entry<String, Integer> list : myMap.entrySet()) {
            if (list.getKey().equals(name)) {
                Optional<Integer> optScore = Optional.ofNullable(list.getValue());
                if (optScore.isPresent()) {
                    System.out.println(list.getKey() + ", za zadanie domowe, ma ocene : " + list.getValue());
                    return;
                } else {
                    System.out.println(list.getKey() + ", brak zadania domowego, ocena : " + list.getValue());
                    return;
                }
            }
        }
        System.out.println("Nie znaleziono kursanta o imieniu : " + name);
    }
}

package infoshareacademy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TaskE {

    private String name;
    private Map<String, Integer> myMap = new HashMap<>();

    public void exerciseE(String name) {
        myMap.put("Karol", 5);
        myMap.put("Tomasz", null);
        Optional<Integer> mark = Optional.ofNullable(myMap.get(name));

        if (mark.isPresent()) {
            System.out.println(name + " za zadanie domowe Ex4 uzyskał " + mark.get());
        } else if (mark.isEmpty()){
            System.out.println(name + " nie wykonał jeszcze zadania domowego");
        } else System.out.println("Nie znaleziono kursanta o imieniu " + name);

    }


// umieść tutaj rozwiązanie Zadania E
}

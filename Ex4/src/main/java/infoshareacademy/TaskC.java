package infoshareacademy;

import java.util.HashSet;
import java.util.Set;

public class TaskC {

    private String name;

    private Set<Character> mySet = new HashSet<>();

    public boolean exerciseC(String name) {
        for (Character i : name.toLowerCase().toCharArray()) {
            mySet.add(i);
        }

        if (name.toCharArray().length == mySet.size()) {
            return false;
        }
        return true;
    }
}

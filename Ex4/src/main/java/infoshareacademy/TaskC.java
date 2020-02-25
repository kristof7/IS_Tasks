package infoshareacademy;

import java.util.HashSet;
import java.util.Set;

public class TaskC {

    String name;

    public TaskC(String name) {
        this.name = name;
    }

    protected boolean check() {
        Set<Character> tmp = new HashSet<Character>();
        for(char ch : name.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch) && !tmp.add(ch)) {
                return true;
            }
        }
        return false;
    }
}

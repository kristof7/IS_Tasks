package infoshareacademy;

import java.util.HashSet;
import java.util.Set;


public class TaskC {

    public static boolean taskC(String name) {

        char[] nameChars = name.toLowerCase().toCharArray();
        Set<Character> nameCharsSet = new HashSet<>();

        for (Character nameChar:nameChars) {
            nameCharsSet.add(nameChar);
        }
        return nameChars.length != nameCharsSet.size();
    }
}
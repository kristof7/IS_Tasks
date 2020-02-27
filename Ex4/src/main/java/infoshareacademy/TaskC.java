package infoshareacademy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TaskC {
    public static void main(String[] args) {
        printNameAndResultOfIsLetterRepeatedMethod("Default name");
    }

    public static boolean isLetterRepeated(String param) {
        Set<Character> notRepeatedLettersInParam = new HashSet<>();
        for (char letter : param.toLowerCase().toCharArray()) {
            notRepeatedLettersInParam.add(letter);
        }
        ArrayList<Character> lettersInParam = new ArrayList<>();
        for (char letter1 : param.toLowerCase().toCharArray()) {
            lettersInParam.add(letter1);
        }
        if (lettersInParam.size() <= notRepeatedLettersInParam.size()) {
            return false;
        } else {
            return true;
        }
    }
    public static void printNameAndResultOfIsLetterRepeatedMethod(String param) {
        System.out.println(param + " - " + isLetterRepeated(param));
    }
}

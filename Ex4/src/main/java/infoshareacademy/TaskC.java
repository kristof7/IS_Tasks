package infoshareacademy;

import java.util.*;

public class TaskC {

    public void printResultOfMethodIsReapeated(String parameter) {
        System.out.println(parameter + " " + isRepeatedLetter(parameter));
    }

    public boolean isRepeatedLetter(String parameter) {
        String parameterIgnoreCase = parameter.toLowerCase();
        List<Character> lettersInParameter = new ArrayList<>();
        Set<Character> notReapeatedLetters = new HashSet<>();
        for (char letter : parameterIgnoreCase.toCharArray()) {
            lettersInParameter.add(letter);
        }
        for (Character letter : lettersInParameter) {
            notReapeatedLetters.add(letter);
        }

        return lettersInParameter.size() > notReapeatedLetters.size();
    }


}

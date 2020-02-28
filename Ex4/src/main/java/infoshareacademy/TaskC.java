package infoshareacademy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.System.*;

public class TaskC {
    private String input;

    public void setInput(String input) { this.input = input; }

    public void startTaskC(String inputTaskC) {
        out.println("\n");
        out.println("Task C:");
        setInput(inputTaskC);
        out.println(input + ", " + ifAnyLetterRepeats());
    }

    private boolean ifAnyLetterRepeats() {
        List<Character> lowerLetters = new ArrayList<>();
        Set<Character> uniqueLetters = new HashSet<>();
        for (char l:
             input.toLowerCase().toCharArray()) {
            lowerLetters.add(l);
            uniqueLetters.add(l);
        }
        return uniqueLetters.size() != lowerLetters.size();
    }
}

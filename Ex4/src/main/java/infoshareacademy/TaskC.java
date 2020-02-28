package infoshareacademy;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.AbstractDocument;
import java.lang.reflect.Array;
import java.util.*;

public class TaskC {
    public boolean repeat(String appellation) {
        String nameToLowerCase = appellation.toLowerCase();
        List<Character> firstName = new ArrayList<>();
        Set<Character> name2 = new HashSet<>();
        for (char chars : nameToLowerCase.toCharArray()) {
            firstName.add(chars);
        }
        for (Character chars : firstName) {
            name2.add(chars);

        }
return firstName.size()>name2.size();
    }
  public   void result(String appellation)
    {
        System.out.println(appellation + " "+ repeat(appellation));
    }
}
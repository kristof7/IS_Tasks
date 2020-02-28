package infoshareacademy.zad_3;

import java.util.Set;
import java.util.TreeSet;

public class GetName {
    static public boolean isLetterRepeating(String name){

       char[]nameTable= name.toLowerCase().toCharArray();

        Set<String >nameList= new TreeSet<>();
        for (int i = 0; i < nameTable.length; i++) {
            nameList.add(String.valueOf(nameTable[i]));
        }
        System.out.print(name+" , ");
        return (nameList.size()!=nameTable.length);
    }
}

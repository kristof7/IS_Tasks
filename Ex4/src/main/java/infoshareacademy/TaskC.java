package infoshareacademy;

import java.util.HashSet;
import java.util.Set;

public class TaskC {

    private String name;

    private Set<Character> unique = new HashSet<>();

    public void hashSet(String name){
        System.out.println("=============Homework====C=============");

        for(char c : name.toLowerCase().toCharArray()) {
            unique.add(c);
        }
        System.out.println(name.length());
        System.out.println(unique.size());

        if(name.toCharArray().length == unique.size()){
            System.out.println(name+", false");
        }else{
            System.out.println(name+", true");
        }
    }
}

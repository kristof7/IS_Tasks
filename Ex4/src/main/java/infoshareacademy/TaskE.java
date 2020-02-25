package infoshareacademy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class TaskE {

    String name;

    public TaskE(String name) {
        this.name = name;
    }
    public void getTheResult(){
        Map<String,Integer> theResult = new LinkedHashMap<>();
        theResult.put("Karol", 5);
        theResult.put("Martyna", 4);
        theResult.put("Tomek", null);

        Iterator<String> keySetIterator = theResult.keySet().iterator();
        Iterator<Integer> valueSetIterator = theResult.values().iterator();
        Integer noResult = null;
        while(keySetIterator.hasNext() && valueSetIterator.hasNext()){
            if(!theResult.containsKey(name)){
                System.out.println("Nie znaleziono kursanta o imieniu " + name);break;
            } else if (noResult==theResult.get(name)) {
                System.out.println(name + " nie wykonał jeszcze zadania domowego");
                break;
            }else if (theResult.containsKey(name) ) {
                System.out.println(name + " za zadanie domowe otrzymał Ex4 " + theResult.get(name) + " punktów.");
                break;
            }

        }

    }
}

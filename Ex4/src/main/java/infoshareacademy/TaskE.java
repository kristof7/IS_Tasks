package infoshareacademy;

import java.util.Map;

public class TaskE {

    public Map completeRegister(Map register) {
        register.put("Adam", 2);
        register.put("Beata", 3);
        register.put("Celina", 4);
        register.put("Dawid", null);
        register.put("Eryk", 5);
        return register;
    }

    public void checkRegister(String name, Map register) {
        if (register.containsKey(name)) {
            if (register.get(name) != null) {
                System.out.println(name + " za zadanie domowe Ex4 uzyskał " + register.get(name) + " ptk");
            } else {
                System.out.println(name + " nie wykonał jeszcze zadania domowego");
            }
        } else System.out.println("Nie znaleziono kursanta o imieniu \""+name+"\"");


    }
}


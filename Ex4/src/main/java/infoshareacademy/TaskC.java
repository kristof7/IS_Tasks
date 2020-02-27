package infoshareacademy;

import java.util.HashMap;
import java.util.Map;

public class TaskC {

    public Boolean chekUniqueLetters(String name) {

        Boolean isUnique = name.toLowerCase().matches("^(?:([A-Za-z])(?!.*\\1))*$");

        Map<String, Boolean> map = new HashMap<>();
        map.put(name, !isUnique);

        System.out.println(map.keySet().toString().replace("[","").replace("]","")
                + ", " + map.values().toString().replace("[","").replace("]", ""));

        return !isUnique;

    }

}

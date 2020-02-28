package infoshareacademy;

import java.util.Map;
import java.util.Optional;

public class TaskE {
    // umieść tutaj rozwiązanie Zadania E
    public void showTrue(String name, Map<Disciple, homework> homeworkMap) {
        Disciple disciple = new Disciple(name);
        for (Map.Entry entry : homeworkMap.entrySet()) {
            Optional<Object> disciple1 = Optional.ofNullable(entry.getValue());
            Boolean isPresent = disciple1.isPresent();
            if (entry.getKey().equals(disciple)) ;
            {


            }
        }
    }
}
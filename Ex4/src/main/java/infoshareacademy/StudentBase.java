package infoshareacademy;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class StudentBase {
    private Map<Disciple, homework> jobEvaluation=new HashMap<>();

    public StudentBase(Disciple disciple, homework homework) {
        this.jobEvaluation.put(disciple, homework);

    }

}

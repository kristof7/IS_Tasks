package kasia74;

import java.util.ArrayList;
import java.util.Random;

public class QuestionRandom {
    private Object Matematyka;
    private Object Biologia;
    private Object Chemia;

    public String CategoryGenerator() {
        ArrayList<String> list = new ArrayList<String>(3);

        list.add("Matematyka");
        list.add("Biologia");
        list.add("Chemia");

        Random rand = new Random();
        String randomInt = list.get(rand.nextInt(list.size()));

        return randomInt;
    }

}


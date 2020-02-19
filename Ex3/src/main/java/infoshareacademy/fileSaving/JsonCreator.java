package infoshareacademy.fileSaving;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.Writer;


public class JsonCreator<T> {

    public static <T> void createJson(T object ) {
        try {
            Writer writer = new FileWriter("orders.json");
            new Gson().toJson(object, writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

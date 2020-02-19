package infoshareacademy.fileSaving;

import com.google.gson.Gson;

import java.io.FileReader;
import java.lang.reflect.Type;

public class ObjectFromJsonCreator<T> {

    public static<T> T create (T object){
            Gson gson = new Gson();
            try {
                object = gson.fromJson(new FileReader("orders.json"), (Type) object.getClass());

            } catch (Exception e) {
                e.printStackTrace();
            }

            return object;

    }
}

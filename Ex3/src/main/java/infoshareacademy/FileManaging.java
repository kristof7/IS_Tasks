package infoshareacademy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileManaging {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String ORDERS_JSON_FILE = "Ex3/src/main/java/infoshareacademy/Orders.json";

    public static void saveOrdersToJsonFile(Orders orders) {
        try (Writer writer = new FileWriter(ORDERS_JSON_FILE)) {
            GSON.toJson(orders, writer);
            System.out.println("Orders saved to json file:  " + ORDERS_JSON_FILE);
        } catch (IOException e) {
            System.out.println("Exception during saving json file: " + e.getMessage());
        }
    }

    public static Orders readOrdersJsonFile() {
        try (Reader reader = new FileReader(ORDERS_JSON_FILE)) {
            System.out.println("Reading Orders from json file: " + ORDERS_JSON_FILE);
            Orders orders = GSON.fromJson(reader, Orders.class);
            System.out.println("Orders successfully uploaded: " + orders.getOrderList());
            return orders;
        } catch (IOException e) {
            System.out.println("Orders json file not found or broken: " + e.getMessage());
            return new Orders();
        }
    }
}



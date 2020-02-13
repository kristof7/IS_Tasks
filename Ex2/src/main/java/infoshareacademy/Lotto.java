package infoshareacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lotto {


    public static void start() throws InterruptedException, IOException {
        String range = "podaj zakres liczb: ";
        int a = input(range);
        String number = "podaj ilość liczb do wylosowania: ";
        int b = input(number);
        draw(a, b);
    }

    public static int input(String s) {

        Integer result = null;
        while (result == null) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print(s);
                result = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Proszę podać liczbę całkowitą");
            }
        }
        return result;
    }

    public static void draw(int a, int b) throws InterruptedException, IOException {
        ArrayList<Integer> results = new ArrayList<Integer>();
        ArrayList<Integer> resultsSorted = new ArrayList<Integer>();
        for (int i = 1; i <= a; i++) {
            results.add(i);
        }
        Collections.shuffle(results);
        for (int i = 0; i < b; i++) {
            resultsSorted.add(results.get(i));
        }
        Collections.sort(resultsSorted);
        for (int i = 0; i < resultsSorted.size(); i++) {
            System.out.println(resultsSorted.get(i));
            Thread.sleep(1000);
            }
        saveToFile(resultsSorted);
    }

    public static void saveToFile(ArrayList<Integer> al) throws IOException{
        String wyniki = "Wyniki losowania : ";
        for (int i = 0; i < al.size(); i++){
            wyniki += al.get(i) + " ";
        }
        System.out.println(wyniki);
        Path write = Files.write(Paths.get("Ex2/wyniki.txt"), Collections.singleton(wyniki));
    }
}


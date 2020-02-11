package kasia37;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;


import java.util.*;

public class Lotto {


    public static void start() throws IOException {
        Scanner scan = new Scanner(System.in);

        FileWriter myWriter = new FileWriter("C:\\Users\\Kasia\\Desktop\\lotto.txt");
        try {

            System.out.println("Podaj zakres losowanych liczb");
            int zakres = scan.nextInt();
            System.out.println("Podaj ilosc losowanych liczb");
            int ilosc = scan.nextInt();
            TreeSet<Integer> tablica = new TreeSet<Integer>();
            // TreeSet<Integer> lotto = null;
            for (int i = 0; i < ilosc; i++) {
                // int index = (int) (Math.random() * zakres);
                //double random = Math.random() * zakres + 1;
                Random rand = new Random();

                int index = (int) (Math.random() * zakres);

                //
                tablica.add(index);
                Thread.sleep(1000);
                System.out.println(tablica);
            }


            Iterator<Integer> ascSorting = tablica.iterator();
            while (ascSorting.hasNext()) {
                System.out.println(ascSorting.next());
            }
            myWriter.write(String.valueOf(tablica));
            myWriter.close();
            System.out.println("Zapis do pliku sie powiodl.");

        }
        catch (InputMismatchException e) {
            System.out.println("Nie podales liczby");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}



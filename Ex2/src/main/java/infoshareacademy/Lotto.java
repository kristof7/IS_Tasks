package infoshareacademy;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static java.lang.System.*;

class Lotto {

    public static void lotto() throws IOException, InterruptedException {

        int max = 0;
        while (max == 0) {
            out.println("Give the max number from the range: ");
            try {
                Scanner scanner = new Scanner(in);
                max = scanner.nextInt();
            } catch (Exception e) {
                out.println("This is not a good number. Please try again.");
            }
        }

        int num = 0;
        while (num == 0 || num > max || num == max) {
            try {
                out.println("How many numbers you want to draw?");
                Scanner scanner = new Scanner(in);
                num = scanner.nextInt();
            } catch (Exception e) {
                out.println("This is not a good number. Please try again.");
            }
        }

        out.println("The numbers are: ");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < max; i++) {
            list.add(i);
        }

        Collections.shuffle(list);
        int[] sortedList = new int[num];
        for (int i = 0; i < num; i++) {
            sortedList[i] = list.get(i);
        }

        Arrays.sort(sortedList);

        for (int element: sortedList){
            Thread.sleep(1000);
            out.println(element);
        }

        try (FileWriter writer = new FileWriter("Lotto.txt")) {
            writer.write(Arrays.toString(sortedList) + "\t" + "");
        }

    }
}



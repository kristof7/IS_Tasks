package infoshareacademy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Lotto {

    public static void start() throws IOException {
        int range = 0;
        int amount = 0;
        Scanner s = new Scanner(System.in);
        Set<Integer> bagOfNumbers = new HashSet<>();
        boolean allNumbersCorrect;
        do {
            try {
                System.out.println("Provide the range of numbers: ");
                range = s.nextInt();
                System.out.println("How many numbers you wanna choose: ");
                amount = s.nextInt();
                if (amount <= range) {
                    allNumbersCorrect = true;
                } else {
                    System.out.println("The range has to be bigger than the \"How many numbers you wanna choose\". Try one more time.");
                    return;
                }
            } catch (Exception e) {
                s.nextLine();
                allNumbersCorrect = false;
                System.out.println("Error. Please provide a number");
            }
        } while (!allNumbersCorrect);
        int number;
        while (bagOfNumbers.size() != amount) {
            number = (int) (Math.random() * range) + 1;
            bagOfNumbers.add(number);
        }
        FileWriter file = new FileWriter("filename.txt");
        file.write(String.valueOf(bagOfNumbers));
        file.close();
        List<Integer> sortedList = new ArrayList<>(bagOfNumbers);
        Collections.sort(sortedList);
        for (Integer pickedNumber : sortedList) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println(pickedNumber);
        }
    }
}

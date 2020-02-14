package main.java.infoshareacademy;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Lotto<printDrawing> {
    private Integer rangeNumber;
    private Integer drawSize;
    private Set<Integer> sortedNumbers;

    public void start() throws IOException {
        System.out.println("Hello in Lotto Game!");
        System.out.println("First write an integer number that will be a range for the game. Negative will be converted to positive.");
        System.out.println("Then write an integer number tha will be a numbers of drawn numbers. Negative will be converted do positive.");
        getSizeOfRange();
        getNumberOfDraw();
        checkIfSizeOfRangeIsBigerThanDrawNumber();
        System.out.println("Drawn numbers are:");
        printDrawing(sortingRandomNumbers(generateRandomNumbers()));
        writeResultsToFile();
    }

    private void checkIfWantToPrint() {
        System.out.println("You want to write results in .txt file?");

    }

    private void checkIfSizeOfRangeIsBigerThanDrawNumber() {
        if (getRangeNumber() < getDrawSize()) {
            System.out.println("Range is smaller than numbers of draw number!");
            System.exit(0);
        }
    }

    public void writeResultsToFile() throws IOException
    {
        String fileContent = "Hello, drawn numbers are: ";

        FileWriter fileWriter = new FileWriter("drawOfLottoGame.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(fileContent + sortingRandomNumbers(getSortedNumbers()));
        printWriter.close();
    }

    public Set<Integer> generateRandomNumbers() {
        Integer max = getRangeNumber();
        Integer min = 0;
        Set<Integer> randomNumbers = new HashSet<Integer>();
        while (randomNumbers.size() < getDrawSize()) {
            randomNumbers.add((int) (Math.random() * max - min + 1) + min);
        }
        return randomNumbers;
    }

    public Set<Integer> sortingRandomNumbers(Set<Integer> randomNumbers) {
        Set<Integer> sortingNumbers = new TreeSet(randomNumbers);
        setSortedNumbers(sortingNumbers);
        return sortedNumbers;
    }

    public void printDrawing(Set<Integer> sortedNumbers) {
        try {
            for (int i : sortedNumbers) {
                System.out.println(i + " ");
                Thread.sleep(1000); // 1000ms = 1s
            }
        } catch(InterruptedException ex){
            System.exit(0);
        }
    }

    public void getSizeOfRange() {
        Integer firstNumber = null;
        System.out.println("Write first number - size of range:");
        while (firstNumber == null) {
            Scanner scanner = new Scanner(System.in);
            try {
                Integer firstScan = scanner.nextInt();
                firstNumber = firstScan;
            } catch (Exception eOne) {
                System.out.println("This is not a valid integer number!");
            }
        }
        setRangeNumber(Math.abs(firstNumber));
    }

    public void getNumberOfDraw() {
        Integer secondNumber = null;
        System.out.println("Write second number - number of drawn numbers:");
        while (secondNumber == null) {
            Scanner scanner = new Scanner(System.in);
            try {
                Integer secondScan = scanner.nextInt();
                secondNumber = secondScan;
            } catch (Exception eTwo) {
                System.out.println("This is not a valid integer number!");
            }
        }
        setDrawSize(Math.abs(secondNumber));
    }

    public Integer getRangeNumber() {
        return rangeNumber;
    }

    public Integer getDrawSize() {
        return drawSize;
    }

    public void setRangeNumber(Integer rangeNumber) {
        this.rangeNumber = rangeNumber;
    }

    public void setDrawSize(Integer drawSize) {
        this.drawSize = drawSize;
    }

    public Set<Integer> getSortedNumbers() {
        return sortedNumbers;
    }

    public void setSortedNumbers(Set<Integer> sortedNumbers) {
        this.sortedNumbers = sortedNumbers;
    }
}

package infoshareacademy.lottoRandom;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class LottoService {
    private Set<Integer> randomNumbers;
    private List<Integer> sortedRandomNumberList;

    public List<Integer> getSortedRandomNumberList() {
        return sortedRandomNumberList;
    }

    public Integer takeUserInput() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public String takeUserAnswer() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public void randomNumbers(Integer amount, Integer minRange, Integer maxRangeList) {
        this.randomNumbers = new HashSet<>();
        while (randomNumbers.size() < amount) {
            Integer number = ThreadLocalRandom.current().nextInt(minRange, maxRangeList);
            randomNumbers.add(number);
        }
    }

    public void printRandomNumbers(TimeUnit unit, long delay) {
        List<Integer> randomNumbersList = sortRandomNumbers(randomNumbers);
        for (Integer i : randomNumbersList) {
            makeDelay(unit, delay);
            System.out.print(i + ", ");
        }
    }

    public List<Integer> sortRandomNumbers(Set<Integer> randomNumbers) {
        this.sortedRandomNumberList = new ArrayList<>();
        sortedRandomNumberList.addAll(randomNumbers);
        Collections.sort(sortedRandomNumberList);

        return sortedRandomNumberList;
    }

    public void makeDelay(TimeUnit unit, long delay) {
        try {
            unit.sleep(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

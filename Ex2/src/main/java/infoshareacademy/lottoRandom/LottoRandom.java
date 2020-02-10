package infoshareacademy.lottoRandom;

import infoshareacademy.lottoRandom.parser.ListToStringParser;
import infoshareacademy.lottoRandom.saver.FileSaver;
import infoshareacademy.lottoRandom.saver.FileSaverInterface;

import java.util.concurrent.TimeUnit;

public class LottoRandom {
    private static LottoService lottoService;

    public static void start() {
        lottoService = new LottoService();
        Lotto lotto = new Lotto();

        System.out.println("Please enter two numbers.");
        boolean flag = false;

        do {
            try {
                System.out.println("First - amount of numbers that you want random");
                Integer amount = lottoService.takeUserInput();

                System.out.println(" Second - max value of your range");
                Integer range = lottoService.takeUserInput();

                if (amount <= range) {
                    lotto.setAmount(amount);
                    lotto.setMaxRange(range);
                    flag = true;
                } else {
                    System.out.println("Amount have to be smaller than range. Try again");
                }
            } catch (Exception e) {
                System.out.println("Incorrect format. Please enter numbers try again");
            }
        } while (!flag);

        System.out.println("All random " + lotto.getAmount() + " numbers in range from 1 - " + lotto.getMaxRange());
        lottoService.randomNumbers(lotto.getAmount(), lotto.getMinRange(), lotto.getMaxRange());
        lottoService.printRandomNumbers(TimeUnit.SECONDS, 1);

        System.out.println();
        System.out.println("Do you want save your random? Yes/No");
        String answer = "";

        do {
            answer = lottoService.takeUserAnswer();
            if (answer.equalsIgnoreCase("yes")) {
                saveToFileTXT();
                break;
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("you decide to not save your random");
                break;
            }
            answer = "";
            System.out.println("Please enter YES or NO");
        } while (answer.equals(""));

        System.out.println("Do you want repeat random? Yes/No");
        answer = lottoService.takeUserAnswer();

        if (answer.equalsIgnoreCase("yes")) {
            start();
        } else {
            System.out.println("Random ends.");
        }
    }

    private static void saveToFileTXT() {
        FileSaverInterface fileSaver = new FileSaver();
        ListToStringParser listToStringParser = new ListToStringParser();
        String data = listToStringParser.parse(lottoService.getSortedRandomNumberList());
        boolean wasSaved = false;

        while (!wasSaved) {
            System.out.println("Enter name of you file: ");
            String fileName = lottoService.takeUserAnswer();

            wasSaved = fileSaver.toTXT(data, fileName);
        }
    }
}

package infoshareacademy.lottoRandom.parser;

import java.util.List;

public class ListToStringParser {

    public String parse(List<Integer> sortedRandomNumberList) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer number : sortedRandomNumberList) {
            stringBuilder.append(number).append(",");
        }

        return stringBuilder.toString();
    }
}

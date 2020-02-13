package infoshareacademy;

public class Lotto {
    public static void draw() {
        GetData getData = new GetData();

        getData.getScopeNumber();
        getData.getNumberOfDigits();
        getData.drawNumber();
    }
}

package infoshareacademy;

public class Beverage {
    private String beverage;
    private String numberOfItems;

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(String numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public String addBeverage(String beverage, String numberOfItems) {
        return beverage + " x " + numberOfItems;
    }
}


package infoshareacademy.lottoRandom;

public class Lotto {
    private Integer amount;
    private Integer maxRange;
    private Integer minRange = 1;

    public Integer getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(Integer maxRange) {
        this.maxRange = maxRange;
    }

    public Integer getMinRange() {
        return minRange;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

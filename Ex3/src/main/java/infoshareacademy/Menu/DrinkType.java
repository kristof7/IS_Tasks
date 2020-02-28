package infoshareacademy.Menu;

public enum DrinkType implements ToJson {
    COLA,
    JUICE,
    BEER;

    @Override
    public String toJson() {
        return "\"" + this.toString() + "\"";
    }
}

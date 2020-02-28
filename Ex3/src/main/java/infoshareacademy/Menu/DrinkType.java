package infoshareacademy.Menu;

public enum DrinkType implements ToJson {
    COLA,
    JUICE,
    BEER;

    @Override
    public Strng toJson() {
        return "\"" + this.toString() + "\"";
    }
}

package infoshareacademy.Menu;

public enum PizzaSize implements ToJson {
    BIG,
    MEDIUM,
    SMALL;

    @Override
    public String toJson() {
        return "\"" + this.toString() + "\"";
    }
}

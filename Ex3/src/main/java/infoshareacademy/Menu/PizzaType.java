package infoshareacademy.Menu;

public enum PizzaType implements ToJson {
    PEPPERONI,
    CPRICCIOSA,
    HAWAJSKA;

    @Override
    public String toJson() {
        return "\"" + this.toString() + "\"";
    }
}

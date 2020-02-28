package infoshareacademy.Menu;

public enum SandwichType implements ToJson {
    HAMBURGER,
    KEBAB;

    @Override
    public String toJson() {
        return "\"" + this.toString() + "\"";
    }
}

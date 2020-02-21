package infoshareacademy;

public enum PizzaKind {
    MARGHARITA("Margarita"),
    HAWAI("Hawajska"),
    PEPPERONI("Pepperoni"),
    CAPPRICIOSA("Cappriciosa");

    private String pizzaName;

    PizzaKind(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaName() {
        return pizzaName;
    }


}

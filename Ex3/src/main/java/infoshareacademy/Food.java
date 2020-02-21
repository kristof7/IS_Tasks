package infoshareacademy;

public abstract class Food {

    private final String name;

    public String getIloscFood() {
        return iloscFood;
    }

    private final String iloscFood;

    public static String getName(String name) {
        return name;
    }

    public Food(String name, String iloscFood) {
        this.name = name;

        this.iloscFood = iloscFood;
    }


}

package kasia39;

import java.util.Objects;

public class Food implements Cooking{
   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



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

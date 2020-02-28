package infoshareacademy.drinks;

public abstract class Discount {

    public static final int discount =  -10;

    public boolean colaGratis(String drink){
        if (drink == "cola") {
            return true;
        }
        return false;
    }

}

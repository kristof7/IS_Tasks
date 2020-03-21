package infoshareacademy;

public enum Category {
    IT,
    SPORT,
    GEOGRAFIA,
    POLSKA;

    public static void category(){

        for (Category category : Category.values()) {
            System.out.print(category+", ");
        }
    }
}

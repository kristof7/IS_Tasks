package infoshareacademy;

public enum Category {
    IT,
    SPORT,
    GEOGRAFIA,
    POLSKA;

    public static void test(){

        for (Category category : Category.values()) {
            System.out.print(category+", ");
        }
    }
}

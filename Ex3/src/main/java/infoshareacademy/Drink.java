package infoshareacademy;

public class  Drink
        extends Food{

    public Drink(String name, String iloscFood) {
        super(name, iloscFood);
    }

    public enum Drinks{water,juice,pepsi,beer};
    public static String getTitleD(String title) {
        return title;
    }
    public static void Drinki(Drinks toDrink,int iloscFood) {
        int addWater = 0;
        int addjuice = 0;
        int addPepsi = 0;
        int addBeer = 0;
        switch (toDrink) {

            case water:

                addWater++;
                System.out.println("zamowil wode" + " " + "ilosc butelek" + iloscFood);
                break;
            case juice:

                addjuice++;
                System.out.println("zamowil sok" + " " + "ilosc kartonow" + " " + iloscFood);

                break;
            case pepsi:

                addPepsi++;
                System.out.println("zamowil pepsi" + " " + "ilosc butelek" + " " + iloscFood);
                break;
            case beer:

                addBeer++;
                System.out.println("zamowil piwo" + " " + "ilosc kufli" + " " + iloscFood);
                break;
        }
    }
}




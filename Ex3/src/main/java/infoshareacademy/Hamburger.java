package infoshareacademy;

public class Hamburger extends Food {


    public Hamburger(String name, String iloscFood) {
        super(name, iloscFood);
    }

    public enum Burgers{hamburgery,cheeseBurgery};
    public static void Ham(Burgers burger,int iloscFood) {
        int addHamburger = 0;
        int addCheeseBurger= 0;
        switch (burger) {

            case hamburgery:

                addHamburger++;
                System.out.println("zamowil hamburgery "+ "ilosc "+iloscFood);

                break;
            case cheeseBurgery:

                addCheeseBurger++;
                System.out.println("zamowil chessburgery "+ "ilosc "+iloscFood);
                  break;
        }

}}
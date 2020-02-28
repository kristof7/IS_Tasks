package kasia42;

public class Hamburger extends Food implements Cooking2 {


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
                 Cooking2.prepare();{
                System.out.println("Na przygotownaie czeka sie 6 minut");
                Cooking2.box(); {
                    System.out.println("Hamburger bedzie zapakowany osobno");
                }
            }
                break;
            case cheeseBurgery:

                addCheeseBurger++;
                System.out.println("zamowil chessburgery "+ "ilosc "+iloscFood);
                Cooking2.prepare();{
                System.out.println("Na przygotownaie czeka sie 5 minut");
                } Cooking2.box(); {
                System.out.println("Hamburger bedzie zapakowany osobno");
            }


                  break;

        }

}}
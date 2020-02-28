package kasia42;


public class Summary {

    public static String titlePi;
    private static String title3;
    private static int ilosc;

    public static void printOrderOnScreen(String orderS, String adres, int telephone) {

        System.out.println("Klient" + " " + OrderClient.getClient(orderS) +" "+"zamieszkaly na"+" "+OrderClient.getAdress(adres)+" "+"o telefonie" + " " + OrderClient.getTelephone(telephone));
    }

//Tu przydalaby sie pętla na ilosc zamowionych pizz
        public static void printOrderP(String titlePi,int ilosc,PizzaChoose.Pizza3 pizza2){
            PizzaChoose.Pizz(titlePi, ilosc, pizza2);

        }
        public static void printOrderH(Hamburger.Burgers hamb,int ilosc2) {
        Hamburger.Ham(hamb, ilosc2);
        }
         public static void printOrderD(Drink.Drinks dri, int ilosc3){
            Drink.Drinki(dri,ilosc3);


    }

}




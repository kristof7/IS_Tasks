package kasia42;

public class OrderClient {



    public static String getClient(String client) {
        return client;
    }



    //public static int toJSONString() {
    //}
    public void setClient(String client) {
        this.client = client;
    }

    public static String getAdress(String adress) {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public static int getTelephone(int telephone) {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    private static String client;
    private static String adress;
    private static int telephone;

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        OrderClient.title = title;
    }

    public static String title;



    public void setClient2(String orderS ,String adres,int telephone){

        System.out.println("Klient" + " " + OrderClient.getClient(orderS) +" "+"zamieszkaly na"+" "+OrderClient.getAdress(adres)+" "+"o telefonie" + " " + OrderClient.getTelephone(telephone));
    }

    public  void printOrderP(String titlePi,int ilosc,PizzaChoose.Pizza3 pizza2){
        PizzaChoose.Pizz(titlePi, ilosc, pizza2);

    }
    public  void printOrderH(Hamburger.Burgers hamb,int ilosc2) {
        Hamburger.Ham(hamb, ilosc2);
    }
    public void printOrderD(Drink.Drinks dri, int ilosc3) {
        Drink.Drinki(dri, ilosc3);


    }


    }

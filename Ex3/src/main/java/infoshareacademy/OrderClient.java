package infoshareacademy;

public class OrderClient {



    public static String getClient(String client) {
        return client;
    }

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


}

package infoshareacademy;

import java.util.HashMap;

public class Order extends OrderClient {

    private OrderClientPaymentMethod.PaymentMethod platnosc;

    public void order(String imie, String adres, String telefon, OrderClientPaymentMethod.PaymentMethod platnosc){
        System.out.println("OPISOWKA :  imie : "+imie+", adres : "+adres+", telefon : "+telefon+", platnosc: "+platnosc);

    }

    @Override
    public void orderJedzenie(String... produkty) throws InterruptedException {
        HashMap<String, Double> mapaProduktow = new HashMap<String, Double>();
        mapaProduktow.put("HawajskaDuza",26.00);
        mapaProduktow.put("HawajskaSrednia",23.00);
        mapaProduktow.put("HawajskaMala",20.00);
        mapaProduktow.put("CapricciosaaDuza",27.00);
        mapaProduktow.put("CapricciosaSrednia",24.00);
        mapaProduktow.put("CapricciosaaMala",21.00);
        mapaProduktow.put("PepperoniDuza",25.00);
        mapaProduktow.put("PepperoniSrednia",22.00);
        mapaProduktow.put("PepperoniaMala",19.00);
        mapaProduktow.put("Cola",10.00);
        mapaProduktow.put("Piwo",11.00);
        mapaProduktow.put("Sok",9.00);
        mapaProduktow.put("Hamburger",19.00);

        double rachunek = 00.00;

        for (String i: produkty) {
            if(mapaProduktow.containsKey(i)){
                rachunek += mapaProduktow.get(i);
            }
        }
        System.out.println("kwota calkowita zamówienia : "+rachunek+" PLN");
    }
}
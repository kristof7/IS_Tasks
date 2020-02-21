package infoshareacademy;

import static infoshareacademy.OrderClientPaymentMethod.PaymentMethod.GOTOWKA;
import static infoshareacademy.OrderClientPaymentMethod.PaymentMethod.KARTA;

public class PizzeriaApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Pizzeria App :-)");

        Order zamowienie = new Order();
        zamowienie.order("Adam","Pogodna 13","100100100", KARTA);
        zamowienie.orderJedzenie("PepperoniDuza", "Sok", "Sok");

        zamowienie.order("Anna","Długa 18/3","300300300", KARTA);
        zamowienie.orderJedzenie("HawajskaMala", "CapricciosaSrednia", "Cola");

        zamowienie.order("Paweł","Grunwaldzka 472b","500500500", GOTOWKA);
        zamowienie.orderJedzenie("Hamburger", "Piwo");
    }
}




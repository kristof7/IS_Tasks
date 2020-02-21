package infoshareacademy.service;

public interface OrderInt {
//    String getClientsName();
//    String getClientsAddress();
//    String getClientsPhone();
    float getOrderPrice(Order... orders);
    float getOrderMass(Order... orders);

}

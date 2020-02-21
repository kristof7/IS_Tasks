package infoshareacademy;

public class Order{

    Customer customer;
    OrderItem[] orderItems;


    Order(Customer customer,OrderItem... orderItems){
        this.customer = customer;
        this.orderItems = orderItems;
        System.out.println("klient: "+customer.getName()+" z ulicy: "+customer.getAddress()+", nr telefonu: "+customer.getTelNumber());
        for (OrderItem orderItem: orderItems) {
            orderItem.displayItem();
        }
        System.out.println("\n");
    }

}

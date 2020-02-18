package infoshareacademy;

public class Client {

    String clientName;

    Address address;

    String phoneNUmber;

    public Client(String clientName, Address address, String phoneNUmber) {
        this.clientName = clientName;
        this.address = address;
        this.phoneNUmber = phoneNUmber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", address=" + address +
                ", phoneNUmber='" + phoneNUmber + '\'' +
                '}';
    }
}

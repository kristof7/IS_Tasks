package infoshareacademy.Restaurant;

public class Client {
    private String clientName;
    private String clientAddress;
    private String clientPhone;

    public Client(String clientName, String clientAddress, String clientPhone) {
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public String getClientPhone() {
        return clientPhone;
    }
}

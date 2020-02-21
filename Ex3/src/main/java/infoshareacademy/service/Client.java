package infoshareacademy.service;

public class Client {
    int clientID;
    String name;
    String address;
    String phone;

    public Client(int clientID, String name, String address, String phone) {
        this.clientID = clientID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name + ", " + address + ", tel: " + phone;
    }
}

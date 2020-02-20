package infoshareacademy.aboutClient;

import infoshareacademy.aboutClient.Adress;

public class Client extends Adress{

    String name;
    String phoneNumber;

    public Client(String name, String street, String city, String phoneNumber) {
        super(street, city);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void createClient() {
        System.out.println(getName() + ", adress : " + getStreet() + "/" + getCity() + ", phone : " + getPhoneNumber() + ".");
    }
}

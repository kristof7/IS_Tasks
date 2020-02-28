package infoshareacademy.customer;

public class Customer{
    private String name;
    private String adresse;
    private int phoneNumber;

    public Customer(String name, String adresse, int phoneNumber) {
        this.name = name;
        this.adresse = adresse;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

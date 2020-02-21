package infoshareacademy.customerService;

public class Customer {

    private String name;
    private String adress;
    private String phone;

    Customer(String name, String adress, String phone) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }
}

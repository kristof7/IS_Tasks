package infoshareacademy;

public abstract class Customer {

    private String name;
    private String address;
    private int telephoneNumber;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    Customer(String name, String address, int telephoneNumber) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    protected abstract boolean discount ();
}

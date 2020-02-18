package infoshareacademy;

public class Address {
    String street;

    String City;

    public Address(String street, String city) {
        this.street = street;
        City = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}

package infoshareacademy;

public class Customer{
    private String name;
    private String address;
    private String telNumber;

     Customer(String name, String address, String telNumber){
        this.name = name;
        this.address = address;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public String getTelNumber() {
        return telNumber;
    }
}

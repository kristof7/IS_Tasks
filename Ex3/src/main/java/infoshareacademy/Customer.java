package infoshareacademy;

public class Customer extends Adres {
    private  String name;


    public Customer(String name,String city, String street, Integer houseNumber) {
        super(city, street, houseNumber);
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void createCustomer() { System.out.println(getName()+" " + getCity()+" "+getStreet()+" "+getHouseNumber());
    }
}


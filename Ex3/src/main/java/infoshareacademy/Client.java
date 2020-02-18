package infoshareacademy;

public class Client {
    private String name;
    private String adress;
    private String mobileNumber;

    public Client(String name, String adress, String mobileNumber) {
        this.name = name;
        this.adress = adress;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getClientDetails () {
        return name + ", " + adress + ", " + mobileNumber;
    }
}


package infoshareacademy;

public abstract class Customer {
    private String name;
    private String address;
    private String telephonNumber;


    public void setCustomerData(String name, String address, String telephonNumber){
        this.name = name;
        this.address = address;
        this.telephonNumber = telephonNumber;
    }

    public void getCustomerData(){
        System.out.println("Imię zamawiającego: "+name);
        System.out.println("Adres zamawiającego: "+address);
        System.out.println("Nr telefonu zamawiającego: "+telephonNumber);
        System.out.println("Zamówienie:");
    }
    abstract void setOrder(TypeOfFood typeOfFood, Integer amountOfFoods);
    abstract void setOrder(TypeOfFood typeOfFood, PizzaType pizzaType, PizzaSize pizzaSize, Integer amountOfFoods );
    abstract void getOrder();

}
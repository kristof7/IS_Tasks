package infoshareacademy;

public abstract class Adres {
   private String city;
   private String street;
   private Integer houseNumber;

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getStreet() {
      return street;
   }

   public void setStreet(String street) {
      this.street = street;
   }

   public Integer getHouseNumber() {
      return houseNumber;
   }

   public void setHouseNumber(Integer houseNumber) {
      this.houseNumber = houseNumber;
   }

   public Adres(String city, String street, Integer houseNumber) {
      this.city = city;
      this.street = street;
      this.houseNumber = houseNumber;
   }

   protected abstract void createCustomer();
}


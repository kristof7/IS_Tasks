package infoshareacademy;

public class Pizza {

    String type;
    Size pizza1 = Size.LARGE;
    Size pizza2 = Size.MEDIUM;
    Size pizza3 = Size.SMALL;
    Drinks d1 = Drinks.BEER;
    Drinks d2 = Drinks.COLA;
    Drinks d3 = Drinks.JUICE;
    public Size getPizza1() {
        return pizza1;
    }

    public void setPizza1(Size pizza1) {
        this.pizza1 = pizza1;
    }

    public Size getPizza2() {
        return pizza2;
    }

    public void setPizza2(Size pizza2) {
        this.pizza2 = pizza2;
    }

    public Size getPizza3() {
        return pizza3;
    }

    public void setPizza3(Size pizza3) {
        this.pizza3 = pizza3;
    }

    public Pizza(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pizza(Size pizza1) {
        this.pizza1 = pizza1;
    }

    public static void largePizza() {
        System.out.println(Size.LARGE);
    }
        public static void mediumPizza() {
            System.out.println(Size.MEDIUM);
        }
            public static void smallPizza() {
                System.out.println(Size.SMALL);
            }
                public Pizza(String type, Size pizza1) {
                    this.type = type;
                    this.pizza1 = pizza1;

                }

    public Drinks getD1() {
        return d1;
    }

    public void setD1(Drinks d1) {
        this.d1 = d1;
    }

    public Drinks getD2() {
        return d2;
    }

    public void setD2(Drinks d2) {
        this.d2 = d2;
    }

    public Drinks getD3() {
        return d3;
    }

    public void setD3(Drinks d3) {
        this.d3 = d3;
    }

    static   void getInstance() {
        System.out.println(" Pizza capriciosa"+ " O rozmiarze " +Size.LARGE + " i drink  " +  Drinks.BEER);}
        static   void getInstance1() {
        System.out.println("Pizza peperroni "+ "o rozmiarze  " +Size.MEDIUM + "i drink " +  Drinks.COLA);}
        static   void getInstance2 () {
        System.out.println("Pizza Havajska" + " o rozmiarze  " +Size.SMALL + " i drink  " +  Drinks.JUICE);

    }


}




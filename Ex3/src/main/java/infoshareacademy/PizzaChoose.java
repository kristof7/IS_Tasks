package infoshareacademy;


public abstract class PizzaChoose extends Food{
    public PizzaChoose(String name, String iloscFood) {
        super(name, iloscFood);
    }



    enum Pizza3 {small, medium, large}

    public static String getTitle2(String title2) {
        return title2;
    }
    //String title2 = null;
    public static void Pizz( String title2,int iloscFood,Pizza3 pizzasize) {
        int addSmallPizza = 0;
        int addMediumPizza = 0;
        int addLargePizza = 0;
        switch (pizzasize) {

            case small:

                PizzaChoose.getTitle2(title2);
                addSmallPizza++;
                // System.out.println("zamowil mala pizze "+PizzaChoose.getTitle2(title2)+" "+"ilosc"+" "+ilosc);
                System.out.println("zamowil mala pizze "+Food.getName(title2)+" "+"ilosc"+" "+iloscFood);

                break;
            case medium:
                PizzaChoose.getTitle2(title2);

                addMediumPizza++;
                System.out.println("zamowil srednia pizze "+ PizzaChoose.getTitle2(title2)+" "+"ilosc"+" "+iloscFood);
                break;
            case large:
                PizzaChoose.getTitle2(title2);
                addLargePizza++;
                System.out.println("zamowil duza pizze"+PizzaChoose.getTitle2(title2)+" "+"ilosc"+" " +iloscFood);
                break;}


    }}
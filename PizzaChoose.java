package kasia42;



public class PizzaChoose extends Food implements Cooking{



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
                 Cooking.bake();{
                System.out.println("mala pizza piecze sie 10 minut");
            }     Cooking.cut();{
                System.out.println("Pizza krojona na 4 kawalki");
            }
                break;
            case medium:
                PizzaChoose.getTitle2(title2);

                addMediumPizza++;
                System.out.println("zamowil srednia pizze "+ PizzaChoose.getTitle2(title2)+" "+"ilosc"+" "+iloscFood);
                Cooking.bake();{
                System.out.println("srednia pizza piecze sie 15 minut");
                }
            Cooking.cut();{
                System.out.println("Pizza krojona na 6 kawalkow");
            }
                break;
            case large:
                PizzaChoose.getTitle2(title2);
                addLargePizza++;

                System.out.println("zamowil duza pizze"+PizzaChoose.getTitle2(title2)+" "+"ilosc"+" " +iloscFood);
                Cooking.bake();{
                System.out.println("duza pizza piecze sie 20 minut");
            }
            Cooking.cut();{
                System.out.println("Pizza krojona na 8 kawalkow");
            }
                break;}


    }}
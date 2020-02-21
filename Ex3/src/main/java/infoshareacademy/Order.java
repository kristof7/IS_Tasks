package infoshareacademy;

import infoshareacademy.Drinks.Drink;
import infoshareacademy.Meals.Meal;

import java.util.ArrayList;

class Order {
    String clientNumber;
    String clientName;
    String clientAdress;
    ArrayList<Meal> mealsList = new ArrayList<>();
    ArrayList<Drink> drinksList = new ArrayList<>();
    double orderValue;

    Order(String clientNumber, String clientName, String clientAdress) {
        this.clientNumber = clientNumber;
        this.clientName = clientName;
        this.clientAdress = clientAdress;
        this.orderValue = 0;
    }

    void printOrderDetails() {
        System.out.println("Client Name: " + clientName);
        System.out.println("Client number: " + clientNumber);
        System.out.println("Client adress: " + clientAdress);
        System.out.println("\nMEALS:");
        if (mealsList.size() == 0) {
            System.out.println("No meals ordered.");
        } else {
            for (Meal meal : mealsList) {
                System.out.print("   " + (mealsList.indexOf(meal)+1) + ". ");
                meal.printMealDetails();
            }
        }
        System.out.println("\n DRINKS:");
        if (drinksList.size() == 0) {
            System.out.println("No drinks ordered.");
        } else {
            for (Drink drink : drinksList) {
                System.out.print("   " + (drinksList.indexOf(drink)+1) + ". ");
                drink.printDrinkDetails();
            }
        }
        System.out.println("\nTotal order value: " + orderValue);
    }

    void addMeal(Meal meal) {
        this.mealsList.add(meal);
        orderValue += meal.mealPrice;
    }

    void addDrink(Drink drink) {
        this.drinksList.add(drink);
        orderValue += drink.drinkPrice;
    }
}

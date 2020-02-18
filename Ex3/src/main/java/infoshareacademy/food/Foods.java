package infoshareacademy.food;

import infoshareacademy.orders.OrderType;

import java.util.*;

public class Foods {
    Map<OrderType, ArrayList<Food>> foodsMap = new HashMap<>();

    List<Food> allFoods = new ArrayList<>();

    public Map<OrderType, ArrayList<Food>> getFoodsMap() {
        return foodsMap;
    }

    public List<Food> getAllFoods() {
        return allFoods;
    }

    public Foods(Food... foods) {
        List<Food> foodList;
        foodsMap = new HashMap<>();
        allFoods = Arrays.asList(foods);

        for (Food food : foods) {
            OrderType orderType = food.getOrderType();
            foodsMap.putIfAbsent(orderType, new ArrayList<>());
            foodList = foodsMap.get(orderType);
            foodList.add(food);
        }

    }

    @Override
    public String toString() {
        return "Foods{" +
                "allFoods=" + allFoods +
                '}';
    }
}

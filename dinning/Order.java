package dinning;
import java.util.Map;

import Order;
import menu;

import java.util.HashMap;

public class Order implements IOrder {
    Map<String, Integer> orders;

    public Order() {
        // this will create a new order
        this.orders = new HashMap<>();
    }

    public void addNewMeal(String meal, int quantity) {
        // this will add the meal and quantity to the order
        orders.put(meal, quantity);
        System.out.println("Meal added");
        return;
    }

    public Map<String, Integer> getOrder() {
        return orders;
    }

    public int getTotalCost() {
        int total = 0;
        for (int quantity : orders.values()) {
            total += quantity;
        }
        return total;
    }
}
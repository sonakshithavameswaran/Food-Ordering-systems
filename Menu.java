import java.util.ArrayList;

public class Menu {
    private ArrayList<FoodItem> foodItems;

    public Menu() {
        foodItems = new ArrayList<>();

        foodItems.add(new FoodItem(1, "Pizza", 250));
        foodItems.add(new FoodItem(2, "Burger", 150));
        foodItems.add(new FoodItem(3, "Biryani", 220));
        foodItems.add(new FoodItem(4, "Fried Rice", 180));
        foodItems.add(new FoodItem(5, "Pasta", 200));
        foodItems.add(new FoodItem(6, "French Fries", 100));
        foodItems.add(new FoodItem(7, "Ice Cream", 80));
        foodItems.add(new FoodItem(8, "Soft Drink", 60));
    }

    public void displayMenu() {
        System.out.println("\n========== FOOD MENU ==========");

        for (FoodItem food : foodItems) {
            food.displayFood();
        }

        System.out.println("===============================");
    }

    public FoodItem getFoodItem(int id) {
        for (FoodItem food : foodItems) {
            if (food.getId() == id) {
                return food;
            }
        }

        return null;
    }
}
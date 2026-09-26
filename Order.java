import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> orderedItems;

    public Order() {
        orderedItems = new ArrayList<>();
    }

    public void addItem(FoodItem food) {
        orderedItems.add(food);
        System.out.println(food.getName() + " added to your order.");
    }

    public void displayOrder() {
        if (orderedItems.isEmpty()) {
            System.out.println("\nYour order is empty.");
            return;
        }

        System.out.println("\n========== YOUR ORDER ==========");

        double total = 0;

        for (FoodItem food : orderedItems) {
            System.out.println(food.getName() + " - Rs." + food.getPrice());
            total += food.getPrice();
        }

        System.out.println("-------------------------------");
        System.out.println("Total Amount: Rs." + total);
        System.out.println("===============================");
    }

    public double calculateTotal() {
        double total = 0;

        for (FoodItem food : orderedItems) {
            total += food.getPrice();
        }

        return total;
    }

    public boolean isEmpty() {
        return orderedItems.isEmpty();
    }
}
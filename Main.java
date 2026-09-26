import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("      ONLINE FOOD ORDERING SYSTEM");
        System.out.println("======================================");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, phone, address);
        Menu menu = new Menu();
        Order order = new Order();

        int choice;

        do {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. View Food Menu");
            System.out.println("2. Add Food to Order");
            System.out.println("3. View Order");
            System.out.println("4. Place Order");
            System.out.println("5. Exit");
            System.out.println("===============================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    menu.displayMenu();
                    break;

                case 2:
                    menu.displayMenu();

                    System.out.print("Enter food ID: ");
                    int foodId = scanner.nextInt();

                    FoodItem food = menu.getFoodItem(foodId);

                    if (food != null) {
                        order.addItem(food);
                    } else {
                        System.out.println("Invalid food ID.");
                    }

                    break;

                case 3:
                    customer.displayCustomerDetails();
                    order.displayOrder();
                    break;

                case 4:
                    if (order.isEmpty()) {
                        System.out.println("\nPlease add food items before placing the order.");
                    } else {
                        customer.displayCustomerDetails();
                        order.displayOrder();

                        System.out.println("\nOrder placed successfully!");
                        System.out.println("Total Amount: Rs." + order.calculateTotal());
                        System.out.println("Thank you for ordering!");
                    }
                    break;

                case 5:
                    System.out.println("\nThank you for using Online Food Ordering System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
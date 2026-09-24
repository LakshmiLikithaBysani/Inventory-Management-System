import java.util.Scanner;

public class InventoryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] products = new String[10];
        int[] quantities = new int[10];

        int productCount = 0;

        while (true) {

            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Inventory");
            System.out.println("3. Update Quantity");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (productCount < 10) {

                        System.out.print("Enter product name: ");
                        products[productCount] = sc.nextLine();

                        System.out.print("Enter quantity: ");
                        quantities[productCount] = sc.nextInt();

                        productCount++;

                        System.out.println("Product added successfully!");

                    } else {
                        System.out.println("Inventory is full!");
                    }

                    break;

                case 2:

                    if (productCount == 0) {

                        System.out.println("No products available.");

                    } else {

                        System.out.println("\n--- Inventory ---");

                        for (int i = 0; i < productCount; i++) {

                            System.out.println(
                                (i + 1) + ". " +
                                products[i] +
                                " - Quantity: " +
                                quantities[i]
                            );
                        }
                    }

                    break;

                case 3:

                    if (productCount == 0) {

                        System.out.println("No products available.");

                    } else {

                        System.out.println("\n--- Products ---");

                        for (int i = 0; i < productCount; i++) {
                            System.out.println(
                                (i + 1) + ". " + products[i]
                            );
                        }

                        System.out.print("Select product number: ");
                        int product = sc.nextInt();

                        if (product >= 1 && product <= productCount) {

                            System.out.print("Enter new quantity: ");
                            int newQuantity = sc.nextInt();

                            quantities[product - 1] = newQuantity;

                            System.out.println("Quantity updated successfully!");

                        } else {
                            System.out.println("Invalid product number!");
                        }
                    }

                    break;

                case 4:

                    System.out.println(
                        "Thank you for using Inventory Management System!"
                    );

                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}

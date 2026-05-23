/**
 * Lab 3 - Exercise 3: [Inventory Management System]
 * Student Name: [Yanina İsak]
 * Student ID: [230446612]
 * Date: [12.03.2026]
 */
import java.util.Scanner;
public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter initial inventory count: ");
        int inventory = keyboard.nextInt();
        System.out.println("\n========== INVENTORY TRANSACTION LOG ==========");
        System.out.printf("%-20s %10s %12s%n", "Transaction", "Change", "Balance");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-20s %10s %12d%n", "Initial Stock", "---", inventory);
        System.out.print("\nEnter number of items sold: ");
        int sold = keyboard.nextInt();
        inventory -= sold;
        System.out.printf("%-20s %10d %12d%n", "Sale", -sold, inventory);
        System.out.print("Enter number of items returned: ");
        int returned = keyboard.nextInt();
        inventory += returned;
        System.out.printf("%-20s %10d %12d%n", "Return", returned, inventory);
        System.out.print("Enter new shipment quantity: ");
        int shipment = keyboard.nextInt();
        inventory += shipment;
        System.out.printf("%-20s %10d %12d%n", "Shipment", shipment, inventory);
        System.out.println("One item damaged during inspection...");
        inventory -- ;
        System.out.printf("%-20s %10d %12d%n", "Damaged Item", -1, inventory);
        System.out.println("One item passed quality check...");
        inventory ++ ;
        System.out.printf("%-20s %10d %12d%n", "Quality Approved", 1, inventory);
        System.out.println("===============================================");
        System.out.printf("%-20s %10s %12d%n", "FINAL INVENTORY", "---", inventory);
        System.out.println("===============================================");

        keyboard.close();
    }
}

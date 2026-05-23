import java.util.Scanner;
public class RestaurantOrderValidator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        //getting number of items from user
        System.out.print("Enter number of items: ");
        int items = input.nextInt();
        //getting delivery option
        System.out.print("Is this for delivery? (true/false): ");
        boolean isDelivery = input.nextBoolean();
        //getting delivery distance from user
        System.out.print("Enter delivery distance in miles: ");
        double distance = input.nextDouble();
        //checking if item count is valid
        boolean validItems = items >= 1 && items <= 20;
        //checking if delivery distance is valid
        boolean validDelivery = !isDelivery || distance <= 10;
        //combining both conditions
        boolean isValidOrder = validDelivery && validItems;
        //showing result to user
        if (isValidOrder) {
            System.out.println("Order ACCEPTED: Your delivery order will arrive soon!");
        } else if (!validItems) {
            System.out.println("Order REJECTED: Item count must be between 1 and 20.");
        } else {
            System.out.println("Order REJECTED: Delivery distance exceeds our 10-mile limit.");
        }
        //close the scanner
        input.close();
    }
}
/**
 * Lab 3 - Exercise 4: [Restaurant Bill Splitter]
 * Student Name: [Yanina İsak]
 * Student ID: [230446612]
 * Date: [12.03.2026]
 */
import java.util.Scanner;
public class RestaurantBillSplitter {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("========== RESTAURANT BILL SPLITTER ========== \n");
    System.out.printf("Enter tip percentage (18, 20, or 25): ");
    int tipPercentage = input.nextInt();
    System.out.printf("Enter price for person 1: ");
    double person1 = input.nextDouble();
    System.out.printf("Enter price for person 2: ");
    double person2 = input.nextDouble();
    System.out.printf("Enter price for person 3: ");
    double person3 = input.nextDouble();
    System.out.printf("Enter price for person 4: ");
    double person4 = input.nextDouble();
    double subtotal = person1 + person2 + person3 +person4;
    double tax = subtotal * 0.085;
    double tip = subtotal * tipPercentage / 100;
    double total = subtotal + tax + tip;
    double perPerson = total / 4;
    System.out.println("===============================================");
    System.out.printf("%30s%n","ITEMIZED RECEIPT");
    System.out.println("===============================================");
    System.out.printf("%-30s $%10.2f%n", "Person 1 meal", person1);
    System.out.printf("%-30s $%10.2f%n", "Person 2 meal", person2);
    System.out.printf("%-30s $%10.2f%n", "Person 3 meal", person3);
    System.out.printf("%-30s $%10.2f%n", "Person 4 meal", person4);
    System.out.printf("%-30s %11s%n", "", "-----------");
    System.out.printf("%-30s $%10.2f%n", "Subtotal", subtotal);
    System.out.printf("%-30s $%10.2f%n", "Tax (8.5%)", tax);
    System.out.printf("%-30s $%10.2f%n", "Tip (20%)", tip);
    System.out.printf("%-30s %11s%n", "", "-----------");
    System.out.printf("%-30s $%10.2f%n%n", "TOTAL", total);
    System.out.println("-----------------------------------------------");
    System.out.printf("Number of people: %d%n", 4 );
    System.out.printf("%-30s $%10.2f%n", "Per person share:", perPerson);
    System.out.println("===============================================");
}

}

import java.util.Scanner;
public class VideoGameHealthMonitor {
   public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       //getting character health from user
       System.out.print("Enter character health (0-100): ");
       int health = input.nextInt();
       //check if health is above 75
       boolean isHealthy = health >75;
       // display status based on health condition
       if (isHealthy) {
           System.out.println("Status: Excellent condition! Ready for battle!");
       } else {
           System.out.println("Status: Consider finding a health pack.");
       }
       // check if character health is zero
       if (health == 0){
           System.out.println("CRITICAL: Character has been defeated!");
       }
       //close the scanner
       input.close();
       // end of program
       System.out.println("End of health check.");
   }
}

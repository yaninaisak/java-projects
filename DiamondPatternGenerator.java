import java.util.Scanner;
public class DiamondPatternGenerator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter diamond size (odd number 5-15): ");
        int size = input.nextInt();
        if( size < 5 || size > 15 || size %2 == 0 ){
            System.out.println("Invalid size.");
            input.close();
            return;
        }
        int mid = size / 2;
        for (int i = 0; i < size; i++){
            int distance = i <= mid ? i : size - 1 - i;
            int spaces = mid - distance;
            int stars = 2 * distance + 1;
            for (int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            for (int t = 0; t < stars; t++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

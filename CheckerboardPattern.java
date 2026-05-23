import java.util.Scanner;
public class CheckerboardPattern {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size of the grid: ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if ((i + j) % 2 == 0){
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}

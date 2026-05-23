import java.util.Scanner;
public class StringReverser {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word you want to reverse: ");
        String word = input.nextLine();
        for (int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
        input.close();
    }
}

public class RestaurantSeatingChart {
    public static void main (String[] args){
        System.out.println("Restaurant Seating Chart");
        System.out.println("========================\n");
        for (int row = 1; row <= 4; row++){
            for (int col = 1; col <= 6; col++ ){
                System.out.print("[" + row + "," + col + "] ");
            }
            System.out.println();
        }
    }
}

public class VideoGameLevelMapGenerator {
    public static void main (String[] args){
        final int HEIGHT = 10;
        final int WIDTH = 15;
        System.out.println("Game Level Map");
        System.out.println("==============");
        System.out.println();
        for (int row = 0; row < HEIGHT; row++ ){
            for (int col = 0; col < WIDTH; col++){
                char terrain;
                if (row == 0 || row == HEIGHT - 1 || col == 0 ||col == WIDTH - 1) {
                    terrain = '#';
                } else if (row == col) {
                    terrain = '$';
                } else if ((row + col) % 2 == 0) {
                    terrain = '.';
                } else {
                    terrain = 'o';
                }
                System.out.print(terrain);
            }
            System.out.println();
        }
        System.out.println("Legend:");
        System.out.println("  # = Wall");
        System.out.println("  $ = Treasure");
        System.out.println("  . = Grass");
        System.out.println("  o = Stone Floor");
    }
}

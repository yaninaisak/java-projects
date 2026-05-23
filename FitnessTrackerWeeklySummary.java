public class FitnessTrackerWeeklySummary {
    public static void main(String[] args) {
        int[][] stepCounts = {
                {8500, 9200, 7800, 10500, 8900, 12000, 9500},
                {6500, 7200, 6800, 7500, 7100, 8000, 7400},
                {12000, 11500, 13000, 12500, 11800, 14000, 13200},
                {9000, 8500, 9500, 9200, 8800, 10000, 9300},
                {7000, 7500, 7200, 7800, 7300, 8200, 7600}
        };
        System.out.println("Weekly Fitness Summary");
        System.out.println("======================");
        System.out.println();
        int maxSteps = 0;
        int topUser = 0;
        for (int u = 0; u < stepCounts.length; u++) {
            int sum = 0;
            for (int d = 0; d < stepCounts[u].length; d++) {
                sum += stepCounts[u][d];
            }
            double average = (double) sum / stepCounts[u].length;
            System.out.printf("User %d:\n", u + 1);
            System.out.printf("Total steps: \n", sum);
            System.out.printf("Daily Average: %.2f\n", average );
            if (sum > maxSteps){
                maxSteps = sum;
                topUser = u + 1;
            }
        }
        System.out.println("Top Performer: User " + topUser + " with " + maxSteps + " total steps!");
    }
}
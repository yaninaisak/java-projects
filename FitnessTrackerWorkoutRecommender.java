import java.util.Scanner;
public class FitnessTrackerWorkoutRecommender {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        //getting users age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        //getting users current heart rate
        System.out.print("Enter your current heart rate (bpm): ");
        int heartRate = input.nextInt();
        // calculating maximum heart rate
        int maxHeartRate = 220 - age;
        // calculating percentage of max heart rate
        double percentage = (heartRate * 100.0) / maxHeartRate;
        // checking heart rate zones
        if (heartRate > maxHeartRate){
            System.out.println("DANGER: Heart rate too high! Stop exercising immediately!");
            System.out.printf("Current HR: %d bpm | Max HR: %d bpm | You are at %.0f%% of maximum! \n", heartRate, maxHeartRate, percentage);
        } else if (percentage >= 85) {
            System.out.println("High Intensity Zone - Maximum effort workout");
        } else if (percentage >= 70) {
            System.out.println("Cardio Zone - Great for endurance");
        } else if (percentage >= 50) {
            System.out.println("Fat Burn Zone - Moderate exercise");
        } else {
            System.out.println("Warm-up Zone - Increase intensity");
        }
        // close the scanner
        input.close();
        // displaying final heart rate information (only if not danger)
        if (heartRate <= maxHeartRate){
        System.out.printf("Current HR: %d bpm | Max HR: %d bpm | Intensity: %.0f%% ! \n", heartRate, maxHeartRate, percentage);
        }
    }
}

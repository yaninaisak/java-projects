import java.util.Scanner;
public class MusicStreamingServiceSubscriptionManager {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // displaying subscription options
        System.out.println("=== Music Streaming Subscription Manager ===");
        System.out.println("1. Free");
        System.out.println("2. Basic");
        System.out.println("3. Premium");
        System.out.println("4. Family");
        // getting users subscription choice
        System.out.print("Select your subscription tier (1-4): ");
        int tier = input.nextInt();
        // getting hours listened
        System.out.print("Enter hours listened this month: ");
        int hoursListened = input.nextInt();
        // variables for subscription details
        String tierName = "";
        int hourLimit = 0;
        boolean hasAds = false;
        boolean hasOffline = false;
        int accountCount = 1;
        boolean isUnlimited = false;
        // setting values based on selected tier
        switch (tier){
            case 1:
                tierName = "Free";
                hourLimit = 15;
                hasAds = true;
                hasOffline = false;
                accountCount = 1;
                isUnlimited = false;
                break;
            case 2:
                tierName = "Basic";
                hourLimit = 50;
                hasAds = false;
                hasOffline = false;
                accountCount = 1;
                isUnlimited = false;
                break;
            case 3:
                tierName = "Premium";
                isUnlimited = true;
                hasAds = false;
                hasOffline =true;
                accountCount = 1;
                break;
            case 4:
                tierName = "Family";
                isUnlimited = true;
                hasAds = false;
                hasOffline = true;
                accountCount = 6;
                break;
            default:
                System.out.println("Invalid tier selection!");
                input.close();
                return;
        }
        // checking if user exceeded the limit
        boolean exceeded = !isUnlimited && hoursListened > hourLimit;
        // displaying subscription summary
        System.out.println("\n--- Subscription Summary ---");
        System.out.println("Tier: " + tierName);
        // showing hours info
        if (isUnlimited){
            System.out.println("Hours Listened: " + hoursListened + " / Unlimited");
        } else {
            System.out.println("Hours Listened: " + hoursListened + " / " + hourLimit + " hours" );
        }
        // showing status
        if (exceeded) {
            int overTime = hoursListened - hourLimit;
            System.out.println("Status: LIMIT EXCEEDED by " + overTime + " hours");
        } else {
            System.out.println("Status: Within limits");
        }
        // displaying features
        System.out.println("Features:");
        System.out.println(" - Ads: " + (hasAds ? "Yes" : "No"));
        System.out.println(" - Offline Mode: " + (hasOffline ? "Yes" : "No"));
        System.out.println(" - Accounts: " + accountCount);
        // recommendation message
        if (exceeded){
            System.out.println("\nRECOMMENDATION: Consider upgrading to Basic or Premium for more listening time!");
        } else if (isUnlimited) {
            System.out.println("\nEnjoy your unlimited music!");
        }
        // close the scanner
        input.close();;
    }
}

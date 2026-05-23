public class ConcertTicketSalesAnalyzer {
    public static void main(String[] args) {
        int[][] sectionData = {
                {150, 250, 142},  // Section A: VIP
                {200, 180, 195},  // Section B: Premium
                {200, 180, 187},  // Section C: Premium
                {300, 120, 276},  // Section D: Standard
                {300, 120, 290},  // Section E: Standard
                {400, 80, 385},   // Section F: Economy
                {400, 80, 392},   // Section G: Economy
                {500, 60, 478}    // Section H: Balcony
        };
        String[] sectionNames = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] sectionTypes = {"VIP", "Premium", "Premium", "Standard", "Standard", "Economy", "Economy", "Balcony"};
        System.out.println("Concert Ticket Sales Analysis");
        System.out.println("=============================");
        System.out.println();
        int totalRevenue = 0;
        int totalSold = 0;
        int totalCapacity = 0;
        int maxRevenue = 0;
        String bestSection = "";
        for (int i = 0; i < sectionData.length; i++){
            int capacity = sectionData [i][0];
            int price = sectionData [i][1];
            int sold = sectionData [i][2];
            int revenue = price * sold;
            totalRevenue += revenue;
            totalSold += sold;
            totalCapacity += capacity;
            if(revenue > maxRevenue){
                maxRevenue = revenue;
                bestSection = sectionNames[i];
            }
            System.out.printf("Section %s (%s):\n", sectionNames[i], sectionTypes[i]);
            System.out.printf("  Capacity: %d | Sold: %d | Revenue: $%,d\n", capacity, sold, revenue);
            System.out.println();
        }
        System.out.println("=============================");
        System.out.printf("Total Revenue: $%,d\n", totalRevenue);
        double average = (double) totalSold / sectionData.length;
        System.out.printf("Average Tickets Sold: %.2f\n", average);
        System.out.printf("Highest Revenue: Section %s with $%,d\n", bestSection, maxRevenue);
        double utilization = (totalSold * 100.0) / totalCapacity;
        System.out.printf("Venue Capacity Utilization: %.2f%%\n", utilization);
    }
}


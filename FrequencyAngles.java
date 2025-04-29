public class FrequencyAngles {
    public static void main(String[] args) {
        // Sample array of 15 integer values
        int[] numbers = {55,50,60,58,65,53,59,64,66,79,57,54,61,56};

        // Define the ranges
        int[] range1 = {50, 57}; // 50 to 57
        int[] range2 = {58, 65}; // 58 to 65
        int[] range3 = {66, 73}; // 66 to 73
        int[] range4 = {74, 81}; // 74 to 81
        int[] range5 = {82, 89}; // 82 to 89
        int[] range6 = {90, 97}; // 90 to 97

        // Initialize counters for each range
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;

        // Count the number of elements in each range
        for (int num : numbers) {
            if (num >= range1[0] && num <= range1[1]) count1++;
            if (num >= range2[0] && num <= range2[1]) count2++;
            if (num >= range3[0] && num <= range3[1]) count3++;
            if (num >= range4[0] && num <= range4[1]) count4++;
            if (num >= range5[0] && num <= range5[1]) count5++;
            if (num >= range6[0] && num <= range6[1]) count6++;
        }

        // Calculate total count
        int total = count1 + count2 + count3 + count4 + count5 + count6;

        // Calculate the angle for each range (in degrees)
        double angle1 = (double) count1 / total * 360;
        double angle2 = (double) count2 / total * 360;
        double angle3 = (double) count3 / total * 360;
        double angle4 = (double) count4 / total * 360;
        double angle5 = (double) count5 / total * 360;
        double angle6 = (double) count6 / total * 360;

        // Output the frequencies and angles
        System.out.println("Frequency of numbers in each range:");
        System.out.println("50-57: " + count1 + " (Angle: " + angle1 + " degrees)");
        System.out.println("58-65: " + count2 + " (Angle: " + angle2 + " degrees)");
        System.out.println("66-73: " + count3 + " (Angle: " + angle3 + " degrees)");
        System.out.println("74-81: " + count4 + " (Angle: " + angle4 + " degrees)");
        System.out.println("82-89: " + count5 + " (Angle: " + angle5 + " degrees)");
        System.out.println("90-97: " + count6 + " (Angle: " + angle6 + " degrees)");
    }
}

public class GroupedDataStats {

    // Method to classify the data and calculate Mean Deviation and Standard Deviation
    public static void calculateStats(int[] data) {
        // Define the class intervals
        int[][] classIntervals = {{50, 57}, {58, 65}, {66, 73}, {74, 81}, {82, 89}, {90, 97}};
        
        // Array to store frequencies of each class interval
        int[] frequencies = new int[classIntervals.length];
        
        // Calculate frequencies for each class interval
        for (int num : data) {
            for (int i = 0; i < classIntervals.length; i++) {
                if (num >= classIntervals[i][0] && num <= classIntervals[i][1]) {
                    frequencies[i]++;
                    break;  // No need to check further intervals once a match is found
                }
            }
        }

        // Calculate class marks (midpoint of each class interval)
        double[] classMarks = new double[classIntervals.length];
        for (int i = 0; i < classIntervals.length; i++) {
            classMarks[i] = (classIntervals[i][0] + classIntervals[i][1]) / 2.0;
        }

        // Calculate the mean (X?)
        int totalFrequency = 0;
        double weightedSum = 0;
        for (int i = 0; i < frequencies.length; i++) {
            totalFrequency += frequencies[i];
            weightedSum += frequencies[i] * classMarks[i];
        }
        double mean = weightedSum / totalFrequency;

        // Calculate Mean Deviation (MD)
        double meanDeviation = 0;
        for (int i = 0; i < frequencies.length; i++) {
            meanDeviation += frequencies[i] * Math.abs(classMarks[i] - mean);
        }
        meanDeviation /= totalFrequency;

        // Calculate Standard Deviation (?)
        double variance = 0;
        for (int i = 0; i < frequencies.length; i++) {
            variance += frequencies[i] * Math.pow(classMarks[i] - mean, 2);
        }
        variance /= totalFrequency;
        double stdDeviation = Math.sqrt(variance);

        // Print the results
        System.out.println("Frequencies: ");
        for (int freq : frequencies) {
            System.out.print(freq + " ");
        }
        System.out.println("\nMean Deviation: " + meanDeviation);
        System.out.println("Standard Deviation: " + stdDeviation);
    }

    public static void main(String[] args) {
        // Given array of 30 integers
        int[] data = {55, 72, 68, 50, 85, 90, 74, 60, 58, 77, 82, 65, 71, 53, 69, 88, 58, 76, 64, 66, 80, 79, 57, 54, 81, 87, 75, 61, 56, 78};

        // Calculate and display the results
        calculateStats(data);
    }
}

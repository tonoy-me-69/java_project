import java.util.Arrays;

public class GroupedDataQuartilesDeciles {

    public static void main(String[] args) {
        // Sample data of 30 values
        int[] data = {55, 72, 68, 50, 85, 90, 74, 60, 58, 77, 82, 65, 71, 53, 69, 88, 58, 76, 64, 66, 80, 79, 57, 54, 81, 87, 75, 61, 56, 78};

        // Step 1: Sort the data
        Arrays.sort(data);

        // Step 2: Create class intervals (adjust based on data range)
        int min = data[0];
        int max = data[data.length - 1];
        int intervalWidth = (max - min) / 5; // 5 intervals for simplicity (adjust as needed)

        // Step 3: Find the frequencies for each interval
        int numIntervals = (max - min) / intervalWidth + 1;
        int[] frequencies = new int[numIntervals];
        int[] lowerBound = new int[numIntervals];
        int[] upperBound = new int[numIntervals];

        // Assign class intervals and frequencies
        for (int i = 0; i < numIntervals; i++) {
            lowerBound[i] = min + i * intervalWidth;
            upperBound[i] = lowerBound[i] + intervalWidth - 1;
        }

        // Counting frequencies
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < numIntervals; j++) {
                if (data[i] >= lowerBound[j] && data[i] <= upperBound[j]) {
                    frequencies[j]++;
                    break;
                }
            }
        }

        // Step 4: Calculate cumulative frequencies
        int[] cumulativeFrequencies = new int[numIntervals];
        cumulativeFrequencies[0] = frequencies[0];
        for (int i = 1; i < numIntervals; i++) {
            cumulativeFrequencies[i] = cumulativeFrequencies[i - 1] + frequencies[i];
        }

        // Step 5: Calculate Quartiles (Q1, Q2, Q3) and Deciles (D1 to D9)
        int totalFrequency = data.length;

        System.out.println("Quartiles and Deciles:");

        // Calculate Q1 (25th percentile)
        System.out.println("Q1 (25th percentile): " + calculatePercentile(lowerBound, upperBound, frequencies, cumulativeFrequencies, totalFrequency, 25));

        // Calculate Q2 (50th percentile - Median)
        System.out.println("Q2 (50th percentile - Median): " + calculatePercentile(lowerBound, upperBound, frequencies, cumulativeFrequencies, totalFrequency, 50));

        // Calculate Q3 (75th percentile)
        System.out.println("Q3 (75th percentile): " + calculatePercentile(lowerBound, upperBound, frequencies, cumulativeFrequencies, totalFrequency, 75));

        // Calculate Deciles D1 to D9 (10th, 20th, ..., 90th percentiles)
        for (int i = 1; i <= 9; i++) {
            System.out.println("D" + i + " (" + (i * 10) + "th percentile): " + calculatePercentile(lowerBound, upperBound, frequencies, cumulativeFrequencies, totalFrequency, i * 10));
        }
    }

    // Method to calculate the percentile (Q1, Q2, Q3, or Decile)
    public static double calculatePercentile(int[] lowerBound, int[] upperBound, int[] frequencies, int[] cumulativeFrequencies, int totalFrequency, int percentile) {
        // Find the class interval that contains the percentile
        double position = (percentile / 100.0) * totalFrequency;

        int i;
        for (i = 0; i < cumulativeFrequencies.length; i++) {
            if (position <= cumulativeFrequencies[i]) {
                break;
            }
        }

        // Interpolation formula
        double L = lowerBound[i]; // Lower boundary of the class interval
        double F = (i == 0) ? 0 : cumulativeFrequencies[i - 1]; // Cumulative frequency before the class interval
        double h = upperBound[i] - lowerBound[i]; // Width of the class interval
        double f = frequencies[i]; // Frequency of the class interval

        // Calculate the percentile value using linear interpolation
        return L + ((position - F) / f) * h;
    }
}

import java.util.Arrays;

public class DecilesAndQuartiles {
    public static void main(String[] args) {
        // Sample array of 30 integer values representing weights
        int[] data = {55, 72, 68, 50, 85, 90, 74, 60, 58, 77, 82, 65, 71, 53, 69, 88, 58, 76, 64, 66, 80, 79, 57, 54, 81, 87, 75, 61, 56, 78};

        // Sort the data array in ascending order
        Arrays.sort(data);
        System.out.println("Sorted Data: " + Arrays.toString(data));

        // Calculate and print deciles and quartiles
        System.out.println("\nDeciles:");
        for (int i = 1; i <= 9; i++) {
            System.out.println("D" + i + ": " + calculatePercentile(data, i * 10));
        }

        System.out.println("\nQuartiles:");
        System.out.println("Q1: " + calculatePercentile(data, 25));  // 25th percentile
        System.out.println("Q2 (Median): " + calculatePercentile(data, 50));  // 50th percentile
        System.out.println("Q3: " + calculatePercentile(data, 75));  // 75th percentile
    }

    // Method to calculate the nth percentile (e.g., 10th, 25th, 50th, etc.)
    public static double calculatePercentile(int[] data, int percentile) {
        int n = data.length;
        double index = (percentile / 100.0) * (n - 1);
        int lowerIndex = (int) Math.floor(index);
        int upperIndex = (int) Math.ceil(index);

        // If both indices are the same, return the value at that index
        if (lowerIndex == upperIndex) {
            return data[lowerIndex];
        } else {
            // Interpolate between the two values
            return data[lowerIndex] + (index - lowerIndex) * (data[upperIndex] - data[lowerIndex]);
        }
    }
}

import java.util.Scanner;

public class StatisticsCalculator {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int[] data ={55, 72, 68, 50, 85, 90, 74, 60, 58, 77, 82, 65, 71, 53, 69, 88, 58, 76, 64, 66, 80, 79, 57, 54, 81, 87, 75, 61, 56, 78}; // Array of 30 integers

        // Input 30 values from user
       // System.out.println("Enter 30 integers:");
        //for (int i = 0; i < 30; i++) {
          //  data[i] = scanner.nextInt();
        //}

        // Compute mean
        double mean = calculateMean(data);

        // Compute mean deviation
        double meanDeviation = calculateMeanDeviation(data, mean);

        // Compute standard deviation
        double standardDeviation = calculateStandardDeviation(data, mean);

        // Display results
        System.out.println("Mean: " + mean);
        System.out.println("Mean Deviation: " + meanDeviation);
        System.out.println("Standard Deviation: " + standardDeviation);

        //scanner.close();
    }

    // Method to calculate mean
    public static double calculateMean(int[] data) {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.length;
    }

    // Method to calculate mean deviation
    public static double calculateMeanDeviation(int[] data, double mean) {
        double sum = 0;
        for (int num : data) {
            sum += Math.abs(num - mean);
        }
        return sum / data.length;
    }

    // Method to calculate standard deviation
    public static double calculateStandardDeviation(int[] data, double mean) {
        double sum = 0;
        for (int num : data) {
            sum += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sum / (data.length - 1)); // Sample standard deviation
    }
}

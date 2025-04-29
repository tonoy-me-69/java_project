public class KurtosisCalculator {
    
    // Method to calculate kurtosis
    public static double calculateKurtosis(int[] data) {
        int n = data.length;
        
        // Calculate mean
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        double mean = sum / n;
        
        // Calculate standard deviation
        double varianceSum = 0;
        for (int num : data) {
            varianceSum += Math.pow(num - mean, 2);
        }
        double variance = varianceSum / n;
        double stdDev = Math.sqrt(variance);
        
        // Calculate kurtosis
        double kurtosisSum = 0;
        for (int num : data) {
            kurtosisSum += Math.pow((num - mean) / stdDev, 4);
        }
        double kurtosis = (kurtosisSum / n);
        
        // Excess Kurtosis (subtracting 3)
        double excessKurtosis = kurtosis - 3;
        
        return excessKurtosis;
    }

    public static void main(String[] args) {
        // Example dataset
        int[] data = {55, 72, 68, 50, 85, 90, 74, 60, 58, 77, 82, 65, 71, 53, 69, 88, 
                      58, 76, 64, 66, 80, 79, 57, 54, 81, 87, 75, 61, 56, 78};
        
        // Calculate and display kurtosis
        double kurtosis = calculateKurtosis(data);
        System.out.println("Excess Kurtosis: " + kurtosis);
    }
}

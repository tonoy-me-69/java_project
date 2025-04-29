import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StemAndLeafPlot {
    public static void main(String[] args) {
        // Sample array of 30 integer values
        int[] numbers = {55, 72, 68, 50, 85, 90, 74, 60, 58, 77, 82, 65, 71, 53, 69, 88, 59, 76, 64, 66, 80, 79, 57, 54, 81, 87, 75, 61, 56, 78};

        // Sort the array to prepare for the stem-and-leaf plot
        Arrays.sort(numbers);

        // Create a map to hold the stem (key) and leaf (value)
        Map<Integer, StringBuilder> stemAndLeafMap = new HashMap<>();

        // Process the array to create stems and leaves
        for (int num : numbers) {
            int stem = num / 10;  // Extract the tens place (stem)
            int leaf = num % 10;  // Extract the ones place (leaf)

            // Add the leaf to the corresponding stem in the map
            stemAndLeafMap.computeIfAbsent(stem, k -> new StringBuilder()).append(leaf).append(" ");
        }

        // Print the stem-and-leaf plot
        System.out.println("Stem-and-Leaf Plot:");
        for (Map.Entry<Integer, StringBuilder> entry : stemAndLeafMap.entrySet()) {
            int stem = entry.getKey();
            String leaves = entry.getValue().toString().trim();  // Remove trailing space
            System.out.println(stem + " | " + leaves);
        }
    }
}

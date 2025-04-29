import java.util.*;

public class FrequencyDistribution {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(55, 72, 68, 50, 85, 90, 74, 60, 58, 77, 82, 65, 71, 53, 69, 88, 58, 76, 64, 66, 80, 79, 57, 54, 81, 87, 75, 61, 56, 78);

        frequencyDistribution(data);
    }

    public static void frequencyDistribution(List<Integer> data) {
        Collections.sort(data);

        int maxValue = Collections.max(data);
        int minValue = Collections.min(data);
        int dataRange = maxValue - minValue;

        int classCount = (int) Math.round(1 + 3.322 * Math.log10(data.size()));
        int classWidth = (int) Math.ceil((double) dataRange / classCount);

        List<Integer> classIntervals = new ArrayList<>();
        for (int i = 0; i <= classCount; i++) {
            classIntervals.add(minValue + i * classWidth);
        }

        Map<String, Integer> freqDict = new LinkedHashMap<>();
        for (int i = 0; i < classIntervals.size() - 1; i++) {
            freqDict.put(classIntervals.get(i) + "-" + classIntervals.get(i + 1), 0);
        }

        for (int value : data) {
            for (int i = 0; i < classIntervals.size() - 1; i++) {
                if (value >= classIntervals.get(i) && value < classIntervals.get(i + 1)) {
                    String key = classIntervals.get(i) + "-" + classIntervals.get(i + 1);
                    freqDict.put(key, freqDict.get(key) + 1);
                    break;
                }
            }
        }

        System.out.println("Max: " + maxValue);
        System.out.println("Min: " + minValue);
        System.out.println("Range: " + dataRange);
        System.out.println("Class count: " + classCount);
        System.out.println("Class width: " + classWidth);

        System.out.println("\nClass intervals:");
        for (String key : freqDict.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nFrequency distribution:");
        for (Map.Entry<String, Integer> entry : freqDict.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<String, Double> relativeFreqDict = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : freqDict.entrySet()) {
            relativeFreqDict.put(entry.getKey(), (double) entry.getValue() / data.size());
        }

        System.out.println("\nRelative frequency distribution:");
        for (Map.Entry<String, Double> entry : relativeFreqDict.entrySet()) {
            System.out.printf("%s: %.3f%n", entry.getKey(), entry.getValue());
        }

        Map<String, Integer> cumulativeFreqDict = new LinkedHashMap<>();
        int cumulativeFreq = 0;
        for (Map.Entry<String, Integer> entry : freqDict.entrySet()) {
            cumulativeFreq += entry.getValue();
            cumulativeFreqDict.put(entry.getKey(), cumulativeFreq);
        }

        System.out.println("\nCumulative frequency distribution:");
        for (Map.Entry<String, Integer> entry : cumulativeFreqDict.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nPie chart (degrees):");
        for (Map.Entry<String, Integer> entry : freqDict.entrySet()) {
            double angle = (entry.getValue() / (double) data.size()) * 360;
            System.out.printf("%s: %.2f degrees%n", entry.getKey(), angle);
        }

        double mean = calculateMean(data);
        System.out.println("\nMean: " + mean);

        double median = calculateMedian(data);
        System.out.println("Median: " + median);

        List<Integer> mode = calculateMode(data);
        System.out.println("Mode: " + mode);

        double variance = calculateVariance(data, mean);
        System.out.println("Variance: " + variance);

        double stdDeviation = Math.sqrt(variance);
        System.out.println("Standard Deviation: " + stdDeviation);
    }

    public static double calculateMean(List<Integer> data) {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.size();
    }

    public static double calculateMedian(List<Integer> data) {
        int n = data.size();
        if (n % 2 == 0) {
            return (data.get(n / 2 - 1) + data.get(n / 2)) / 2.0;
        } else {
            return data.get(n / 2);
        }
    }

    public static List<Integer> calculateMode(List<Integer> data) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : data) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Collections.max(freqMap.values());
        List<Integer> mode = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                mode.add(entry.getKey());
            }
        }
        return mode;
    }

    public static double calculateVariance(List<Integer> data, double mean) {
        double sumSquaredDiff = 0;
        for (int num : data) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return sumSquaredDiff / (data.size() - 1);
    }
}

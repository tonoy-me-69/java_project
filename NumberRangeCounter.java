import java.util.ArrayList;
import java.util.Scanner;

public class NumberRangeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[30];

        // Lists to store numbers in respective ranges
        ArrayList<Integer> range50to57 = new ArrayList<>();
        ArrayList<Integer> range58to65 = new ArrayList<>();
        ArrayList<Integer> range66to73 = new ArrayList<>();
        ArrayList<Integer> range74to81 = new ArrayList<>();
        ArrayList<Integer> range82to89 = new ArrayList<>();
        ArrayList<Integer> range90to97 = new ArrayList<>();

        // Taking 30 integer inputs
        System.out.println("Enter 30 integer values:");
        for (int i = 0; i < 30; i++) {
            numbers[i] = scanner.nextInt();

            // Categorizing numbers into respective lists
            if (numbers[i] >= 50 && numbers[i] <= 57) range50to57.add(numbers[i]);
            else if (numbers[i] >= 58 && numbers[i] <= 65) range58to65.add(numbers[i]);
            else if (numbers[i] >= 66 && numbers[i] <= 73) range66to73.add(numbers[i]);
            else if (numbers[i] >= 74 && numbers[i] <= 81) range74to81.add(numbers[i]);
            else if (numbers[i] >= 82 && numbers[i] <= 89) range82to89.add(numbers[i]);
            else if (numbers[i] >= 90 && numbers[i] <= 97) range90to97.add(numbers[i]);
        }
        
        scanner.close();

        // Displaying results
        System.out.println("\nEntered Numbers: ");
        printArray(numbers);

        System.out.println("\nNumbers in each range:");
        printRange("50 - 57", range50to57);
        printRange("58 - 65", range58to65);
        printRange("66 - 73", range66to73);
        printRange("74 - 81", range74to81);
        printRange("82 - 89", range82to89);
        printRange("90 - 97", range90to97);
    }

    // Method to print an array
    private static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    // Method to print numbers in a range with count
    private static void printRange(String range, ArrayList<Integer> list) {
        System.out.println(range + " (" + list.size() + " numbers): " + list);
    }
}

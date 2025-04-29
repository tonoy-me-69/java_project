import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the diamond
        System.out.print("Enter the number of rows for the diamond's upper half: ");
        int rows = scanner.nextInt();

        // Print the upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
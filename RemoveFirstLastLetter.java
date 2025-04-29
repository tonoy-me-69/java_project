import java.util.Scanner;

public class RemoveFirstLastLetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a word:");
        String input = scanner.nextLine();

        // Process the input to remove first and last letter if they are the same
        String result = processWord(input);

        // Output the result
        System.out.println("Output: " + result);

        scanner.close();
    }

    public static String processWord(String word) {
        // Check if the word is less than 2 characters (cannot have first and last)
        if (word.length() < 2) {
            return word;
        }

        // Compare the first and last characters
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        if (firstChar == lastChar) {
            // Remove the first and last character if they are the same
            return word.substring(1, word.length() - 1);
        } else {
            // Keep the word as is
            return word;
        }
    }
}

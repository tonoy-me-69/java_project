public class NewTest {
    public static void main(String[] args) {
        int[] marks = {85, 90, 75, 44, 99};
        int size = marks.length;
        String[] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};

        // Bubble Sort for marks array and aligning names array
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks
                    int currentMark = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = currentMark;

                    // Swap corresponding names
                    String currentName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = currentName;
                }
            }
        }

        // Print sorted marks and names using for (int i = 0; i < size; i++) { }
        System.out.println("Sorted Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println(".");
    }
}

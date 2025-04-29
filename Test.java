import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Please enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array1 = new int[size];

        System.out.println("Please enter the elements of the array");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        for (int k = 0; k < size; k++) {
            System.out.print(array1[k] + " ");
        }
        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            int max = i; 
            for (int j = i + 1; j < size; j++) {
                if (array1[j] > array1[max]) { 
                    max = j; 
                }
            }
            int current = array1[max];
            array1[max] = array1[i];
            array1[i] = current;
        }
        System.out.println();
       
        System.out.println("Sorted Array:");
        for (int a = 0; a < size; a++) {
            System.out.print(array1[a] + " ");
        }
    }
}

          
          
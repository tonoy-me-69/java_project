import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N= ");
        int N = sc.nextInt();

        int[]array = new int[N];
        
        System.out.print("Enter the arrays");

        for (int i=0; i<N; i++) {
            array[i]=sc.nextInt();
        }

        int[] count = new int[N];

        for (int i = 0; i < N; i++) {
            count[array[i]]++;
        }

        for (int i=0; i<count.length; i++) {
            if (count[i]> 0) {
                System.out.println(i + " - " + count[i] + " times");
            }
        }
    }
}

      
    



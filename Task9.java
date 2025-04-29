import java.util.Scanner;

public class Task9{
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int N = nc.nextInt();

        int[][] arr = new int[N][N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = nc.nextInt();
            }
        }

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    if (arr[i][j] != 1) {
                        flag = false;
                    }
                } else {
                    if (arr[i][j] != 0) {
                        flag = false;
                    }          
                }
            }
        }

        // Final output
        if (flag) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an Identity Matrix");
        }
    }
}

      
          
    
    
      

    
    
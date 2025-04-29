import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("N = ");
        int N = sc.nextInt();
        double[] array = new double[N];
        
        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextDouble();
        }
        
        int uniqueCount = 1;
        for (int i = 1; i < N; i++) {
            if (array[i] != array[i - 1]) {
                uniqueCount++;
            }
        }
        
        double[] newArray = new double[uniqueCount];
        newArray[0] = array[0];
        int index = 1, removedCount = N - uniqueCount;
        
        for (int i = 1; i < N; i++) {
            if (array[i] != array[i - 1]) {
                newArray[index] = array[i];
                index++;
            }
        }
        
        System.out.print("New Array: ");
        for (double num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Removed elements: " + removedCount);
        
        sc.close();
    }
}

    
    
    
          
         
          
        
      
    
           
          
      
      
    
  
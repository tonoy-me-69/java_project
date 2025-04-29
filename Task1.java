import java.util.Scanner;
public class Task1 {
  public static void main(String[] args) {
    int sum = 0, max = 0, min = 0;
    double average = 0.0;
    int count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Input 10 integer numbers:");
    for (int i = 0; i < 10; i++){
      int input = sc.nextInt(); 
     if (input > 0 && input % 2 != 0){
       sum += input;
       count++;
       if (count == 1) {
         max = input;
         min = input;
         } else {
           if (input > max) {
             max = input;
           }
           if (input < min) {
             min = input;
           }
         }
     }
    }
    if (count == 0) {
      System.out.println("No odd positive numbers found");
      } else {        
        average = (double) sum / count; 
        System.out.println("Sum = " + sum);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + average);
        }
    }
}
        

    
        
    
    
    
    
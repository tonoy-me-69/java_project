import java.util.Scanner;
public class Task2{
  public static void main(String [] args){
    
    int count=0;
    int total_prime=0;
    
    System.out.println("Input the starting value");
    Scanner sc=new Scanner(System.in);
    int start=sc.nextInt();
    System.out.println("Input the Ending value");
    //Scanner sc=new Scanner(System.in);
    int end=sc.nextInt();
    
    System.out.println("Prime number between " + start+" and " +end+" is ");
    
    for(int i= start; i<=end; i++){
      count = 0; // Reset count for each number
      for(int j=1; j<=i ; j++){
        if(i % j == 0){
          count++;
        }
      }
      if(count==2){
        total_prime++;
        //System.out.print(i);
      }
    }
    System.out.print(total_prime);
  }
}
      
      
    
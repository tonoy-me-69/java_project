import java.util.Scanner;
//import java.util.Arrays;
public class Task5{
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    
    System.out.println("Enter the length of an array");
    
    int length=sc.nextInt();
    int [] array= new int[length];
    
    System.out.println("Enter the array value");
    
    for(int i=0; i<length; i++){
      array[i]= sc.nextInt();
    }
    
    for(int j=0; j<length/2; j++){
      int temp=array[j];
      array[j]=array[length-1-j];
      array[length-1-j]=temp;
    }
    
    for(int k=0; k<length; k++){
      System.out.print(array[k] + " ");
    }
  }
}
      
      
        
    
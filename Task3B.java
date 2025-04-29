import java.util.Scanner;
// Assignment 3B
public class Task3B{
  public static void main (String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the length of the string");
    
    int size=sc.nextInt();
    int [] uselessArray= new int [size];
    for(int i=0; i<size; i++){
      System.out.println("Enter the integer number");
      int number=sc.nextInt();
      uselessArray[i]=number;
    }
    for(int i=0; i<size; i++){
      for(int j=size-1-i; j>=size/2; ){
        int firstnumber=uselessArray[i];
        System.out.println("firstnumber= " + firstnumber);
        int lastnumber=uselessArray[j];
        System.out.println("lastnumber= " + lastnumber);
        uselessArray[i]=lastnumber;
        uselessArray[j]=firstnumber;
        break;
      }
    }
      System.out.println("Reversed array:");
    for(int i=0; i<size; i++){
      System.out.print(uselessArray[i]+ " "); 
    }
  }
}
        
        
    
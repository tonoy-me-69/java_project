import java.util.Scanner;
public class Task11{
  public static void main(String [] args){
    Scanner SC=new Scanner(System.in);
    
    System.out.println("state the starting number");
    int start_number=SC.nextInt();
    
    System.out.println("state the endiing number");
    int end_number=SC.nextInt();
    
    System.out.println("Armstrong numbers between " + start_number + " and " + end_number + ":");
    
    for (int number = start_number; number <= end_number; number++) {
    int originalNumber= number;
    int value=0;
    int digit=0;
    int remainder=0;
    int store=originalNumber;
    
    while(originalNumber>0){
       originalNumber=originalNumber/10;
       digit ++;}
    originalNumber=store;

    while(originalNumber>0){
      remainder=originalNumber%10;
      originalNumber=originalNumber/10;
      value +=Math.pow(remainder, digit);
    }
    if(value==store){
      System.out.println(store);}}}}
    //else {
      //System.out.println("It is not an armstrong number " + value);}
    //originalNumber++;

    //originalNumber++; 
  

  
      
  
  
  
  
    

import java.util.Scanner;
public class SumOfEvenNumbers {
  public static void main(String [] args){
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter an integer number:");
    int a=SC.nextInt();
    int value=0;
    int i=0;
    if(a>0){
      while(i<=a){
        if(i%2==0){
          value += i;}
          i++;}
    System.out.print( "The sum of even numbers are " + value);}
    else{
      System.out.println("Please enter a valid integer nunber");}}}
        
    
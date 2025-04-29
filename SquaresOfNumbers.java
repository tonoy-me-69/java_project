import java.util.Scanner;
public class SquaresOfNumbers{
  public static void main(String [] args){
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter an integer number:");
    int a=SC.nextInt();
    int i=0;
    //i=a;
    int value=0;
    if (a>0){
      while(i<=a){
      value=i*i;
      i++;
      if (value !=a*a){
      System.out.print(value + " ,");}
      else {
        System.out.print(value);}}}}}
      
      
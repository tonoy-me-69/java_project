import java.util.Scanner;
public class ReverseASequence   {
  public static void main(String [] args){
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter an integer number:");
    int n=SC.nextInt();
    int i=n;
    if(n>0){
      while(i>0){
        if(i==1){
          System.out.print( i);}
       else{
         System.out.print( i + " ,");}
      i --;}}
    else{
      System.out.print("Enter a valid number");}}}
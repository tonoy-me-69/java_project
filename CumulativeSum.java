import java.util.Scanner;
public class CumulativeSum   {
  public static void main(String [] args){
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter an integer number:");
    int input_number=SC.nextInt();
    int output=0;
    int number=0;
    if(input_number>0){
      while(number<=input_number){
        output +=number;
        System.out.print( output + ",");
        number ++;}}
    else{
      System.out.println("Input is invalid");}}}
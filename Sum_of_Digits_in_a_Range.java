import java.util.Scanner;
public class Sum_of_Digits_in_a_Range   {
  public static void main(String [] args){
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter an integer number:");
    int input_number=SC.nextInt();
    int sum=0;
    int number=0;
    if(input_number>0){
      while(number<=input_number){
        sum +=number;
          number++;
      }
      System.out.println("The total sum is:" + sum);}
     else{
     System.out.println("Input is invalid");}}}
      
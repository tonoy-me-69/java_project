import java.util.Scanner;
public class AlternatingNumbers    {
  public static void main(String [] args){
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter an integer number:");
    int input_number=SC.nextInt();
    int i=1;
    int number=1;
    if(input_number%2!=0){
      while(i<=input_number){
        System.out.print(i + ",");
      i=i+2;}
      number= number+1;
    while(number<=input_number){
      //number= number+1;
      System.out.print(number + ",");
      number=number+2;}}
    if(input_number%2==0){
        while(i<=input_number){
        System.out.print(i + ",");
      i=i+2;}
        number= number+1;
    while(number<=input_number){
      //number= number+1;
      System.out.print(number + ",");
      number=number+2;}}}}
      
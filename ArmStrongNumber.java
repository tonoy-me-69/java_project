import java.util.Scanner;
public class ArmStrongNumber{
  public static void main(String [] args){
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter an integer number:");
    int originalNumber=SC.nextInt();
    int value=0;
    int number=originalNumber;
    int remainder=0;
    int digit=0;
    while(originalNumber>0){
       originalNumber=originalNumber/10;
       digit ++;}
    System.out.println("The number of digit is :" + digit );
    originalNumber=number;
    //System.out.println(originalNumber);}}
     if(originalNumber>0){
    while(originalNumber>0){
      remainder=originalNumber%10;
      originalNumber=originalNumber/10;
      value +=Math.pow(remainder, digit);;}}
    if(value==number){
      System.out.println("It is an armstrong number " + value);}
    else {
      System.out.println("It is not an armstrong number " + value);}
  }}
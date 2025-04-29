//import java.util.Scanner;
public class Task15{
  public static void main(String [] args){
    //Scanner SC= new Scanner ( System.in);
    //System.out.println("Enter an integer number:");
    //int n=SC.nextInt();
    int sum=0;
    int n=653505;
    if(n<0){
      System.out.println("The number is negative,please enter positive interger");}
    else if(n==0){
      System.out.println("Then number is 0");}
    else{
      for(int i=1; i<=n; i++){
        if (n%i==0){
          sum +=i;}}
        if(sum== 2*n){ 
          System.out.println("Perfect number " + n);}
        else{
        System.out.println("Not a perfect Prime " + n);}
      }}}
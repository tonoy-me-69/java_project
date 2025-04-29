//import java.util.Scanner;
public class Task13{
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // System.out.print("Enter an integer: ");
        //int num = sc.nextInt();
        int num=1236984;
        int count=0;
        int power10=1;
        int i=1;
        
        int test=num;
        int digit=0;
        while(test!=0){
          test=test/10;
          count ++;}// how many digit
        
        //System.out.print( count );}}
        
        while(i<count){
            power10*=10;
            i++;//for nummber of 0
        }
        //System.out.print("Individual digits forward: ");
        if(num>0){
        while (num > 0) {
            int lastNumber = num / power10;
            System.out.print(lastNumber);
            num =num % power10;
            if (power10 >= 10) {
                System.out.print(", ");//for last digit no comma
            }
            power10=power10 / 10;
        }}
        else if(num<=0){
          System.out.print("please enter a number greater than zero");}}}
  

import java.util.Scanner;
public class Task1C{
public static boolean isPositive(int a){
  if(a>0){
    return true;
  }
   return false;
}
public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  System.out.println(" Enter an integer number ");
  int value=sc. nextInt();
  System.out.println(isPositive(value));
}
}
  
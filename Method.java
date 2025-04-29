import java.util.Scanner;
public class Method{
  public static int factorial(int a){
    int result=1;
    for(int i=a; i>0; i--){
      result *=i;
  }
    return result;
  }
    public static void main(String [] args){
      Scanner sc= new Scanner(System.in);
      int value=sc.nextInt();
      System.out.println(factorial(value));
    }
  }

      
        
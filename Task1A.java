import java.util.Scanner;
public class Task1A{
  public static String evenchecker(int a){
    if(a%2==0){
      return " Even ";
    }
    else{
      return " Odd ";     
    }
  }
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int value = sc.nextInt();
    //evenchecker(value);
    System.out.println(evenchecker(value));
  }
}
    
      
    
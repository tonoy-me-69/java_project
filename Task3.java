import java.util.Scanner;
public class Task3{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the First string");
    String s1= sc.nextLine();
    System.out.println("Enter the Second string");
    String s2= sc.nextLine();
    
    String s3=s1+" "+s2;
    
    int code_Point_Sum=0;
    
    for(int i=0; i<s3.length() ; i++){
      if(s3.codePointAt(i)>64 && s3.codePointAt(i)<91 || s3.codePointAt(i)>96 && s3.codePointAt(i)<123){
      code_Point_Sum += s3.codePointAt(i);
    }
    }
    System.out.println(s3);
    System.out.println(code_Point_Sum);
  }
}
      
      
    
    
  

  
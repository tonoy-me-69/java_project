import java.util.Scanner;
public class Task4{
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the alphabets");
    String s1= sc.nextLine();
    String s2="";
    
    for(int i=0; i<s1.length() ; i++){
      int code_point=s1.codePointAt(i);
      if(code_point==97){
        code_point=122;
        s2+=(char)code_point;
      }
      else{
        code_point--;
        s2+=(char)code_point;
      }
      //s2+=(char)code_point;
    }
    System.out.println(s2);
  }
}
    
        
      
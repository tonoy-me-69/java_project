import java.util.Scanner;
public class Anagram{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a string");
    String s1=sc.nextLine();
    s1=s1.toUpperCase();
    int value= s1.length();
    
    System.out.println("Enter a string");
    String s2=sc.nextLine();
    s2=s2.toUpperCase();
    int value_1= s1.length();
    
    
    
    boolean sameletter=false;
    
    
    
    for(int i=0; i<value; i++){
      int codepoint=s1.codePointAt(i);
      for(int j=0; j<value_1; j++){
      int codepoint_1=s2.codePointAt(j);
      if(codepoint==codepoint_1){
        sameletter=true;
      }
      }
    }
      System.out.print(sameletter);
    }
  }

        
        
      
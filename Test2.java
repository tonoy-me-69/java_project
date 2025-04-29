import java.util.Scanner;
public class Test2{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a string");
    String s1=sc.nextLine();
    int value= s1.length();
    String output="";
    String anotherOutput="";
    int count=0;
    int anotherCount=0;
    
    for(int i=0; i<value; i++){
      int codepoint=s1.codePointAt(i);
      if(codepoint !=32){
        output+=(char)codepoint;
        count++;  
      }
      
      if(count>anotherCount){
        anotherCount=count;
        anotherOutput=output;
      }
        
        
      if(codepoint ==32){
        count=0;
        output="";
      }
      
    }
    
    System.out.print(anotherOutput);
  }
}
      
  
      
        
      
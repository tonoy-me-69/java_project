import java.util.ArrayList;
import java.util.Arrays;
public class names{
public static void main(String [] args){
  int vowel=0;
  int length=0,index=0;
  String [] names= { "Alice", "Bob" , "Zara" , "Eve" , "Michael" , "Oscar" , "john" };
  ArrayList<String> longerNames = new ArrayList<>();
  for(int i=0; i<names.length ; i++){
    String test = names[i];
    char firstLetter= Character.toLowerCase(test.charAt(0)); 
    if(firstLetter== 'a' || firstLetter== 'e' ||firstLetter==  'i' ||firstLetter==  'o' ||firstLetter==  'u'){
      vowel++;
  }
    int value=test.length();
    if(value>5){
      length++;
      longerNames.add(names[i]);
    }
  }
  System.out.printf("Number of names starting with a vowel: %d \n ", vowel);
  if(length>0){
  System.out.println("Names longer than length 5: " +longerNames );
  }
  else{
    System.out.println("Names longer than length 5: 0 ");
  }       
}
}

  
  
  
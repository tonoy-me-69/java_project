public class Lab8_task3{
  public static void main(String [] args){
   String [] email_list = {"cse110@gmail.com", "government@cv.",  "eee@bracu.ac.bd"};
   
   int count=0;
   
   for(int i=0; i<email_list.length; i++){
     boolean condition= false;
     String check= email_list[i];
     
     //int number=check.codepointAt[0];
     if ((check.codePointAt(0) >= 65 && check.codePointAt(0) <= 90) || 
                (check.codePointAt(0) >= 97 && check.codePointAt(0) <= 122)) {
       int number=0;
       int number2=0;
       
       for(int j=1; j<check.length() ; j++){
         if (check.charAt(j) == '@') {
           number=j;
         }
       }
       if(number>0){
         for(int k=number+2; k<check.length() ; k++){
            if (check.charAt(k) == '.') {
             number2=k;
           }
         }
       }
       if(number2>0){
         for(int l=number2+1; l<check.length() ; l++){
           if ((check.codePointAt(l) >= 65 && check.codePointAt(l) <= 90) || 
                            (check.codePointAt(l) >= 97 && check.codePointAt(l) <= 122)) {
             condition=true;
           }
         }
       }
     }
     if(condition==true){
       count ++;
     }
   }
   System.out.println(count);
  }
}
         
       
             
       
             
             
           
           
         
       
       
           
       
     
   
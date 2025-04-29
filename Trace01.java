public class Trace01{ 
     public static void main(String[] args) {
             String course = "";
       int i = 2, j = 0, k = 18;
             course = "-->cse";
             while (i< 5) {  
                  k--;
                  j = k;
               while (j > 12 ) {
                     if (j % 2 != 0) {
                           course += "<--";
                           course =  course + i + (j / 2);
                     } else {
                              course += "-->";
                           course =  course + (i % 2) + j;
                     }
                        System.out.println(course);
                     if (j == 14) {
                              course = "-->cse";
                        }     
                     --j;
                  }
                  i++;
         }
  }
}

public class Recurtion{
  public static int print_reverse(int a){
    if(a==1){
      System.out.println(a);
      return 1;
    }
    else{
      System.out.println(a);
      return print_reverse (a-1);
    }
  }
  public static void main(String [] args){
    print_reverse (9);
    //System.out.println(print_reverse (9));
  }
}
    
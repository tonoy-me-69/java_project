public class TriangleTester{
 public static void main(String args[]){
   Triangle t1 =  new Triangle(4, 4, 4);
   Triangle t2 =  new Triangle(4, 5, 6);
   Triangle t3 =  new Triangle(4, 5, 6);
   Triangle t4 =  new Triangle(5, 4, 6);

   t1.triangleDetails();
   System.out.println("--------1--------");
   System.out.println(t1.printTriangleType());
   System.out.println("--------2--------");
   t3.triangleDetails();
   System.out.println(t3.printTriangleType());
   System.out.println("--------3--------");
   t4.triangleDetails();
   System.out.println(t4.printTriangleType());
   System.out.println("--------4--------");
   t2.compareTrinagles(t3);
   System.out.println("--------5--------");
   t1.compareTrinagles(t2);
   System.out.println("--------6--------");
   t1 = t2;
   t1.compareTrinagles(t2);
   System.out.println("--------7--------");
   t3.compareTrinagles(t4);
 }
}

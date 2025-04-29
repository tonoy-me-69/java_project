public class Circle extends Shape {
    public double radius;
    
    public void area(){
      double area= Math.PI* radius* radius;
      System.out.printf("Area of %s %s: %.2f\n", color, name, area);
    }
}
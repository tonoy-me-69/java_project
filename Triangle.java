public class Triangle{
  int side1, side2, side3;
  
  public Triangle(int s1,int s2, int s3){
    side1=s1;
    side2=s2;
    side3=s3;
  }
  public void triangleDetails(){
    System.out.println("Three sides of the triangle are: " + side1+ " ,"+side2+" ,"+side3);
    System.out.println("Perimeter: " + (side1+side2+side3));
  }
  public String printTriangleType(){
    if (side1==side2 && side2==side3){
      return "This is an Equilateral Triangle.";
    }
    else{
      return "This is a Scalene Triangle.";
    }
  }
  public void compareTrinagles(Triangle t){
    if(this==t){
      System.out.println("These two triangle objects have the same address.");
    return;
    }
    
    boolean sameSide=false;
    if( side1==t.side1 && side2==t.side2 && side3==t.side3){
      sameSide=true;
    }
    boolean samePerimeter=false;
    if( (side1 + side2 + side3) == (t.side1 + t.side2 + t.side3)){
      samePerimeter=true;
      //System.out.println("Same perimeter" + samePerimeter);
    }
    if(sameSide==true){
       System.out.println("Addresses are different but the sides of the triangles are equal.");
    }
    else if(samePerimeter==true){
      System.out.println("Only the perimeter of both triangles is equal.");
    }
    else{
      System.out.println("Addresses, length of the sides and perimeter all are different.");
    }
  }
}

    

    
    
  
public class CSEStudent extends Student{
  private static int studentCount = 0;
  private static String [] labCourses= { "CSE110", "CSE111", "CSE220", "CSE221" };
  
  public CSEStudent(String n, int i){
    super(n,i);
    studentCount++;
  }
  
  public static void details(){
    System.out.println("Total CSE Students: " + studentCount);
    System.out.println("Available Lab Based Courses: ");
    for(String course : labCourses){
      System.out.print(course + " ");
    }
    System.out.println();
  }
  
  public void addLabBasedCourse(String course) {
    boolean valid= false;
    for(String c: labCourses){
      if(c.equals(course)){
        valid=true;
        break;
      }
    }
    if(valid){
      courses+=course+ " ";
    }
    else{
      System.out.println("It is not a lab based course!");
    }
  }
}
  
  
public class Teacher{
  String name;
  String initial;
  Course[] courseList = new Course[3];
  int count=0;
  
  public Teacher(String name, String initial){
    this.name=name;
    this.initial=initial;
    System.out.println("A new teacher has been created");
  }
  
  public void addCourse(Course courseCode){
    if(count<3){
      courseList[count]=courseCode;
      count++;
    }
  }
  
  public void printDetail(){
    System.out.println("Name: " + name);
    System.out.println("Initial: " + initial);
    System.out.println("List of courses:");
    for(int i=0; i<count; i++){
      System.out.println(courseList[i].courseCode);
    }
  }
}
    
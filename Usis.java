public class Usis{
  public int total_advisee=0;
  public Student[] advisees= new Student[5];
    
  public Usis(){
  System.out.println(" Usis is ready to use!");
  }
  
  public void login(Student advisee){
    if(advisee.email == null || advisee.password ==null){
      System.out.println("Email and password need to be set.");
    }
    else{
      System.out.println("Login successful");
    }
  }
  
  public void advising(Student advisee){
    if(advisee.email == null || advisee.password ==null){
      System.out.println("Please login to advise courses");
    }
    else{
      System.out.println("You haven't selected any courses.");
    }
  }
  public void advising(Student advisee, String courses1, String courses2, String courses3, String courses4){
    System.out.println("You need special approval to take more than 3 courses.");
  }
  
  public void advising(Student advisee, String courses1, String courses2, String courses3){
    System.out.println("Advising successful!");
    advisee.courses[0]= courses1;
    advisee.courses[1]=courses2;
    advisee.courses[2]=courses3;
    advisees[total_advisee]=advisee;
    total_advisee++;
     //System.out.println(total_advisee);
  }
  
  public void allAdviseeInfo(){
     System.out.println("Total Advisee: " + total_advisee);
     
     for(int i=0; i<total_advisee; i++){
       System.out.print("Name: " + advisees[i].name+"  ");
       System.out.print("ID: " + advisees[i].id);
       System.out.println();
       System.out.println("Department: " + advisees[i].department);
       System.out.println("Advised Courses:");
       for(int j=0; j<3 ; j++){
         System.out.print(advisees[i].courses[j]+ " ");
       }
       System.out.println();
     }
  }
}
       
  
  
  
  
  
      
    
  
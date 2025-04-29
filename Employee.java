public class Employee{
  public String name;
  public double salary=30000.0;
  public String designation="junior";
  
  public void newEmployee(String name){
    this.name= name;
  }
  public void displayInfo(){
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary+" Tk");
    System.out.println("Employee Designation: " + designation);
  }
  public void calculateTax(){
    if(salary>=80000){
      System.out.println(name+ " Tax Amount: "+ (salary*30)/100+" Tk");
    }
    else{
      System.out.println("No need to pay tax");
    }
  }
  public void promoteEmployee(String designation){
    this.designation= designation;
    if(designation.equals("lead")){
      System.out.println(name+" has been promoted to " +designation);
      this.salary=80000.0;
      System.out.println("Employee Salary: " + salary+" Tk");
    }
    if(designation.equals("manager")){
      System.out.println(name+" has been promoted to " +designation);
      this.salary=105000.0;
      System.out.println("Employee Salary: " + salary+" Tk");
    }
  }
}
    
      
      
      
    
    
    
    
    
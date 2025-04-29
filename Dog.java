public class Dog extends Animal{
  public String name;
  
  public String getName(){
    return name;
  }
  public void updateSound(String newSound){
    sound=newSound;
  }
  
  @Override
  public void details(){
    if(name==null || name.isEmpty()) {
      System.out.println("The dog says hello!");
    }
    else{
      System.out.println("Name: " + name);
    }
    super.details();
  }
    
}

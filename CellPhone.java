public class CellPhone{
  public String model="unknown";
  public String [] storeContact= new String[3];
  
  int index=0;
  //int value=1;
  public void storeContact(String a){
    if(index<3){
      System.out.println("Contact Stored");
      storeContact[index]=a;
      index++;
      //value++;
    }
    else{
       System.out.println("Memory full. New contact can't be stored.");
  }
  }
  public void printDetails(){
    System.out.println("Phone Model " + model);
    System.out.println("Contacts Stored " + index);
    System.out.println("Stored Contacts: ");
    for(int i=0; i<index; i++){
      System.out.print(storeContact[i]);
      System.out.println();
    }
  }
}
      
    
    
  
  

  
  
  
    
public class CustomerService{
  private String [] customer;
  private int count=0;
  private int currentcustomer=0;
  private int size=0;
  
  public CustomerService(int a){
    count=a;
    customer = new String [a];
  }
  
  public void serveCustomer(){
    if(size==0){
      System.out.println("No customers to serve");
      return;
    }
    //if(currentcustomer>=count){
     // System.out.println("No customers to serve");
     // return;
   // }
    
    System.out.println("Serving " +customer[currentcustomer]);
    currentcustomer = (currentcustomer + 1) % count;
    size--;
  }
  
  public void addCustomer(String name){
    if(size<count){
      int insertPos = (currentcustomer + size) % count;
      customer[insertPos] = name;
      size++;
      System.out.println("Added: " + name);
    }
    else{
      System.out.println("Queue is full. Cannot add " + name);
    }
  }
}
    
    
  
  

  
    
    
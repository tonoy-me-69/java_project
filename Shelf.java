public class Shelf{
  public int capacity=0;
  public int book=0;
  
  public void showDetails(){
    System.out.println("Shelf capacity: " + capacity);
    System.out.println("Number of books: " + book);
  }
  public void addBooks(int add){
    if(capacity==0){
      System.out.println("Zero capacity. Cannot add books.");
    }
    else if(add+book<=capacity){
      this.book+=add;
      System.out.println(add+ " books added to shelf");
    }
    else{
      System.out.println("Exceeds capacity");
    }
  }
}
      
      
      

      
  
    
    
  
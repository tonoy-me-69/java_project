public class Library{
  public int capacity;
  public int books;
  public String [] book_list;
  //public int index=0;
  
  public void setBookCapacity(int capacity){
    book_list=new String [capacity];
    this.capacity=capacity;
  }
  
  public void addBook(String book_name){
    if(capacity==books){
      System.out.println("Exceeds maximum capacity. You can't add more than " +capacity+ " books");
    }
    else{
    book_list[books]=book_name;
    books++;
    //index++;
    System.out.println("Book '"+book_name+"' added to the library");
  }
  }
  public void printDetail(){
    System.out.println("Maximum Capacity: " + capacity);
    System.out.println("Total Books: " + books);
    System.out.println("Book list: ");
    for(int i=0; i<books; i++){
      System.out.println(book_list[i]);
    }
  }
}
      
  
  
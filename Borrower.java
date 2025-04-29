public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  
  public static void bookStatus(){
    System.out.println("Available Books:");
    for(int i=0; i<book_name.length; i++){
      System.out.println(book_name[i]+" :"+book_count[i]);
    }
  }
  
  private String name;
  private String [] borrowed_book_name= new String[3];
  private int count=0;
  public int index=-1;
  
  public Borrower(String name){
    this.name=name;
  }
  public void borrowBook(String book){
    for(int i=0; i<3; i++){
      if(book_name[i].equals(book)){
        index=i;
        break;
      }
    }
    if(index !=-1 && book_count[index]>0){
      if(count<3){
        borrowed_book_name[count] = book;
        count++;
        book_count[index]--;
      }
      else{
        System.out.println("This book is not available.");
      }
    }
  }
  
  public static int remainingBooks(String a){
    for(int i=0; i<3; i++){
      if(book_name[i].equals(a)){
        return book_count[i];
      }
    }
        return 0;
    }
  
  
  public void borrowerDetails(){
    System.out.println("Name: " + name);
    System.out.println("Books Borrowed: ");
    for (int i = 0; i < count; i++) {
      System.out.println(borrowed_book_name[i]);
    }
  }
}
  
      
    
    
    
        
        
    
  
  
    

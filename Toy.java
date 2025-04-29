public class Toy{
  public String name;
  public int price;
  int count=0;
  public Toy(String name, int price){
    count++;
    if(count>0){
      this.name=name;
      this.price=price;
      System.out.println("A new toy has been made!");
    }
    else{
      this.name=name;
      this.price=price;
    }  
  }
  public void updatePrice(int price){
    this.price=price;
  }
  public void showPrice(){
    System.out.println("price: "+this.price+ " Taka");
  }
  public void updateName(String name){
    System.out.println("Changing old name: "+this.name);
    this.name=name;
    System.out.println("new name: " +this.name);
  }
}
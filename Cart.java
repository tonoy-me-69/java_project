public class Cart{
  public int cart_no=0;
  public String [] cart_item=new String [3];
  public double [] prices=new double [3];
  public int discount=0;
  public double total_price=0.0;
  public int index=0;
  
  public void create_cart(int cart_no){
    this.cart_no=cart_no;
  }
  public void addItem(String cart_item, double price){
    if(index<3){
      this.cart_item[index]=cart_item;
      this.prices[index]=price;
      total_price+=price;
      index++;
      System.out.println(cart_item+"  added to cart "+cart_no+".");
      System.out.println("You have "+index+" item(s) in your cart now.");
  }
    else{
      System.out.println("You already have 3 items on your cart");
    }
  }
  public void addItem(double price, String cart_item){
    addItem(cart_item, price);
  }
  public void giveDiscount(int discount) {
    this.discount = discount;
  }
  public void cartDetails(){
    System.out.println("Your cart(c"+cart_no+")");
    for(int i=0; i<index; i++){
      System.out.println(cart_item[i]+ " - "+prices[i]);
    }
    System.out.println("Discount Applied: " +discount+".0%");
    total_price=total_price-(total_price*discount)/100;
    System.out.println("Total price: " +total_price);
  }
}
    
    
  
  
    
    
  
  
  
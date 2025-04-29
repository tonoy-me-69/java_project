public class cd1 extends Product{
  private String band;
  private int duration;
  private String genre;
  
  public void CD(int id, String title, int price, String band, int duration, String genre){
    super(id, title,price);
    this.band=band;
    this.duration=duration;
    this.genre=genre;
  }
  public String printDetails(){
    return getIdTitlePrice() + "\nBand: " + band + " Duration: " + duration + " minutes Genre: " + genre;
  }
}
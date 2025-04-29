public class Cricket_Tournament extends Tournament{
  private int noOfTeams;
  private String type;
  
  public Cricket_Tournament(){
    super();
    this.noOfTeams=0;
    this.type="No type";
  }
  
  public Cricket_Tournament(String name, int numberOfTeams, String type) {
    super(name);
    noOfTeams=numberOfTeams;
    this.type=type;
  }
  public String detail() {
     return "Cricket Tournament Name: " + getName() + "\n" +
       "Number of Teams: " + noOfTeams + "\n" +
       "Type: " + type;
  }
}
  
class Player extends SportsPerson{
  private int totalGoal;
  private int totalMatch;
  private double goalRatio;
  
  public Player(String teamName, String name, String role, int totalGoal, int totalMatch) {
    super(teamName, name, role);
    this.totalGoal = totalGoal;
    this.totalMatch = totalMatch;
    
  }
  
  public void calculateRatio() {
    this.goalRatio = (double) totalGoal / totalMatch;
  }

public void calculateEarnings() {
  earningPerMatch = (totalGoal * 1000) + (totalMatch * 10);
}

public void printDetails() {
  calculateEarnings();
  System.out.println(getNameTeam());
  System.out.println("Team Role: " + role);
  System.out.println("Total Goal: " + totalGoal + ", Total Played: " + totalMatch);
  System.out.println("Goal Ratio: " + String.format("%.2f", goalRatio));
  System.out.println("Match Earning: " + earningPerMatch + "K");
}
}



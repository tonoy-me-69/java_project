class Manager extends SportsPerson {
  private int matchWin;
  
  public Manager(String teamName, String name, String role, int matchWin) {
    super(teamName,name, role);
    this.matchWin=matchWin;
  }
  
  public void calculateEarnings() {
    earningPerMatch = matchWin * 1000;
  }
  
  public void printDetails() {
    calculateEarnings();
    System.out.println(getNameTeam());
    System.out.println("Team Role: " + role);
    System.out.println("Total Win: " + matchWin);
    System.out.println("Match Earning: " + earningPerMatch + "K");
  }
}
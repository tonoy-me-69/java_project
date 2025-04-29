public class BankAccount{
  public int AccountNo=0;
  public String Type="Not Set";
  
  public String printDetails(){
    return "AccountNo: " +AccountNo + "\nType: " +Type;
  }
  
  public void setInfo(int AccountNo, String Type){    
    this.AccountNo=AccountNo;
    this.Type=Type;
    System.out.println("Account information updated!");
  }
}
  
                         
    
    
  
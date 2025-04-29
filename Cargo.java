public class Cargo {
  
  private static double capacity = 10.0;
  private static int count = 1;
  
  private int id;
  private String content;
  private double weight;
  private boolean isloaded = false;
  
  public Cargo(String content, double weight) {
    this.content = content;
    this.weight = weight;
    this.id = count++;
  }

  public void details() {
    System.out.println("Cargo ID: " + id + ", Contents: " + content +
                       ", \nWeight: " + weight + ", Loaded: " + isloaded);
  }

  public static double capacity() {
    return capacity;
  }

  public void load() {
    if (isloaded == false && weight <= capacity) {
      isloaded = true;
      capacity = capacity - weight;
      System.out.println("Cargo " + id + " loaded for transport.");
    } else {
      System.out.println("Cannot load cargo, exceeds weight capacity.");
    }
  }

  public void unload() {
    if (isloaded == true) {
      isloaded = false;
      capacity += weight;
      System.out.println("Cargo " + id + " unloaded.");
    }
  }
}

  
        
        
      
    
    
  
  
  
  
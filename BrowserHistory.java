public class BrowserHistory {
    private String[] history;
    private int capacity;
    private int currentIndex = -1;
    public int count = 0;

    public BrowserHistory(int a){
      
      capacity = a;
      history = new String[a];
    }

    public void showHistory(){
      if (count <= 0){ 
        System.out.println("No web pages visited yet.");
        return;
        }
      
      System.out.println("Browser History:");
      for (int i = 0; i < count; i++) {
        System.out.println(history[i]);
        }
    }

    public void visitWeb(String b) {
        if (count < capacity) {
            history[count] = b;
            count++;
            currentIndex++;
            System.out.println("Visited: " + b);
            return;
        }
        System.out.println("History is full. Cannot visit " + b + " web page.");
    }

    public void currentWeb() {
        if (currentIndex == -1) {
            System.out.println("You have not visited any website yet!");
            return;
        }
        System.out.println("Current web page: " + history[currentIndex]);
    }

    public void back() {
        if (currentIndex == -1) {
            System.out.println("No pages to go back to.");
        } else {
            history[currentIndex] = null;
            currentIndex--;
            count--;
        }
    }
}

    
  
    
    
  
  
      
    
      
  
    
  
  
  
  
public class Playlist{
  String playList_name;
  String name=playList_name;
  Song start;
  
  public Playlist(String playList_name){
    this.playList_name=playList_name;
    this.start=null;
    System.out.println(playList_name + " created");
  }
  public void info(){
    System.out.println(playList_name +" has the following songs:");
    if(start == null){
      System.out.println("No songs in " + playList_name + ".");
      return;
    }
    else{
      Song current= start;
      int song_number = 1;
      
      while(current!=null){
        System.out.println("Song-" + song_number);
        current.songInfo();
        current= current.next;
        song_number++;
      }
    }
      
  }
  
  public void addSong( Song s){
    if(start== null){
      start=s;
    }
    else{
      Song current= start;
      while(current.next !=null){
        current= current.next;
      }
      current.next=s;
    }
    System.out.println(s.title + " added to " + playList_name + ".");
  }
  public void addSong(Song s, int position){
    if(position==0){
      s.next=start;
      start=s;
      System.out.println(s.title + " added to " + playList_name + ".");
    }
    else{
        Song current = start;
        for (int i = 0; i < position - 1 && current != null; i++) {
          current = current.next;
        }
        if (current == null || current.next == null) {
          System.out.printf("Cannot add song to Index %d.\n", position);
          return;
        }
        else{
          s.next=current.next;
          current.next=s;
          System.out.printf("%s not found in %s.\n", s.title, playList_name);
        }
    }
  }
  public void playSong(String title){
    Song current=start;
    while(current!=null){
      if(current.title.equals(title)){
      System.out.printf("Playing %s by %s\n", current.title, current.artist);
      return;
    }
      current=current.next;
    }
    System.out.printf("%s not found in %s.\n", title, playList_name);
    
    }
  public void playSong(int position){
    Song current=start;
    int index=0;
    while(current!=null){
      if(index==position){
        System.out.printf("Playing %s by %s\n", current.title, current.artist);
        return;
      }
      current=current.next;
      index++;
  }
     System.out.printf("Song at index %d not found in %s\n", position, playList_name);
  }
  public void deleteSong(String title){
    if(start==null){
      System.out.printf("%s not found in %s.\n", title, playList_name);
      return;
    }
    if(start.title.equals(title)){
      start=start.next;
      System.out.printf("%s not found in %s.\n", title, playList_name);
      return;
    }
    Song current = start;
         while (current.next != null) {
             if (current.next.title.equals(title)) {
                 current.next = current.next.next;
                 System.out.printf("%s deleted from %s.\n", title, playList_name);
                 return;
             }
             current = current.next;
         }
         System.out.printf("%s not found in %s.\n", title, playList_name);
     }
  public int totalSong(){
    int count=0;
    Song current=start;
    while(current !=null){
      count++;
      current=current.next;
    }
    return count;
  }
  public void merge(Playlist p){
    if(p.start==null){
      return;
    }
    if(start==null){
      start=p.start;
    }
    else{
      Song current=start;
      while(current.next!=null){
        current=current.next;
      }
      current.next=p.start;
    }
    System.out.println("Merge completed!");
  }
    
    
}

    
      


  
           
         
  
  


  

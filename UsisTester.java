public class UsisTester {
  public static void main(String[] args) {
    Student rakib = new Student("Rakib", 12301455, "CSE");
    Student roy = new Student("Roy", 12501345, "CS");
    System.out.println("1*************");
    Usis usisObj = new Usis();
    System.out.println("2*************");
    usisObj.login(rakib);
    System.out.println("3*************");
    usisObj.advising(rakib);
    System.out.println("4*************");
    rakib.email = "rakib@hotmail.com";
    rakib.password = "1234";
    System.out.println("5*************");
    usisObj.login(rakib);
    System.out.println("6*************");
    usisObj.advising(rakib);
    System.out.println("7*************");
    usisObj.advising(rakib, "CSE110", "PHY111", "MAT110", "CSE260");
    System.out.println("8*************");
    usisObj.advising(rakib, "CSE110", "PHY111","MAT110");
    System.out.println("9*************");
    usisObj.allAdviseeInfo();
    System.out.println("10*************");
    roy.email = "roy@hotmail.com";
    roy.password = "abcd";
    usisObj.login(roy);
    System.out.println("11*************");
    usisObj.advising(roy, "CSE110", "ENG101", "PHY112");
    System.out.println("12*************");
    usisObj.allAdviseeInfo();
  }
}




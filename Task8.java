import java.util.Scanner;
public class Task8{
  public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    
    System.out.println("Enter the row the array");
    int row=sc.nextInt();
    System.out.println("Enter the column of the array");
    int column=sc.nextInt();
    
    int[] [] array= new int[row][column];
    int length= row*column;
    int [] oneD_array= new int[length];
    
    System.out.println("Enter the array elements");
    
    for(int i=0; i<row; i++){
      for(int j=0; j<column; j++){
        array[i][j]=sc.nextInt();
      }
    }
    System.out.println("2D Array");
    
    for(int i=0; i<row; i++){
      for(int j=0; j<column; j++){
        System.out.print(array[i][j]+" ");
      }
      System.out.println();
    }
    
    int k=0;
    
    for(int i=0; i<row; i++){
      for(int j=0; j<column; j++){
        oneD_array[k]=array[i][j];
        k++;
        }
      }
    
    
    //System.out.println();
    
    System.out.println("1D Array");
    
    for(int i=0; i<length; i++){
     System.out.print(oneD_array[i]+" ");
    }
  }
}
          
    
        
    
    
      
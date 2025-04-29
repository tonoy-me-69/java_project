public class spiralTraversal{
  
  public static void spiralTraversal(int [] []B){
    int row=B.length;
    int column=B[0].length;
    for(int i=0; i<row ; i++){
      System.out.print(B[i][0]+" ");
    }
    for(int j=1; j<column ; j++){
      System.out.print(B[0][j]+" ");
    }
    for(int i=row-2; i<=0 ; i--){
      System.out.print(B[i][column-1]+" ");
    }
  }
    
    
  public static void main(String [] args){
    int[][] A ={{1,2,3},{4,5,6},{7,8,9}};
    spiralTraversal(A);
  }
}
    
    
    
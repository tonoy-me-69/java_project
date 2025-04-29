public class TransposeMatrix{
  
  public static int[][] Transpose (int [] [] matrix){
    int[][] B= new int [matrix[0].length][matrix.length];
    int row=matrix.length;
    //System.out.println(row);
    int column=matrix[0].length;
    //System.out.println(column);
    for(int i=0; i<column; i++){
      for(int j=0; j<row; j++){
        B[i][j]=matrix[j][i];
      }
    }
    return B;
  }
  public static void PrintMatrix(int [] [] matrix){
    for(int i=0; i<matrix.length ; i++){
      for(int j=0; j<matrix[0].length ; j++){
        System.out.print (matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
    
  public static void main(String [] args){
     int[][] A ={{1,2},{3,4},{5,6}};
     System.out.println("Transpose Matrix ");
     PrintMatrix(Transpose(A));
  }
}
     
     
    
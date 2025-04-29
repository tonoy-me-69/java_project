public class SumofBoundary{
  public static int SumofBoundary(int [][] matrix){
    int row=matrix.length;
    int column=matrix[0].length;
    int sum=0;
    for(int i=0; i<row; i++){
      for(int j=0; j<column; j++){
        if (i == 0 || i == row - 1 || j == 0 || j == column - 1) { 
        sum+=matrix[i][j];
      }
    }
    }
    return sum;
  }
        
    
  public static void main(String [] args){
    int[][] A = {{11,22,33,44},{55,66,77,88}, {1,2,3,4}};
    System.out.println(SumofBoundary(A));
  }
}
    
  
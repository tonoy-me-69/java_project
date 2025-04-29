public class matrixMultiplication{
  
      public static int[][] multiplication(int[][] matrixA, int[][] matrixB) {
        int rowA = matrixA.length;        // Rows of matrix A
        int colA = matrixA[0].length;     // Columns of matrix A
        int rowB = matrixB.length;        // Rows of matrix B
        int colB = matrixB[0].length;     // Columns of matrix B
        
        // Initialize result matrix C with appropriate size
        int[][] C = new int[rowA][colB];

        // Perform matrix multiplication
        for (int i = 0; i < rowA; i++) {  // Loop over rows of A
            for (int j = 0; j < colB; j++) {  // Loop over columns of B
                for (int k = 0; k < colA; k++) {  // Loop over common dimension (columns of A or rows of B)
                    C[i][j] += matrixA[i][k] * matrixB[k][j];  
        }
      }
    }
    return C;
  }
  
  public static void printMatrix(int [] [] matrix){
    for(int i=0; i<matrix.length ; i++ ){
      for(int j=0; j<matrix[0].length ; j++){
       System.out.print(matrix[i][j]+" ");
      }
      System.out.println(); 
    }
  }
    
  
  public static void main(String [] args){
    int[][] A ={{1,2},{3,4},{5,6}};
    int[][] B = {{1,2,3},{4,5,6}};
    int[][] C = multiplication(A,B);
    printMatrix(C);
  }
  }
    
    

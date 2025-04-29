public class matrixAddition{
  
  public static int[][]addition(int[][] A,int[][] B){
    int[][] C = new int [A.length][A[0].length];
    for(int i=0; i<A.length ; i++ ){
      for(int j=0; j<A[0].length ; j++){
        C[i][j]+= A[i][j]+ B[i][j];
      }
    }
    return C;
  }
  
  public static void Print( int[][] C){
    for(int i=0; i<C.length ; i++ ){
      for(int j=0; j<C[0].length ; j++){
       System.out.print(C[i][j]+" ");
      }
      System.out.println(); 
    }
  }
  
  public static void main(String [] args){
    int[][] A = {{1,2}, {3,4}};
    int[][] B = {{5,6}, {7,8}};
    
    int [][]C= addition(A,B);
    System.out.println("Resultant Matrix:");
    Print(C);
  }
}
    
    
    
    
    
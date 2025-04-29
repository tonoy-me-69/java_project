public class bubble_sort {

    public static void main(String[] args) {
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        for(int i= 0; i<array.length-1 ; i++){
          for(int j=i+1; j<array.length ; j++){
            if(array [j]< array[i]){
              int temp=array[i];
              array[i]=array [j];
              array [j]=temp;
            }
          }
        }
              
              
           
    for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
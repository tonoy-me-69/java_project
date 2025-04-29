public class selction_sort {

    public static void main(String[] args) {
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        for(int i= 0; i<array.length-1 ; i++){
          int min=i;
          for(int j=i+1; j<array.length ; j++){
            if(array [j]< array[min]){
              min=j;
            }
          }
          int temp= array [i];
          array [i]=array[min];
          array[min]=temp;
        }
    for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
          
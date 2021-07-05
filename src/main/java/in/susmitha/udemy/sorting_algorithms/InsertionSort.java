package in.susmitha.udemy.sorting_algorithms;

public class InsertionSort {
    public static void main( String[] args ) {
        InsertionSort insert = new InsertionSort();
        int[] arr1 = {100,65,27,92,82,39,35};
        insert.insertionSort(arr1);
    }
    public void insertionSort(int[] arr1){

        for(int i=1;i< arr1.length;i++){
            int n = arr1[i];
            int j=i;
            while(j>0 && arr1[j-1]>n){
                arr1[j] = arr1[j-1];
                j=j-1;
            }
            arr1[j] = n;
        }
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }

}
